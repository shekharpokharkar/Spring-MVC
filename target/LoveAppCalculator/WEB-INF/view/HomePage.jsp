<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function validateUserName() {
		if (document.getElementById("yourName").value < 1) {
			alert("UserName must have atleast 1 character");
			return false
		}
		return true;
	}
</script>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 20px;
}
</style>

</head>
<body>
	<form:form action="processData" method="get" modelAttribute="DTO">
		<div align="center">
			<h1>Love Calculator</h1>
			<hr>
			<label for="yourName">Your Name</label>
			<form:input id="yourName" name="yourName" path="yourName" />
			<form:errors path="yourName" cssClass="error"></form:errors>
			<br> <br> 
			<label for="crushName">Crush Name</label>
			<form:input id="yourName" name="crushName" path="crushName" />
			<form:errors path="crushName" cssClass="error"></form:errors>
			<br> <br> 
			<form:checkbox path="termsAndcondition"/>
			<label>I agree terms and Conditions</label>
			<form:errors path="termsAndcondition" cssClass="error"></form:errors>
			<br><br>
			<a href="Register">Register Here</a> 
			<br><br>
			<input type="submit" value="SUBMIT">
		</div>
	</form:form>

</body>
</html>