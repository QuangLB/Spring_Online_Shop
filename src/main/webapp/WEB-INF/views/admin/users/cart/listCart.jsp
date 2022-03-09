<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Cart</title>
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
					<li class="nav-item"><a class="nav-link "
						aria-current="page" href="/user/home">Home</a></li>
						<li class="nav-item"><a class="nav-link "
						aria-current="page" href="/user/home">Profile</a></li>
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
	<div class="row">
		<div class="span12">

			<div class="well well-small">
				<h1>
					Giỏ hàng <small class="pull-right"> 2 Sản phẩm trong giỏ
						hàng </small>
				</h1>
				<hr class="soften" />

				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Hình ảnh</th>
							<th>Giá bán</th>
							<th>Số lượng</th>
							<th>Xóa</th>
							<th>Tổng tiền</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach var="item" items="${ Cart }">
							<tr>

								<td><p class="card-body">
										<img style="height: 170px" alt=""
											src="${item.value.product.image}">
									</p></td>


								<td><fmt:formatNumber type="number" groupingUsed="true"
										value="${ price }" /> ₫</td>

								<td><fmt:formatNumber type="number" groupingUsed="true"
										value="${ item.value.quanty }" /></td>

								<td><a href="<c:url value="/DeleteCart/${ item.key }"/>"
									class="btn btn-mini btn-danger"> <span class="icon-remove"></span>
										Remove
								</a></td>
								<td><fmt:formatNumber type="number" groupingUsed="true"
										value="${ item.value.totalprice }" /> ₫</td>

							</tr>
						</c:forEach>

					</tbody>
				</table>
				<br /> <a href="products.html" class="shopBtn btn-large"><span
					class="icon-arrow-left"></span> Tiếp tục mua sắm </a> <a
					href="login.html" class="shopBtn btn-large pull-right">Thanh
					toán <span class="icon-arrow-right"></span>
				</a>

			</div>
		</div>
	</div>
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
</body>
</html>