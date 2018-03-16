<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<section class="centeredPanel">
	<h1 class="centered">Space Store</h1>
	<h5 class="centeredCheckShopCart">
		<c:url var="spaceShoppingCart" value="/spaceShoppingCart" />
		<a href="${spaceShoppingCart}">  <c:out
				value="Check your shopping cart (${shoppingCart.totalCartQuantity} items)"/> </a>

	</h5>
	<c:if test = "${not empty message}">
	<h5>
	<c:out value="${message}"/>
	</h5>
	</c:if>

	<c:url var="formAction" value="/spaceProductDetail" />
	
	<form method="POST" action="${formAction}">
		<div style="display: grid; grid-template-columns: auto auto;">
			<div class="productImage">
				<c:url var="imageUrl" value="/img/${product.imageName}" />
				<img src="${imageUrl}" />
			</div>
			<input type="hidden" name="id" value="${product.id}"/>
			<div class="rightOfImage">

				<div style="font-size: 120; font-weight: bold;">
					<c:out value="${product.name}" />
				</div>


				<div style="color: red; font-size: 120%">
					<!-- price -->
					<c:out value="$${product.price}" />
				</div>

				<div>
					<c:out value="${product.description}" />
				</div>

				<label for="quantity">Quantity to buy</label> <select
					name="quantity" id="quantity">
					<c:forEach begin="0" end="10" var="chooseQuantity">
						<option value="${chooseQuantity}"><c:out
								value="${chooseQuantity}" /></option>
					</c:forEach>
				</select> <input type="submit" value="Add to Cart" />
			</div>
		</div>
	</form>


</section>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />