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


		<table class="table table-translucent table-hover">
			<thead>
				<th>${trail.name}Trail</th>
				<th></th>
			</thead>
			<tbody>
				<tr>
					<td>ID:</td>
					<td>${trail.id}</td>
				</tr>
				<tr>
					<td>Miles:</td>
					<td>${trail.distance}</td>
				</tr>
				<tr>
					<td>Feet elevation gain:</td>
					<td>${trail.elevationGain}</td>
				</tr>
				<tr>
					<td>Feet elevation loss:</td>
					<td>${trail.elevationLoss}</td>
				</tr>
			</tbody>
			<h4><a href="removed.do?id=${trail.id }">Remove  ${trail.name }</a></h4>
		</table>
	</div>

	<jsp:include page="../bootstrapFoot.jsp" />
</body>
</html>