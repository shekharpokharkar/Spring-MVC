<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Your are Registration is successfully</h1>
User:${REG.name} <br>
Name:${REG.userName }<br>
Password:${REG.password}<br>
Gender:${REG.country} <br>
Hobbies: 
<c:forEach var="hobbbies" items="${REG.country}">
${hobbbies}
<br>

</c:forEach>
Email:${REG.contact.email}<br>
Phone:${REG.contact.phone}<br>
CreditCardNo:${REG.pay.creditardNumber}<br>
Amount:${REG.pay.amount}<br>
Age:${REG.age}<br>
</body>
</html>