<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Film Details</title>

<jsp:include page="../bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="../nav.jsp" />

	<div class="container">

		<h4>
			<a class="text-decoration-none" href="home.do">Hike to main menu</a>
		</h4>
		<h4>
			<a class="text-decoration-none"
				href="updateThisTrail.do?id=${trail.id }">Update ${trail.name }
				trail</a>
		</h4>
		<h4>
			<a class="text-decoration-none"
				href="removeThisTrail.do?id=${trail.id }"> Remove ${trail.name }
				trail</a>
		</h4>

		<table class="table table-translucent table-hover no-border">
			<thead>
				<th>${trail.name} Trail</th>
				<th></th>
			</thead>
			<tbody>
				<tr>
					<td>${trail.id}</td>
					<td>ID</td>
				</tr>
				<tr>
					<td>${trail.distance}</td>
					<td>Miles</td>
				</tr>
				<tr>
					<td>${trail.maxElevation}</td>
					<td>Feet</td>
				</tr>
				<tr>
					<td>${trail.elevationGain}</td>
					<td>Feet elevation gain</td>
				</tr>
				<tr>
					<td>${trail.elevationLoss}</td>
					<td>Feet elevation loss</td>
				</tr>
				<tr>
					<td>${trail.dogFriendly}</td>
					<td>Dog Friendly</td>
				</tr>
				<tr>
					<td>${trail.needPermit}</td>
					<td>Permit Required</td>
				</tr>
				<tr>
					<td>${trail.headLat}</td>
					<td>Trail Head Latitude</td>
				</tr>
				<tr>
					<td>${trail.headLong}</td>
					<td>Trail Head Longitude</td>
				</tr>
			</tbody>
		</table>
<img alt="${trail.description }" src="${trail.pic}">
	</div>

	<jsp:include page="../bootstrapFoot.jsp" />
</body>
</html>