<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Headeraftrlogin.jsp"%>
<body  style="background-color:#FFCCFF">
<table width="50% align="center" border="1">
			<tr bgcolor="pink">
				<td colspan="2"><center>Product Description</center></td>
			</tr>
			<tr rowspan="6"><img src="<c:url value="/resources/${productinfo.prodid}.jpg"/>"alt ="Generic placeholder thumbnail"/>
			</tr>
				<tr>
				<td>Product Name</td>
				<td>${prodinfo.prodname}</td>
			</tr>
			
				<tr>
				<td>Price</td>
				<td>${prodinfo.price}</td>
			</tr>
			<tr>
				<td>Product Desc</td>
				<td>${prodinfo.proddesc}</td>
			</tr>
		
	<!--	<tr>	
		
		<td>
		<form action="<c:url value="/addtocart/${prodinfo.quantity}"/>" method="get" >
		Quantity<select>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  <option value="7">7</option>
  <option value="8">8</option>
  <option value="9">9</option>
  <option value="10">10</option>  
</select></td><td> -->
<tr>
				<td>Quantity</td>
				<td>${prodinfo.quantity}</td>
			</tr>
		<input type="submit" value="addtocart" class="btn btn-xs btn-success btn-block"/>
		</form></td></tr>
		</table>

<br><br><br><br><br><br><br><br><br><br><br>
<%@include file="Footer.jsp" %>

</body>
</html>