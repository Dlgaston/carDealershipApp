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
				<th>Vehicle Vin</th>
				<th>Make/Model/Year</th>
				<th>Miles</th>
				<th>Price</th>
				</tr>
<c:forEach items="${list}" var="customer" varStatus="i">
			<tr class="tableBorder">
			<td>${i.count}</td>
			<td>${customer.fName} ${customer.lName}</td>
			<td>${customer.email}</td>
			<td>${customer.vehicle.id}</td>
			<td>${customer.vehicle.make} / ${customer.vehicle.model} 
			/ ${customer.vehicle.yearOfMake}</td>
			<td>${customer.vehicle.miles}</td>
			<td>${customer.vehicle.price}</td>
			
		</c:forEach>
		</table>
		</div>
<div>
	<a href="/">Home</a>
</div>		

</body>
</html>