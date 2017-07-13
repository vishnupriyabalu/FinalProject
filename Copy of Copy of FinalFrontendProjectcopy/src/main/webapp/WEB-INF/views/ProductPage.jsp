<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<%@include file="Headeraftrlogin.jsp"%>
<body style="background-color:#FFCCFF">

<div id="container">
<c:forEach items="${prodlist}" var="product">

<div class="column">
<div class="col-sm-6 col-md-4">

<a href="productdesc/${product.prodid}" class="thumbnail">
<img src="<c:url value="/resources/${product.prodid}.jpg"/>" alt="Generic placeholder thumbnail" width=50%" height="50%"/>
</a>

<div class="caption">
<h4>${product.prodname}</h4>

<p>Rs.${product.price}</p>
<p>${product.pimage}</p>
</div>
</div>
</div>
</c:forEach>
</div>
<br></div>

<br><br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br><br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br><br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

<%@include file="Footer.jsp" %>

</body>
</html>
