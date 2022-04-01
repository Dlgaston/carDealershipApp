<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="StyleSheet.css" type="text/css">
<title>Login</title>
</head>
<body><label for = "customerLogin">Admin</label>

		<form:form modelAttribute="admin" action="/login" method="post" id="adminLogin">
			
					<div>
					<label for="inputEmail4">Email</label>
					<form:input path="email" type="text" id="inputEmail4" />
				</div>
				<div >
					<label for="inputPassword4">Password</label>
					<form:input path="password" type="password" id="inputPassword4" />
				</div>
			
			<button type="submit" class="btn btn-primary">Sign Up</button>
		</form:form>
</body>
</html>