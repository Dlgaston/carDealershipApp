<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="StyleSheet.css" type="text/css">
<title>vehicle list</title>
</head>
<body>
<div>
		<a href="/">Home</a>
	</div>


	<div>
		<h3>Vehicle list</h3>
		<table class="tableBorder">
			<tr class="tableBorder">
				<th>Listing</th>
				<th>Manufacturer</th>
				<th>Make/Model/Year</th>
				<th>Miles</th>
				<th>Price</th>
				<th>Date of Purchase</th>
				<th>Vehicle page</th>
			</tr>
			<c:forEach items="${vehicleList}" var="vehicle" varStatus="i">
			<c:if test="${vehicle.isUsed eq false}">
				<tr class="tableBorder">
					<td>${i.count}</td>
					<td><c:out value="${vehicle.manufacturer}" /></td>
					<td><c:out
							value="${vehicle.make}/
							 ${vehicle.model}/
			 				${vehicle.yearOfMake}" /></td>
					<td><c:out value="${vehicle.miles}" /></td>
					<td><c:out value="${vehicle.price}" /></td>
					<td><c:out value="${vehicle.purchaseDate}" /></td>
					<td><a href="vehicle-page?id=${vehicle.id}">View page</a>
				</tr>
				</c:if>
			</c:forEach>
		</table>
	</div>
	
	<div>
		<h3>Used Vehicle list</h3>
		<table class="tableBorder">
			<tr class="tableBorder">
				<th>Listing</th>
				<th>Manufacturer</th>
				<th>Make/Model/Year</th>
				<th>Miles</th>
				<th>Price</th>
				<th>Date of Purchase</th>
				<th>Vehicle page</th>
			</tr>
			<c:forEach items="${vehicleList}" var="vehicle" varStatus="i">
				<c:if test="${vehicle.isUsed eq true}">
				<tr class="tableBorder">
					<td>${i.count}</td>
					<td><c:out value="${vehicle.manufacturer}" /></td>
					<td><c:out
							value="${vehicle.make}/
							 ${vehicle.model}/
			 				${vehicle.yearOfMake}" /></td>
					<td><c:out value="${vehicle.miles}" /></td>
					<td><c:out value="${vehicle.price}" /></td>
					<td><c:out value="${vehicle.purchaseDate}" /></td>
					<td><a href="vehicle-page?id=${vehicle.id}">View page</a>
				</tr>
				</c:if>
				
			</c:forEach>
		</table>
	</div>




</body>
</html>