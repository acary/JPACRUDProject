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
		<h1>Update Job</h1>
		<span class="badge rounded-pill bg-primary">ID ${job.id}</span>

		<div>
			<form action="updateJob.do" method="post">

				<input type="hidden" name="jid" value="${job.id}"> <label
					for="name" class="form-label">Job Name</label> <input type="text"
					name="name" class="form-control form-control-lg" />
				<div id="jobNameHelp" class="form-text">${job.name}</div>
				
				<label for="uri" class="form-label">URI</label> <input type="text"
					name="uri" class="form-control form-control-lg" />
				
				<c:if test="${not empty job.uri}">
					<div id="jobUriHelp" class="form-text">${job.uri}</div>
				</c:if>
				
				<br> <input type="submit" class="btn btn-primary m-2"
					value="Update Job" />
			</form>
		</div>
	</div>

	<jsp:include page="../footer.jsp" />
</body>
</html>