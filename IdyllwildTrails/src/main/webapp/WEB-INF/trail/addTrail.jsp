<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Trail</title>
<jsp:include page="../bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="../nav.jsp" />

	<h1>Add a Trail</h1>

	<form action="addTrail.do" method="POST">
		<label for="trail_name">Name</label> <input type="text" name="name"><br>
		<label for="distance">Distance </label> <input type="number"
			name="distance"><br> <label for=description>Description
		</label> <input type="text" name="description"><br> <label
			for="max_elevation">Max Elevation </label> <input type="number"
			name="maxElevation"><br> <label for="elevation_gain">Elevation
			gain </label> <input type="number" name="elevationGain"> <br> <label
			for="elevation_loss">Elevation loss </label> <input type="number"
			name="elevationLoss"> <br> <label for="dog_friendly">Dog
			Friendly </label> <input type="checkbox" name="dogFriendly"> <br>
		<label for="permit_req">Permit Required </label> <input
			type="checkbox" name="needPermit"> <br> <label
			for="trail_head_latitude">Trail Head Latitude </label> <input
			type=number name="headLat"> <br> <label
			for="trail_head_longitude">Trail Head Longitude</label> <input
			type="number" name="headLong"> <br> <input type="submit"
			value="Add New Trail" />
	</form>

	<jsp:include page="../bootstrapFoot.jsp" />
</body>
</html>