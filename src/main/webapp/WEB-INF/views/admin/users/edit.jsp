<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body class="container">
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark text-white">
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
						href="/admin/users/index">List User</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/admin/users/create">Create User</a></li>
					<li class="nav-item"><a class="nav-link " aria-current="page"
						href="/admin/product">List Product</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/admin/product/create">Create Product</a></li>
					<li class="nav-item"><a class="nav-link" href="/logout">Lougout</a></li>
				</ul>
				<div class="fw-bold text-success">
					<h5>${ name }</h5>
				</div>
			</div>
		</div>
	</nav>
	<frm:form method="POST" action="/admin/users/update"
		modelAttribute="user" class="container">
		<br>
		<div class="text-center">
			<h1 class="text-info">Edit user</h1>
		</div>

		<hr>
		<div>
			<label>ID</label>
			<frm:input path="id" class="form-control" value="${user.id}"
				readonly="readonly" />
		</div>
		<div>
			<label>Fullname</label>
			<frm:input path="fullname" class="form-control"
				value="${user.fullname}" />
		</div>
		<div>
			<label>Email</label>
			<frm:input path="email" class="form-control" value="${user.email}" />
			<frm:errors path="email" element="span" cssClass="text-danger">
			</frm:errors>
		</div>
		<div>
			<label>Password</label>
			<frm:password path="password" class="form-control" value="******"
				readonly="readonly" />

		</div>
		<div>
			<label>Photo</label>
			<frm:input path="photo" class="form-control" value="${user.photo}" />
		</div>
		<div>
			<label>Role</label>
			<frm:select class="form-select" aria-label="Default select example"
				path="role" id="role">
				<frm:option value="0">User</frm:option>
				<frm:option value="1">Admin</frm:option>
			</frm:select>
		</div>
		<div>
			<label>Activate</label>
			<frm:select class="form-select" aria-label="Default select example"
				path="activated" id="activated">
				<frm:option value="0">On</frm:option>
				<frm:option value="1">Off</frm:option>
			</frm:select>
		</div>
		<br>
		<frm:button class="btn btn-primary">Update</frm:button>

	</frm:form>
	<div class="container">
		<footer class="row row-cols-5 py-5 my-5 border-top">
			<div class="col">
				<a href="/"
					class="d-flex align-items-center mb-3 link-dark text-decoration-none">
					<svg class="bi me-2" width="40" height="32">
						<use xlink:href="#bootstrap" /></svg>
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

		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
			crossorigin="anonymous"></script>
	</div>
</body>
</html>