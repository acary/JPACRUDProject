<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JobBird - All Jobs</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
	<div class="container">
		<jsp:include page="nav.jsp" />
	</div>

	<main class="container">
		<h1>All Jobs</h1>

		<form action="getJob.do" method="GET">
			Job ID: <input type="text" name="jid" /> <input type="submit"
				value="Show Job" />
		</form>

		<br>

		<table class="table table-striped">
			<thead class="table-dark">
				<tr>
					<th>ID</th>
					<th>Title</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="j" items="${jobs}">
					<tr>
						<td>${j.id}</td>
						<td><a href="getJob.do?jid=${j.id}">${j.name}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</main>

	<jsp:include page="footer.jsp" />
</body>
</html>