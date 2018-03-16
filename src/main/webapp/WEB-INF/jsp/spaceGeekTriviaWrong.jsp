<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<c:import url="/WEB-INF/jsp/common/header.jsp" />


<section class="centeredPanel">
	<h1 class="centered">Goddammit!!!</h1>
	<div>
		<c:url var="trumpWrong"
			value="https://media.giphy.com/media/3oz8xLd9DJq2l2VFtu/giphy.gif" />
		<img src="${trumpWrong}" />
	</div>
	<div>
		<c:url var="michaelNo" value="https://media.giphy.com/media/12XMGIWtrHBl5e/giphy.gif" />
			<img src="${michaelNo}"/>
	</div>
	<div>
		<c:out value="${param.username}" />
		, there are black holes that can't even hold your stupidity.
	</div>


</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />