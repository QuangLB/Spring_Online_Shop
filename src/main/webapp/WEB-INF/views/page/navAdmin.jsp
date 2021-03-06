<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nav</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
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
						aria-current="page" href="/ASM/admin/video">Home</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/ASM/admin/video">Videos</a></li>
						<li class="nav-item"><a class="nav-link"
						href="/ASM/admin/createVideo">Create Video</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/ASM/admin/user">Users</a></li>
					<li class="nav-item"><a class="nav-link" href="http://localhost:8080/ASM/admin/listFavoriteUser">Report1</a></li>
					<li class="nav-item"><a class="nav-link" href="http://localhost:8080/ASM/admin/listShareUser">Report2</a></li>
					<li class="nav-item"><a class="nav-link"
						href="http://localhost:8080/ASM/logout">Lougout</a></li>
				</ul>
				<div class="fw-bold text-success">
					<h4>${ user.fullname }</h4>
				</div>
			</div>
		</div>
	</nav>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>