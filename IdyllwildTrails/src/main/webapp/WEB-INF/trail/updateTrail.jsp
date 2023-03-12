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
		<label for="name">Name</label> 
		<input type="text" name="name" value="${trail.name}">
		<br> <label for="distance">Distance </label> 
		<input type="text" name="distance" value="${trail.distance}"> <br>
		<label for="elevation_gain">Elevation gain </label> 
		<input type="text" name="elevationGain" value="${trail.elevationGain}"> <br> 
		<label for="elevation_loss">Elevation loss </label>
		 <input type="text"	name="elevationLoss" value="${trail.elevationLoss}"> <br> 
		 <input type="submit" value="Update Trail" />
	</form>

	<jsp:include page="../bootstrapFoot.jsp" />
</body>
</html>