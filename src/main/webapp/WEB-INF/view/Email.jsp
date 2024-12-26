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

	<h2>
		Hii ${DTO.yourName}<br>
	</h2>
	<h3>Send Result To Your Email</h3>
	
	<form:form action="/LoveAppCalculator/process_Email" method="get"
		modelAttribute="EmailDTO">
		<label for="email">Enter Your Email</label>
		<form:input path="email" id="email" />
		<input type="submit" value="send">
	</form:form>

</body>
</html>