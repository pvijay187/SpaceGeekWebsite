package com.techelevator.ssg.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ProductDao;
import com.techelevator.ssg.model.store.ShoppingCartItem;
import com.techelevator.ssg.model.store.ShoppingCartTotal;

@Controller
public class StoreController {

	@Autowired
	private ProductDao products;

	@RequestMapping(path = "/spaceProductList", method = RequestMethod.GET)
	public String showSpaceForum(ModelMap modelMap) {
		modelMap.put("productsList", products.getAllProducts());

		return "spaceProductList";
	}

	@RequestMapping(path = "/spaceProductDetail", method = RequestMethod.GET)
	public String showSpaceProductDetailPage(@RequestParam Long id, ModelMap modelMap) {
		for (Product p : products.getAllProducts()) {
			if (p.getId().equals(id)) {
				modelMap.put("product", p);
			}
		}

		return "spaceProductDetail";
	}

	@RequestMapping(path = "/spaceProductDetail", method = RequestMethod.POST)
	public String addToCart(@RequestParam Long id, @RequestParam Integer quantity, HttpSession session,
			RedirectAttributes flashScope) {

		// Session Get Shopping Cart
		ShoppingCartTotal sci = null;
		if (session.getAttribute("shoppingCart") == null) {
			sci = new ShoppingCartTotal();
			session.setAttribute("shoppingCart", sci);
		} else {
			sci = (ShoppingCartTotal) session.getAttribute("shoppingCart");

		}
		// Fill Shopping Cart
		Product selectedGeekToy = products.getProductById(id);
		ShoppingCartItem item = new ShoppingCartItem();
		item.setProduct(selectedGeekToy);
		item.setQuantity(quantity);
		sci.addItemToCart(item);

		// Add to Session
		session.setAttribute("shoppingCart", sci);

		if (quantity > 1) {
			flashScope.addFlashAttribute("message", "Your" + selectedGeekToy.getName() + "was added to the cart");
		} else {
			flashScope.addFlashAttribute("message",
					quantity + selectedGeekToy.getName() + "'s were added to your cart");
		}
		return "redirect:/spaceProductList";
	}

	@RequestMapping(path = "/spaceShoppingCart", method = RequestMethod.GET)
	public String showSpaceShoppingCartPage(HttpSession session) {

		return "spaceShoppingCart";
	}

}

// session.setAttribute("quantity", quantity);
// session.setAttribute("chosenProduct", selectedGeekToy);
// session.setAttribute("itemAmount", itemAmount);
// session.setAttribute("cartTotal", cartTotal);

// Map<Product, Integer> shoppingCart;
//
// if (session.getAttribute("shoppingCart") != null) {
// shoppingCart = (Map<Product, Integer>) session.getAttribute("shoppingCart");
// } else {
//
// shoppingCart = new HashMap<>();
// }
// if (shoppingCart.containsKey(selectedGeekToy)) {
// Integer quantity1 = shoppingCart.get(selectedGeekToy);
// quantity++;
// shoppingCart.put(selectedGeekToy, quantity);
// } else {
// shoppingCart.put(selectedGeekToy, 1);
// }
