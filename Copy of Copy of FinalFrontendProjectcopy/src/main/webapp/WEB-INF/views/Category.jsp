<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="Adminhome.jsp" %>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,height=device-height,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
<title>Category</title>
<style type="text/css">
.body {
	background-image: url("http://www.powerpointhintergrund.com/uploads/orange-ppt-background-1.jpg");
	background-size:100%;
}
</style>
</head>
<body class="body">
<!-- Category Form Started -->
<c:if test="${!flag}">
<form action=UpdateCategory" method="post">
</c:if>
<c:if test="${flag}">
<form action="AddCategory"  method="post">
</c:if>
<table align="center" cellspacing="2">
	<tr>
		<td colspan="2">Category Details</td>
		<c:if test="${flag}">
		<input type="hidden" name="catid" value="${category.catid }"/>
		</c:if>
	</tr>
	<tr>
	
	<td>Category Name</td>
	<c:if test="${flag}">
	<td><input type="text" name="catname" value="${category.catname }"/></td>
		</c:if>
	<c:if test="${!flag}">	
	<td><input type="text" name="catname"/></td>
	</c:if>
	</tr>
	<tr>
	<td>Category Description</td>
	<c:if test="${flag}">
	<td><input type="text" name="catdesc" value="${category.catdesc }"/></td>
	</c:if>
	<c:if test="${!flag}">
	<td><input type="text" name="catdesc"/></td>
	</c:if>
	</tr>
	<tr>
	<td colspan="2">
		<input type="submit" value="AddCategory"/>
	</td>
	</tr>
</table>
</form>
<!-- Category Form Completed -->
<!--------Displaying the category Data using table--------->
<table cellspacing="2" align="center" border="1">
<tr bgcolor="pink">
<td>Category Id</td>
<td> Category Name</td>
<td>Category Desc</td>
<td> Operation</td>
</tr>
<c:forEach items="${catdetail }" var="category">
<tr bgcolor="cyan">
<td>${category.catid}</td>
<td>${category.catname }</td>
<td>${category.catdesc }</td>
<td>
<a href="<c:url value="deletecategory/${category.catid} "/>"> Delete</a>
<a href="<c:url value="updatecategory/${category.catid} "/>">Update</a>
</td>
</tr>
</c:forEach>
</table>
  
<%@include file="Footer.jsp" %>


</body>
</html>
