<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="StyleSheet.css" type="text/css">
<title>Add Cars</title>
</head>
<body>

<a href="/">Home</a>

	<form:form modelAttribute="vehicle" action="/add-inventory"
		method="post">
		<div>
			<label for="inputManufacturer">Manufacturer</label>
			<form:input path="manufacturer" type="text" id="inputManufacturer" />
		</div>
		<div>
			<label for="inputMake">Make</label>
			<form:input path="make" type="text" id="inputMake" />
		</div>
		<div>
			<label for="inputModel">Model</label>
			<form:input path="model" type="text" id="inputModel" />
		</div>
		<div>
			<label for="inputYearofMake">Year of Vehicle</label>
			<form:input path="yearOfMake" type="number" id="inputYearofMake" />
		</div>
		<div>
			<label for="inputMiles">Miles</label>
			<form:input path="miles" type="number" id="inputMiles" />
		</div>
		<div>
			<label for="inputPrice">Price</label>
			<form:input path="price" type="number" id="inputPrice" />
		</div>
		<div>
			<label for="inputPurchaseDate">Date of Purchase</label>
			<form:input path="purchaseDate" type="date" id="inputPurchaseDate" />
		</div>
		<div>
			<label for="inputDescription">Description</label>
			<form:input path="description" type="text" id="inputDescription" />
		</div>
		<div>
			<label for="inputURL">Picture of Vehicle</label>
			<form:input path="url" type="url" id="inputUrl" />
		</div>
	
		<button type="submit">work</button>
		<div>
<c:if test="${error != null}">No negative numbers</c:if>
</div>
	</form:form>
</body>
</html>