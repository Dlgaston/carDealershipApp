<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="StyleSheet.css" type="text/css">
<title>Buy Vehicle</title>
</head>
<body>
<form:form modelAttribute="customer" action="/buy-vehicle"
		method="post">
			<div>
			<label for="inputFirstName">First Name</label>
			<form:input path="fName" type="text" id="inputFirstName" />
		</div>
		<div>
			<label for="inputLastName">Last Name</label>
			<form:input path="lName" type="text" id="inputLastName" />
		</div>
		<div>
			<label for="inputEmail">Email</label>
			<form:input path="email" type="email" id="inputEmail" />
		</div>
		<div>
			<label for="inputPassword">Password</label>
			<form:input path="password" type="password" id="inputPassword" />
		</div>
		<div>
			<label for="inputVin">Vin of vehicle</label>
			<form:input path="vin" type="text" id="inputVin" />
		</div>
	
		<button type="submit">work</button>
	</form:form>
	<div>${vehicle.vin}</div>
</body>
</html>