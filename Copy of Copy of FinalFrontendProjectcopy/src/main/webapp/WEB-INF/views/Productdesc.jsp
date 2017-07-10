<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Header.jsp"%>
<table width="60% align="center" border="1">
			<tr bgcolor="pink">
				<td colspan="3"><center>Product Description</center></td>
			</tr>
			<tr rowspan="6"><img src="<c:url value="/resorces/${product.prodid}.jpg"/>"alt ="Generic placeholder thumbnail"/>
			</tr>
			<tr>
				<td >Product ID</td>
				<td>${prodinfo.prodid}</td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td>${prodinfo.prodname}</td>
			</tr>
			
			<tr>
				<td>Supplier</td>
				<td>${prodinfo.supid}</td>
			</tr>
			<tr>
				<td>Price</td>
				<td>${prodinfo.price}</td>
			</tr>
			<tr>
				<td>Product Desc</td>
				<td>${prodinfo.prodesc}</td>
			</tr>
		<tr>
			
		<td><td>
		</td>
		<form action="<c:url value="/addtocart/${prodinfo.prodid}"/>" method="get" >
		Quantity<input type="text" name="quantity" class="form-control btn-block "/>
		<input type="submit" value="addtocart" class="btn btn-xs btn-success btn-block"/>
		</form>
		</table>


</body>
</html>