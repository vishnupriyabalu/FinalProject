<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Headeraftrlogin.jsp"%>
<body style="background-color:#FFCCFF">

<table cellspacing="3" align="center">
<tr bgcolor="gray">
<td colspan="4"><center><h3>Shopping Cart</h3></center></td>
</tr>
<tr bgcolor="pink">
<td>Product Name</td>
<td>Quantity</td>
<td>SubTotal</td>
<td>Image</td>
</tr>
<c:forEach items="${cartitems}" var="cartitem">
<tr>
<td>${cartitem.prodname}</td>
<td>${cartitem.quantity}</td>

<td><input type="text" value="${cartitem.quantity}" name="quantity" required/></td>
<td>${cartitem.price*cartitem.quantity}</td>
<td><img src="<c:url value="/resorces/${cartitem.prodid}.jpg" /> " width="100" height="60" />
</td>
</tr>
<tr>
<td colspan="3">GrandTotal</td>
<td>${grandtotal}</td>
</tr>
</c:forEach></table>
<table cellspacing="3" cellpadding="2" align="center">
<tr bgcolor="gray">
<td colspan="2">Payment Information</td>
</tr>
<tr>
<td>PaymentMode</td><td>
<input type="radio" name="pmode" value="CC"/>CreditCard
<input type="radio" name="pmode" value="IB"/>InternetBanking
<input type="radio" name="pmode" value="CC"/>Cash on Delivery
</td></tr>
<tr bgcolor="gray" >
<td colspan="2"><input type="submit" value="pay"/></td>
</tr>
</table>
</body>
</html>