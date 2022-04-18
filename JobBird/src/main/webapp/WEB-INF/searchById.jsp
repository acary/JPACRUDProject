<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JobBird - Search By ID</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
	<div class="container">
		<jsp:include page="nav.jsp" />
	</div>

	<main class="container">
		<h1>Search By ID</h1>

		<form action="searchId.do" method="POST">
			<label for="jid" class="form-label">Enter ID</label> 
			<small>(or <a href="searchKeyword.do"> search by keyword</a>)</small>
			<input type="text" name="jid"
				class="form-control form-control-lg" /> <input type="submit"
				class="btn btn-primary m-2" value="Search">
		</form>

		<br>

	</main>

	<jsp:include page="footer.jsp" />
</body>
</html>