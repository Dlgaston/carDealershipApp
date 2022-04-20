<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="StyleSheet.css" type="text/css">
<title>Admin page</title>
</head>
<body>

<div>
		<h3>Customer Log</h3>
		<table class="tableBorder">
			<tr class="tableBorder">
				<th>Customer Log Number</th>
				<th>Customer</th>
				<th>Email</th>
				</tr>
<c:forEach items="${list}" var="customer" varStatus="i">
			<tr class="tableBorder">
			<td>${i.count}</td>
			<td>${customer.fName} ${customer.lName}</td>
			<td>${customer.email}</td>
			</tr>
		</c:forEach>
		</table>
		</div>
<div>
	<a href="/">Home</a>
</div>		

</body>
</html>