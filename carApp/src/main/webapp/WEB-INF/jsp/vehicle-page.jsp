<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="StyleSheet.css" type="text/css">
<title></title>
</head>
<body>
	<header><a href="/">home</a></header>
	<h1> ${vehiclelisting.make}</h1>
	<div>
	<img src="${vehiclelisting.url}" width="500px" height="300px">
	<c:if test="${vehiclelisting.ageOnLot >= 120 }">${discount}</c:if>
	<c:if test="${vehiclelisting.ageOnLot < 120 }">${discount}</c:if>
	</div>
	<div>
	<a href="buy-vehicle?id=${vehicle.id}">BUY VEHICLE</a>
	</div>
</body>
</html>