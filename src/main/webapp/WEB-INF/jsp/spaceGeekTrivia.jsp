<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<c:import url="/WEB-INF/jsp/common/header.jsp" />


<section class="centeredPanel">
	<h1 class="centered">Space Geek Trivia</h1>
	<c:url var="formAction" value="/spaceGeekTrivia" />
	<form method="POST" action="${formAction}">
		<div>
			<label for="username">Enter your name</label> <input type="text"
				name="username" id="username">
		</div>
		<div>
			<label for="answer">Who first walked on the moon?</label> 
			<input TYPE="radio" name="answer" value="0" /> Tom Hanks
			<input TYPE="radio" name="answer" value="1" /> Neil Armstrong
			<input TYPE="radio" name="answer" value="2" /> Jim Lovell
			<input type="submit" value="Submit" />
		</div>

	</form>

















</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />