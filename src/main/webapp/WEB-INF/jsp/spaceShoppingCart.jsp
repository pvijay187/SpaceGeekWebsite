<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<section class="centeredPanel">
	<h1 class="centered">Solar System Geek Shopping Cart</h1>
	

	<div class="shoppingCartGrid" >
		<div 
			>
			<div style="margin-right: 5%;"></div>
			<div>Name</div>
			<div>Price</div>
			<div>Qty.</div>
			<div>Total</div>
		</div>
		<div>
		<c:forEach items="${shoppingCart.allCartItems}" var="item">
		
			<div>
				<img src="img/${item.product.imageName}" width="100%"/>
			</div>
			<div>
				<c:out value="${item.product.name}" />
			</div>
			<div>
				<c:out value="${item.product.price}" />
			</div>
			<div>
				<c:out value="${item.quantity}" />
			</div>

			<div>
				<c:out value="${item.productPriceTotal}" />
			</div>
		
</c:forEach>


		</div>
	</div>
	<div style="display: flex; align-items: flex-end; justify-content: flex-end; ">
	<label >Grand Total</label>
	<c:out value="${shoppingCart.shoppingCartTotal}"/>
	</div>













</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />