<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Idyllwild Hiking Trails</title>
</head>
<body>
	<h1>Idyllwild Trails</h1>


	<c:choose>
		<c:when test="${empty trail }">No trails found.</c:when>
		<c:otherwise>
			<c:forEach var="trail" items="${trails }">
				<li>${trail.id }${trail.name }</li>
			</c:forEach>
		</c:otherwise>
	</c:choose>




</body>
</html>