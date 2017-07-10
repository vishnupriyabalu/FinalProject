<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Headeraftrlogin.jsp"%>
<h1><center>UserHome Page</center></h1>
<h3>Welcome::"${user.username}"</h3>
<div id="container">
<div class="row">
<div class="col-sm-6 col-md-3">
<c:forEach items="${prodlist}" var="product">
<a href="ProductDesc/${product.prodid }" class="thumbnail">
<img src="<c:url value="/resorces/${product.prodid}.jpg"/>"alt ="Generic placeholder thumbnail"/>
</a>

<div class="caption">
<h4>${product.prodname}</h4>
<p>${product.price}</p>
</div></c:forEach>
</div>
</div>
</div>
</body>
</html>