<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="Header.jsp"%>
<table cellspacing="3" align="center">
<tr>
<td colspan="5"><center><h3>Shpping Cart</h3></center></td>
</tr>
<tr bgcolor="pink">
<td>Product Id</td>
<td>Quantity</td>
<td>SubTotal</td>
<td>Image</td>
<td>Operation</td>
</tr>

<c:forEach items="${cartitems}" var="cartitem">
<tr>
<td>${cartitem.prodname}</td>
<td>${cartitem.quantity}</td>
<td>${cartitem.price*cartitem.quantity}</td>
<td><img src="<c:url value="/resorces/${cartitem.prodid}.jpg" /> " />
</td>
<td>
<input type="submit" value="UPDATE" class="btn-success btn-block"/>
<input type="submit" value="DELETE" class=""/>
</td>
</tr>

</c:forEach></table>

</body>
</html>