<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trail Details</title>

<jsp:include page="../bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="../nav.jsp" />

	<div class="container">
		<br>
		<table id="urTable">
			<td><a class="text-decoration-none"
				href="updateThisTrail.do?id=${trail.id }">Update ${trail.name }
					Trail</a></td>
			<td><a class="text-decoration-none"
				href="removeThisTrail.do?id=${trail.id }"> Remove ${trail.name }
					Trail</a></td>
		</table>
		<br>
		<table id="displayTable"
			class="table table-translucent table-hover no-border">
			<thead>
				<th colspan="2">${trail.name} Trail</th>

			</thead>
			<tbody>
				<tr>
					<td>Id</td>
					<td>${trail.id}</td>
				</tr>
				<tr>
					<td>Miles</td>
					<td>${trail.distance}</td>
				</tr>
				<tr>
					<td>Feet</td>
					<td>${trail.maxElevation}</td>
				</tr>
				<tr>
					<td>Feet elevation gain</td>
					<td>${trail.elevationGain}</td>
				</tr>
				<tr>
					<td>Feet elevation loss</td>
					<td>${trail.elevationLoss}</td>
				</tr>
				<tr>
					<td>Dog Friendly</td>
					<td>${trail.dogFriendly}</td>
				</tr>
				<tr>
					<td>Permit Required</td>
					<td>${trail.needPermit}</td>
				</tr>
				<tr>
					<td>Trail Head Latitude</td>
					<td>${trail.headLat}</td>
				</tr>
				<tr>
					<td>Trail Head Longitude</td>
					<td>${trail.headLong}</td>
				</tr>
			</tbody>
		</table>

	</div>

	<jsp:include page="../bootstrapFoot.jsp" />
</body>
</html>