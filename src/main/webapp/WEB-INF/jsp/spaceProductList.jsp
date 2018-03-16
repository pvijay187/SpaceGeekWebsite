<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<section class="centeredPanel">
	<h1 class="centered">Solar System Geek Gift Shop</h1>
	<h5 class="centeredCheckShopCart">
		<c:url var="spaceShoppingCart" value="/spaceShoppingCart" />
		<a href="${spaceShoppingCart}"> Check your shopping cart (<c:out value="${shoppingCart.totalCartQuantity}">items)</c:out></a>

	</h5>
	
	<div>
		<c:forEach var="productVar" items="${productsList}">

			<div class="productContainerList">

				<c:url var="productUrl" value="/spaceProductDetail">
					<c:param name="id" value="${productVar.id}" />
				</c:url>
				<div>
					<!-- image -->
					<c:url var="imageUrl" value="/img/${productVar.imageName}" />
					<a href="${productUrl}"><img src="${imageUrl}"
						style="width: 45%"></a>

				</div>
				<div>
					<!-- product info -->
					<div style="display: flex;">
						<!-- title -->
						<div style="font-size: 120; font-weight: bold;">
							<c:out value="${productVar.name}" />
						</div>


					</div>

					<div style="color: red; font-size: 120%">
						<!-- price -->
						<c:out value="$${productVar.price}" />
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />