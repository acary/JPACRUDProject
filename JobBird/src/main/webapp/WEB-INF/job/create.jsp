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
			<form action="createJob.do" method="post">

				<label for="name" class="form-label">Job Name</label> <input
					type="text" name="name" class="form-control form-control-lg" />
				<br> <input type="submit" class="btn btn-primary m-2"
					value="Add Job" />
			</form>
		</div>
	</div>

	<jsp:include page="../footer.jsp" />
</body>
</html>