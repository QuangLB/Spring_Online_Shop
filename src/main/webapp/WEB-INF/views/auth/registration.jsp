<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body class="container">
	<form method="POST" action="/submit">
		<div class="container" style="max-width: 40%">
			<br>
			<h1>Sign Up</h1>
			<div>
				<label>Fullname</label> <input name="fullname" type="text"
					class="form-control" required="required" />
			</div>
			<div>
				<label>Email</label> <input name="email" type="email"
					class="form-control" id="formGroupExampleInput" required="required"  />
			</div>
			<div>
				<label>Password</label> <input name="password" type="password" 
					class="form-control" required="required"  />
			</div>
			<br>
			<button class="btn btn-primary">Sign Up</button>
			<hr>
			<a href="/login">Login?</a>
		</div>
	</form>
</body>
</html>