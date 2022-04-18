<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<span class="badge rounded-pill bg-primary">ID ${job.id}</span>
			<h5>${job.name}</h5>
			
			<br>
			<c:if test="${not empty job.uri}">
				<strong>URI:</strong> <a href="${job.uri}" target="_blank"><small>${job.uri}</small></a>
			</c:if>
			
			<hr>
			
			<a href="updateJob.do?jid=${job.id}"><button type="button" class="btn btn-primary">Update</button></a>
			<a href="deleteJob.do?jid=${job.id}"><button type="button" class="btn btn-danger">Delete</button></a>
		</div>
	</div>

	<jsp:include page="../footer.jsp" />
</body>
</html>