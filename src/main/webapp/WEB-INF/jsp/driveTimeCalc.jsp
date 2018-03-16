<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<section class="centeredPanel">
	<h1 class="centered">Drive Time Calculator</h1>

	<c:url var="formAction" value="/driveTimeCalcOutput" />
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
			<label for="chooseTransportation">Choose a transportation
				method</label> <select name="chooseTransportation" id="chooseTransportation">
				<option value="Walking">Walking</option>
				<option value="Car">Car</option>
				<option value="Bullet Train">Bullet Train</option>
				<option value="Boeing 747">Boeing 747</option>
				<option value="Concorde">Concorde</option>

			</select>



		</div>
		<div>
			<label for="userEarthAge">Enter your age on Earth</label> <input
				type="text" name="userEarthAge" id="userEarthAge"> <input
				type="submit" value="Calculate Travel Time " />
		</div>

	</form>









</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />