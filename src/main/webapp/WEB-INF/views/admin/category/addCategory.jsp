<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="/admin/users/index">List User</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/admin/users/create">Create User</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="/admin/product">List Product</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/admin/product/create">Create Product</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="/admin/users/index">List Category</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/admin/users/create">Create Category</a></li>
					<li class="nav-item"><a class="nav-link" href="/logout">Lougout</a></li>
				</ul>
				<div class="fw-bold text-success">
					<h4>${ session.name }</h4>
				</div>
			</div>
		</div>
	</nav>
	<form method="POST" action="/ASM/admin/createVideo">
		<h1>Add Catelory</h1>
		<div class="mb-3">
			<label class="form-label">ID Catelory</label> <input type="text"
				required="required" class="form-control" placeholder="ID Catelory"
				name="id" required="required">
		</div>
		<div class="mb-3">
			<label class="form-label">Name</label> <input type="text"
				required="required" class="form-control" placeholder="Name"
				name="name" required="required">
		</div>
		<div style="text-align: center">
			<br>
			<button class="btn btn-primary">Save</button>
		</div>
	</form>
	<h3>${ mesage }</h3>
</body>
</html>