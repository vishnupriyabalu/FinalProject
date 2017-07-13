<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="Adminhome.jsp" %>

<title>Product</title>
<style type="text/css">
.body {
	background-image: url("http://www.powerpointhintergrund.com/uploads/orange-ppt-background-1.jpg");
	background-size:100%;
}
</style>
</head>
<body class="body">
<form:form method="POST" action="InsertProduct" modelAttribute="product" enctype="multipart/form-data">
<table align="center">
			<tr>
				<td colspan="2"><h3><center>Product Details</h3></center></td>
			</tr>
			<tr>
				<td>Product ID</td>
				<td><form:input path="prodid" type="hidden"/></td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><form:input path="prodname" value="" /></td>
			</tr>
			
			<tr>
				<td>Category</td>
				<td><form:select path="catid" value="">
						<form:option value="0" label="------Select----" />
						<form:options items="${catlist}" />
					</form:select>
				</td>
			</tr>		
			<tr>
				<td>Supplier</td>
				<td><form:select path="supid" value="">
						<form:option value="0" label="------Select----" />
						<form:options items="${suplist}" />
					</form:select>
				</td>
			</tr>		
				
			<tr>
				<td>Price</td>
				<td><form:input path="price" value="" /></td>
			</tr>
			<tr>
				<td>Stock</td>
				<td><form:input path="quantity" value=""/></td>
			</tr>
			<tr>
				<td>Product Desc</td>
				<td><form:textarea path="proddesc" value="" /></td>
			</tr>
			<tr>
			<td>Product image</td>
			<td><form:input type="file" path="pimage" value=""/></td>
			</tr>
			<tr>
		<td>	<td colspan="2"><input type="submit" /></td>
			</tr>
</table>
</form:form>

<!-- Displaying the Product data using Table -->
<table cellspacing="2" align="center" border="1">

	<tr bgcolor="pink">
		<td>Product ID</td>
		<td>Product Name</td>
		<td>Price</td>
		<td>Quantity</td>
		<td>Category Id</td>
		<td>Supplier Id</td>
		<td>Operation</td>
	</tr>
	<c:forEach items="${prodlist}" var="product">
		<tr bgcolor="cyan">
			<td>${product.prodid}</td>
			<td>${product.prodname}</td>
			<td>${product.price}</td>
			<td>${product.quantity}</td>
			<td>${product.catid}</td>
			<td>${product.supid}</td>
			<td><a href="<c:url value="deleteProduct/${product.prodid}"/>">Delete</a>
				<a href="<c:url value="updateProduct/${product.prodid}"/>">Update</a>
			</td>
		</tr>
	</c:forEach>
</table>
<!-- Completed Displaying Table -->
 
<%@include file="Footer.jsp" %>

</body>
</html>

