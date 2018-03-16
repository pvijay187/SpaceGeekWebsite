<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<section class="centeredPanel">
<h1 class="centered">New Geek Post</h1>
	<form method="POST" action="${formAction}">
		<div>
			<label for="username">Username</label> 
			<input type="text" name="username" id="username">
		</div>
		<div>
			<label for="subject">Subject</label> 
			<input type="text" name="subject" id="subject">
		</div>
		<div>
			<label for="message">Message</label> <textarea name="message" id="message" cols="50" rows="10"></textarea> <input
				type="submit" value="Submit" />
		</div>

	</form>





</section>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />