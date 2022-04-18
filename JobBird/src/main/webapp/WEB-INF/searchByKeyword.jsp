<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JobBird - Search By Keyword</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
	<div class="container">
		<jsp:include page="nav.jsp" />
	</div>

	<main class="container">
		<h1>Search By Keyword</h1>

		<form action="searchKeyword.do" method="POST">
			<label for="keyword" class="form-label">Enter Keyword</label> 
			<!-- <small>(or <a href="searchId.do"> search by ID</a>)</small>  -->
			<input type="text" name="keyword"
				class="form-control form-control-lg" /> <input type="submit"
				class="btn btn-primary m-2" value="Search">
		</form>

		<br>

	</main>

	<jsp:include page="footer.jsp" />
</body>
</html>