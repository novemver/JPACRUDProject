<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a Trail</title>
<jsp:include page="../bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="../nav.jsp" />

	<h1>Update ${trail.name }</h1>
	<form action="update.do" method="POST">
		<input type="hidden" name="id" value="${trail.id }"> <br>
		<label for="trail_name">Name</label> <input type="text"
			name="trail_name" value="${trail.name}"> <br> <label
			for="distance">Distance </label> <input type="number" name="distance"
			value="${trail.distance}"> <br> <label for="description">Description
		</label> <input type="text" name="description" value="${trail.description}">
		<br> <label for="max_elevation">Max Elevation </label> <input
			type="number" name="maxElevation"><br> <label
			for="elevation_gain">Elevation gain </label> <input type="number"
			name="elevationGain" value="${trail.elevationGain}"> <br>
		<label for="elevation_loss">Elevation loss </label> <input
			type="number" name="elevationLoss" value="${trail.elevationLoss}">
		<br> <label for="dog_friendly">Dog Friendly </label> <input
			type="checkbox" name="dogFriendly" value="${trail.dogFriendly}">
		<br> <label for="permit_req">Permit Required </label> <input
			type="checkbox" name="needPermit" value="${trail.needPermit}">
		<br> <label for="trail_head_latitutde">Trail Head
			Latitude</label> <input type="number" name="headLat" value="${trail.headLat}">
		<br> <label for="trail_head_longitude">Trail Head
			Longitude </label> <input type="number" name="headLong"
			value="${trail.headLong}"> <br> <input type="submit"
			value="Update Trail" />
	</form>

	<jsp:include page="../bootstrapFoot.jsp" />
</body>
</html>