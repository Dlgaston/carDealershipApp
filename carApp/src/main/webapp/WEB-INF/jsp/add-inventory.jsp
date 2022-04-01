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

	<form:form modelAttribute="vehicle" action="/add-inventory"
		method="post">
			<div>
			<label for="inputVinNumber">Vin Number</label>
			<form:input path="id" type="text" id="inputVinNumber" />
		</div>
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
			<label for="inputURL">Picture of Vehicle</label>
			<form:input path="url" type="url" id="inputUrl" />
		</div>
	
		<button type="submit">work</button>
	</form:form>
</body>
</html>