<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Job Details</title>
<jsp:include page="../bootstrapHead.jsp" />
</head>
<body>
	<div class="container">
		<jsp:include page="../nav.jsp" />
	</div>
	<div class="container">
		<h1>Job Details</h1>

		<div>
			<h5>${job.name}</h5>
			<p>${job.id}</p>
		</div>
	</div>

	<jsp:include page="../footer.jsp" />
</body>
</html>