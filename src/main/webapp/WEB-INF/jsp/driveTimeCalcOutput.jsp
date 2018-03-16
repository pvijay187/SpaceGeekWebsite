<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<section class="centeredPanel">
	<h1 class="centered">Drive Time Calculator</h1>
<div class="displayGrid">
	<div class="planets">
		<img src="img/${planetKey.imgName}" />
	</div>
	<div class="returnText">
		Traveling by
		<c:out value="${param.chooseTransportation}" />
		you will reach
		<c:out value="${param.choosePlanet}" />
		in
		<c:out value="${travelKey}" />
		years. You will be
		<c:out value="${ageKey}" />
		years old.
	</div>
</div>







</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />