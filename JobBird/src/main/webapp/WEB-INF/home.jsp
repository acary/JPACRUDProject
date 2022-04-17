<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="bootstrapHead.jsp" />
<title>JobBird</title>
</head>
<body>

	<div class="container">
		<jsp:include page="nav.jsp" />
	</div>

	<div class="container col-xxl-8 px-4 py-5">
		<div class="row flex-lg-row-reverse align-items-center g-5 py-5">
			<div class="col-10 col-sm-8 col-lg-6">
				<img
					src="https://images.unsplash.com/photo-1527192491265-7e15c55b1ed2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1770&q=80"
					class="d-block mx-lg-auto img-fluid" alt="JobBird" width="700"
					height="500" loading="lazy">
			</div>
			<div class="col-lg-6">
				<h1 class="display-5 fw-bold lh-1 mb-3">We have jobs</h1>
				<p class="lead">Search our job postings, add new jobs and more!</p>
				<div class="d-grid gap-2 d-md-flex justify-content-md-start">
					<a href="all.do"><button type="button"
							class="btn btn-primary btn-lg px-4 gap-3">Search</button></a> <a
						href="createJob.do"><button type="button"
							class="btn btn-outline-secondary btn-lg px-4">Add New</button></a>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>