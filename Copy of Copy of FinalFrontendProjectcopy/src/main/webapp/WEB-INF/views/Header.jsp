<%@ page language="java" contentType="text/html"%>
 <html>
 <head>
 <title>GiftsPlazza</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" 
 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
 <body>
 
 <!-- Starting the Navbar Code -->
 
 <nav class="navbar navbar-inverse">
 	<div class="container-fluid">
 	
 	<div class="navbar-header">
 	 <a href="index.jsp" class="pull-left"><img src="http://www.hdwallpapers.in/walls/colorful_gifts_for_christmas-wide.jpg" width="70" height="50"></a>
     <div class="navbar-brand">GiftsPlazza</div>
  
      <!--- 	<a class="navbar-brand" href="index.jsp">Gifts</a>  ---->
     	</div>
 	
   	 <ul class="nav navbar-nav">
       		<li class="active"><a href="index.jsp"><span class="glyphicon glyphicon-home"></span>Home</a></li>
       		<li><a href="Login"><span class="glyphicon glyphicon-search"></span>Login</a></li>
       		<li><a href="Register"><span class="glyphicon glyphicon-search"></span>Register</a></li>
       		<li><a href="About">AboutUs</a></li>
       		<li><a href="displayProduct">Product page</a></li>
       		<li><a href="Contact">ContactUs</a></li>
     	</ul>
     	 <div class="nav navbar-nav navbar-right">
 	  <c:if test="${not empty successlogin}">
						<li><a href="Login">Signin<span
							class="glyphicon glyphicon-log-out"></span></a></li>
				</c:if>
 	  </div>
 
 	  
 	</div>
 </nav>
 
 </body></html>