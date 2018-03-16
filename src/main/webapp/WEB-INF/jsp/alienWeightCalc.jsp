<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />



<section class="centeredPanel">
	<h1 class="centered">Alien Weight Calculator</h1>
	<c:url var="formAction" value="/alienWeightCalcOutput" />
	<form method="GET" action="${formAction}">
		<div>
			<label for="choosePlanet">Choose a planet</label> <select
				name="choosePlanet" id="choosePlanet">
				<option value="Mercury">Mercury</option>
				<option value="Venus">Venus</option>
				<option value="Mars">Mars</option>
				<option value="Jupiter">Jupiter</option>
				<option value="Saturn">Saturn</option>
				<option value="Uranus">Uranus</option>
				<option value="Neptune">Neptune</option>
			</select>

		</div>

		<div>
			<label for="userEarthWeight">Enter your Earth weight</label> <input
				type="text" name="userEarthWeight" id="userEarthWeight"> <input
				type="submit" value="Calculate Weight" />
		</div>

	</form>





</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />