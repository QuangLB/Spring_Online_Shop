<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Profile</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body class="container">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand">Admin</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link " aria-current="page"
						href="/user/home">Home</a></li>
					<li class="nav-item"><a class="nav-link " aria-current="page"
						href="/user/home">Profile</a></li>
					<li class="nav-item"><a class="nav-link" href="/logout">Lougout</a></li>
				</ul>
				<div class="fw-bold text-success">
					<h4>${ name }</h4>
					<a class="nav-link active" aria-current="page" href="/cart">List
						Cart</a>
				</div>
			</div>
		</div>
	</nav>
	<form method="POST" action="/admin/users/update">
		<div>
			<label>Fullname</label> <input name="fullname" type="text"
				class="form-control" value="${ name }" required="required" readonly="readonly"/>
		</div>
		<div>
			<label>Email</label> <input name="email" type="email"
				class="form-control" value="${ email }" readonly="readonly"/>
		</div>
		<br>
		
	</form>
	<footer class="row row-cols-5 py-5 my-5 border-top">
		<div class="col">
			<a href="/"
				class="d-flex align-items-center mb-3 link-dark text-decoration-none">
				
			</a>
			<p class="text-muted">@copy 2021</p>
		</div>

		<div class="col"></div>

		<div class="col">
			<h5>Section</h5>
			<ul class="nav flex-column">
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">Home</a></li>
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">Features</a></li>
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">Pricing</a></li>
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">FAQs</a></li>
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">About</a></li>
			</ul>
		</div>

		<div class="col">
			<h5>Section</h5>
			<ul class="nav flex-column">
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">Home</a></li>
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">Features</a></li>
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">Pricing</a></li>
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">FAQs</a></li>
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">About</a></li>
			</ul>
		</div>

		<div class="col">
			<h5>Section</h5>
			<ul class="nav flex-column">
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">Home</a></li>
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">Features</a></li>
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">Pricing</a></li>
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">FAQs</a></li>
				<li class="nav-item mb-2"><a href="#"
					class="nav-link p-0 text-muted">About</a></li>
			</ul>
		</div>
	</footer>
</body>
</html>