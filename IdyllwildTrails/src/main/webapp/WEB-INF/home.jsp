<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trail CRUD</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="nav.jsp" />

	<div class="container-fluid">
		<br>
		<h1>Trail CRUD</h1>

		<h4>Trails in and near Idyllwild, CA</h4>
		<br>
		<h3><a class="text-decoration-none" href="addTrail.do">Add a Trail</a>  to create a new trail</h3>
		<h3> Select name below to update or remove trail</h3>
		
		<br>
		<c:choose>
			<c:when test="${! empty trail}">
				<table id="homeTable" class="table table-striped table-hover">
					<thead>
						<th>Trail ID & Name</th>
						<th>Distance</th>
						<th>Max Elevation</th>
					</thead>
					<tbody>
						<c:forEach items="${trail}" var="trail">
							<tr>
								<td><a class="text-decoration-none"
									href="display.do?id=${trail.id }">${trail.id}.
										${trail.name} Trail</a></td>
								<td>${trail.distance} miles</td>
								<td>${trail.maxElevation} ft</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<form action="display.do" method="GET">
					Trail ID: <input type="text" name="id" /> <input
						class="btn btn-primary" type="submit" value="See Trail" />
				</form>



			</c:when>
			<c:otherwise>
				<p>Trail not found</p>
				<a href="home.do">Hike back to menu</a>
			</c:otherwise>
		</c:choose>
	</div>

	<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>