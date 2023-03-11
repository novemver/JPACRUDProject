<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a Trail</title>
</head>
<body>
	<jsp:include page="../nav.jsp" />

	<h1>Add a Trail</h1>
	<form action="addTrail.do" method="POST">
		<label for="name">Name</label> <input type="text" name="name">
		<br> <label for="distance">Distance </label> <input type="text"
			name="distance"> <br> <label for="elevation_gain">Elevation
			gain </label> <input type="text" name="elevationGain"> <br> <label
			for="elevation_loss">Elevation loss </label> <input type="text"
			name="elevationLoss"> <br> <input type="submit"
			value="Add New Trail" />
	</form>

	<jsp:include page="../bootstrapFoot.jsp" />
</body>
</html>