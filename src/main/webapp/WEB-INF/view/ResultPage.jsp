<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
		<h1 align="center">Love Calculator</h1>
		<hr>
		<h3>The Love Calculator Predicts:</h3>
		${DTO.yourName } and ${DTO.crushName} are <br>
		<p>${DTO.result}</p>
		<br>
		<a href="/LoveAppCalculator/send_Email">Send Email</a>
	

</body>
</html>