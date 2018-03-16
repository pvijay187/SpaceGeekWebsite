<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<c:import url="/WEB-INF/jsp/common/header.jsp" />


<section class="centeredPanel">
	<h1 class="centered">Solar System Geek Forum</h1>

	<h3 class="centeredPostMessage">
		<c:url var="spaceForumPost" value="/spaceForumPost" />
		<a href="${spaceForumPost}"> Post a Message </a>

	</h3>
	<h3 class="centeredPostMessage">
		<c:url var="spaceGeekTrivia" value="/spaceGeekTrivia" />
		<a href="${spaceGeekTrivia}"> Are YOU a true SPACE GEEK!?!? </a>

	</h3>
	<div class="forumPostsTable">
		<c:forEach var="forumPost" items="${forumPosts}">
			<div >
				<div style="font-weight: bold;">
					<c:out value="${forumPost.subject}" />
				</div>
				<div style="margin-bottom: .5%;">
					by
					<c:out value="${forumPost.username}" />
					on
					<fmt:parseDate value="${forumPost.datePosted}" pattern="yyyy-MM-dd'T'HH:mm" var="parsedDateTime" type="both"/>
					<fmt:formatDate pattern="dd/MM/yyyy" value="${parsedDateTime}"/>
					at
					<fmt:formatDate pattern="HH:mm:ss" value="${parsedDateTime}"/>
				</div>
				
				<div>
					<c:out value="${forumPost.message}" />
				</div>
			</div>
			
		</c:forEach>

	</div>









</section>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />