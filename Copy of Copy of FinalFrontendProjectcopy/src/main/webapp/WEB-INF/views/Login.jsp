<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<style type="text/css">
h2{
font-family: Times New Roman;
	font-size: 3em;
	font-weight: bold;
	color:#1133;
	}
.background {
	background-color:#FFCCFF;
		background-size:100%;
}
div{
color:#ff0000;
font-weight: bold;

}
</style>
</head>
 <body style="background-color:#FFCCFF">
  
  <div class="background">  
  <br>
<br>
<br>
<br>
<br>
 
            <form:form action="isValidUser" method="post" modelAttribute="user" role="form">
	   <center><h2 style="color:black;font-weight: bold;font-family: Baskerville Old Face;">Login page</h2></center>
	  
	   <table  cellspacing="10" cellpadding="2" width="45%" 
			align="center">
<tr>
<td style="color:black;font-weight: bold;font-family: Baskerville Old Face;font-size: 1.5em;" > username<p></td>
<td ><input type="text" id="username" name="username" size="22" value="" required/><p></td>
</tr>

<tr>
<td style="color:black;font-weight: bold;font-family: Baskerville Old Face;font-size: 1.5em;">password<p></td>
<td ><input type="password" id="password" name="password" size="22" value="" required /><p></td>
</tr>
<tr>
<td></td>
<td><input type="submit" style="color:black;" value="Login"></td>
</tr></table>
</form:form>
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
</div>
<%@include file="Footer.jsp" %>

</body>
</html>
