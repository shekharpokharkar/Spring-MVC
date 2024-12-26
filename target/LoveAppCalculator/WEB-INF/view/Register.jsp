<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	<div align="center">
		<h1>Love Calculator</h1>
		<hr>
		<form:form action="process_Registrion" method="post"
			modelAttribute="REG">
			<p>
				<label for="name">Name:</label>
				<form:input id="name" path="name" />
			</p>
			<p>
				<label for="Username">UserName:</label>
				<form:input id="Username" path="userName" />
			</p>
			<p>
				<label for="password">Password</label>
				<form:password id="password" path="password" />
			</p>
			<p>
				<label for="age">Age:</label>
				<form:input id="age" path="age" />
				<form:errors path="age" cssClass="error"/>
			</p>
			<p>
				<label for="country">country</label>
				<form:select path="country" id="country">
					<form:option value="India" label="India" />
					<form:option value="USA" label="USA" />
					<form:option value="UK" label="UK" />
					<form:option value="China" label="CHINA" />
				</form:select>
			</p>
			<p>
				<label for="gender">Gender</label> Male
				<form:radiobutton path="gender" value="Male" id="gender" />
				Female
				<form:radiobutton path="gender" value="FeMale" id="gender" />
			</p>
			<p>
				<label>Hobbies: </label> Cricket :
				<form:checkbox value="Cricket" path="hobby" />

				Chess :
				<form:checkbox value="Chess" path="hobby" />

				Programming:
				<form:checkbox value="Programming" path="hobby" />


			</p>
			<hr>
			<h2>Communication Details</h2>
			<p>
				<label for="email">Email</label>
				<form:input path="contact.email" id="email" />
			</p>
			<p>
				<label for="phone">Phone</label>
				<form:input path="contact.phone" id="phone" />
			</p>
			<hr>
			<h2>Payment Details</h2>
			<p>
				<label for="cno">CreditCard Number</label>
				<form:input path="pay.creditardNumber" id="cno" />
			</p>
			<p>
				<label for="amount">Amount</label>
				<form:input path="pay.amount" id="amount" />
			</p>
			<hr>

			<p>
				<input type="submit" value="Registration">
			</p>
		</form:form>
	</div>
</body>
</html>