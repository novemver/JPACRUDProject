<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Idyllwild Hiking Trails</title>
<jsp:include page="bootstrapHead.jsp"/>
</head>
<body>
<jsp:include page="nav.jsp"/>

<div class="container-fluid">
	<h1>Idyllwild Trails</h1>

	<form action="display.do" method="GET">
		Trail ID: <input type="text" name="id" /> 
		<input class="btn btn-primary" type="submit" value="See Trail" />
	</form> 
	<h4> <a href="addTrail.do">Add a Trail</a> </h4>

	
<c:choose>
<c:when test="${! empty trail}">
	<table class="table table-striped table-hover">
		<thead>
			<th>Trail ID</th>
			<th>Trail Name</th>
		</thead>
		<tbody>
			<c:forEach items="${trail}" var="trail">
			<tr>
				<td>${trail.id}</td>
				<td> <a href="display.do?id=${trail.id }">${trail.name} </a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>


    	
    </c:when>
     <c:otherwise>
      <p>Trail not found</p>
      <a href="home.do">Hike back to menu</a> 
    </c:otherwise>
</c:choose>
</div>
<%-- 	<c:choose>
		<c:when test="${empty trail }">No trails found.</c:when>
		<c:otherwise>
			<c:forEach var="trail" items="${trails }">
				<li>${trails.id }${trails.name }</li>
			</c:forEach>
		</c:otherwise>
	</c:choose> --%>



<jsp:include page="bootstrapFoot.jsp"/>
</body>
</html>