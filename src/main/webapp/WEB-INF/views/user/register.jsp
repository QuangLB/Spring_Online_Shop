<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
</head>
<body>
	<h1>Register form</h1>
	<form action="/register" method="post">
		<div class="form-group">
			<p>First Name</p>
			<input name="firstName"> <span>${ message_F }</span>
		</div>

		<div class="form-group">
			<p>Last Name</p>
			<input name="lastName"> <span>${ message_L }</span>
		</div>

		<div class="form-group">
			<p>User Name</p>
			<input name="userName"><span>${ message_U }</span>
		</div>

		<div class="form-group">
			<p>Password</p>
			<input name="password" type="password"><span>${ message_P }</span>
		</div>
		<br>
		<button type="submit">Register</button>

	</form>
</body>
</html>