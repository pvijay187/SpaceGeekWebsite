<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<section class="centeredPanel">
	<h1 class="centered">Alien Age Calculator</h1>
	<div class="displayGrid">
		<div class="planets">
			<img src="img/${planetKey.imgName}" />
		</div>
		<div class="returnText">
			If you are
			<c:out value="${param.userEarthAge}" />
			years old on planet Earth, you would be
			<c:out value="${ageOutput}" />
			years old on
			<c:out value="${planetKey.planetName}" />
			.
		</div>
	</div>







</section>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />