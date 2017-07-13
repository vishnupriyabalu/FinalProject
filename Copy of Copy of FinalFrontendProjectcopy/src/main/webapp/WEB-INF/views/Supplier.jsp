<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Adminhome.jsp" %>
<title>Supplier</title>
<style type="text/css">
.body {
	background-image: url("http://www.powerpointhintergrund.com/uploads/orange-ppt-background-1.jpg");
	background-size:100%;
}
</style>
</head>
<body class="body">
<form:form action="InsertSupplier" modelAttribute="supplier">
<table align="center">
			<tr>
				<td colspan="2"><h3><center>Supplier Details</h3></center></td>
			</tr>
			<tr>
				<td>Supplier ID</td>
				<td><form:input type="hidden" path="supid" /></td>
			</tr>
			<tr>
				<td>Supplier Name</td>
				<td><form:input path="supname"  /></td>
			</tr>
			
					
			<tr>
				<td>Supplier address</td>
				<td><form:input path="supaddrs" /></td>
			</tr>
			
			<tr><td>
			<td colspan="2"><input type="submit" /></td></td>
			</tr>
</table>
</form:form>

<!-- Displaying the Product data using Table -->
<table cellspacing="2" align="center" border="1">

	<tr bgcolor="pink">
		<td>Supplier ID</td>
		<td>Supplier Name</td>
		<td>Supplier Address</td>
		<td>Operation</td>
		
		</tr>
	<c:forEach items="${suplist}" var="supplier">
		<tr bgcolor="cyan">
			<td>${supplier.supid}</td>
			<td>${supplier.supname}</td>
			<td>${supplier.supaddrs}</td>
			<td><a href="<c:url value="deleteSupplier/${supplier.supid}"/>">Delete</a>
				<a href="<c:url value="updateSupplier/${supplier.supid}"/>">Update</a>
			</td>
		</tr>
	</c:forEach>
</table>
<!-- Completed Displaying Table -->
<%@include file="Footer.jsp" %>


</body>
</html>

