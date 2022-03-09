<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
	<h1>List Catelory</h1>
	<table class="table">
		<thead>
			<tr>
				<td>Id</td>
				<td>Name</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ listCategory }" var="catelory">
				<tr>
					<td>${ user.id }</td>
					<td>${ user.name }</td>
					<td><a
						href="http://localhost:8080/ASM/admin/user/edit?id=${ user.id }"
						class="btn btn-primary">Update</a></td>
					<td><a onclick="del (${ user.id })" class="btn btn-primary">Remove</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
<script type="text/javascript">
	function del(id) {
		if (confirm("Are you sure you want to delete this user?")) {
			window.location.href = "/ASM/admin/user/delete?id=" + id;
		}


	}
</script>
</html>