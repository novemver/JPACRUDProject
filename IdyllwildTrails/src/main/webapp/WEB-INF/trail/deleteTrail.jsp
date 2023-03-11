<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Remove a Trail</title>
<jsp:include page="../bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="../nav.jsp" />

	<h1>Remove a Trail</h1>
	<form action="goneTrail.do" method="POST">
		<label for="id">ID</label> 
		<input type="text" name="name">
		<br> 
		<input type="submit" value="Remove Trail" />
	</form>


	







	<jsp:include page="../bootstrapFoot.jsp" />
</body>
</html>