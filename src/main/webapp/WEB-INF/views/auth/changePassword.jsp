<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div class="container" style="max-width: 40%">
		<h1>Change password</h1>
		<form method="post" action="/ASM/admin/user/changepassword"> 
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					address</label> <input type="email" class="form-control" name="email" required="required"
					id="exampleInputEmail1" aria-describedby="emailHelp">
				<div id="emailHelp" class="form-text">We'll never share your
					email with anyone else.</div>
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Current Password</label> 
				<input type="password" class="form-control" name="password" required="required"
					id="exampleInputPassword1">
			</div>
			<hr>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label" required="required">New Password</label>
				<input type="password" class="form-control" name="newpassword"
					id="exampleInputPassword1">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Current new
					Password</label> <input type="password" class="form-control" name="confirmPassword" required="required"
					id="exampleInputPassword1">
			</div>
			<button type="submit" class="btn btn-primary">Change</button>
			<h4>${ message }</h4>
		</form>
	</div>
</body>
</html>