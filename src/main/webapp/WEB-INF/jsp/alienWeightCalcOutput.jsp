<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />



<section class="centeredPanel">
	<h1 class="centered">Alien Weight Calculator</h1>
<div class="displayGrid">
	<div class="planets"><img src="img/${planetKey.imgName}"/></div>
	<div class="returnText">
		If you are
		<c:out value="${param.userEarthWeight}" />
		lbs on planet Earth, you would weigh
		<c:out value="${weightOutput}"/>
		lbs on
		<c:out value="${planetKey.planetName}"/>.
	</div>
</div>




</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />