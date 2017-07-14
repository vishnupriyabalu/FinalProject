<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Headeraftrlogin.jsp"%>
<body style="background-color:#FFCCFF">

<table cellspacing="3" align="center">
<tr bgcolor="gray">
<td colspan="7"><center><h3>Shopping Cart</h3></center></td>
</tr>
<tr bgcolor="cyan">
<td>Product Name</td>
<td>Product Id</td>
<td>Quantity</td>
<td>SubTotal</td>
<td>Image</td>
<td>Operation</td>
</tr>

<c:forEach items="${cartitems }" var="cartitem">
<tr>
<form action="<c:url value="/updatecartitems/${cartitem.citemid }" />" />
<td>${cartitem.prodname }</td>
<td><input type="text" value="${cartitem.quantity}"name="quantity" required/></td>
<td>RS.${cartitem.price * cartitem.quantity}</td>
<td><img src="<c:url value='/resources/${cartitem.prodid}.jsp'/>" width="100" height="100">
<td>
<input type="submit" value="UPDATE" class="btn-success btn-block"/>
<a href="<c:url value="/deletecartitem/${cartitem.citemid }" />">DELETE </a>
</td>
</tr>
</c:forEach>
<tr>

<br>
<td><a href="<c:url value="/checkout" />"> <b><h4>OrderConfirm</h4></b></a></td>
</tr>
</table>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>




<%@include file="Footer.jsp" %>


</body>
</html>