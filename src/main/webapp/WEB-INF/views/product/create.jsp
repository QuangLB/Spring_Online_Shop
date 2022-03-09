<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF8">
<title>Create product</title>

<style>
	.red {
		color: red;
	}
</style>
</head>
<body>

	<h1>Create product</h1>
	
	${message}
	
	<frm:form modelAttribute="productModel" enctype="multipart/form-data" method="POST" action="${pageContext.request.contextPath}/product/create">
		<div>
			Name: <frm:input type="text" path="name" value=""/>
				<frm:errors path="name" cssClass="red"/>
		</div>
		
		<div>
			Price: <frm:input type="number" path="price" value=""/>
			<frm:errors path="price" cssClass="red"/>
				
		</div>
		
		<div>
			Category: <frm:select path="category.id" value="">
					<frm:options items="${categories}" itemValue="id" itemLabel="name"/>
				</frm:select>	
				<frm:errors path="category.id" cssClass="red"/>	
		</div>
		
		<div>
			Image: <frm:input type="file" path="image" value=""/>
			<frm:errors path="image" cssClass="red"/>	
		</div>
		
		<div>
			Active: <frm:checkbox path="active" value=""/>
			<frm:errors path="active" cssClass="red"/>
		</div>
		
		<div>
			<input type="submit" name="" value="Submit">
		</div>
	
	</frm:form>

</body>
</html>