<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Idyllwild Hiking Trails</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="nav.jsp" />

	<div class="container-fluid">
		<br>
		<h1>Idyllwild Trails</h1>

		<h3>Select a trail below to Read, Update or Remove</h3>


		<h4>
			<a class="text-decoration-none" href="addTrail.do">Add a Trail</a>
		</h4>
		<c:choose>
			<c:when test="${! empty trail}">
				<table id="homeTable" class="table table-striped table-hover">
					<thead>
						<th>Trail ID & Name</th>
						<th>Length</th>
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