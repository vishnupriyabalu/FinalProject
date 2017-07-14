<%@ page language="java" contentType="text/html"%>
<%@include file="Header.jsp" %>

 <title> My Project</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" type="text/css" href="new 2.css">
 
 
 <link rel="stylesheet" 
 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style type="text/css">

.background{
	background-color:#FFCCFF;
	background-size:100%;
}
</style>

 </head>
 <body class="background">
 <div class="container">
            <form align="center" name="myform" class="form-horizontal" action="InsertUser" modelAttribute="user" method="post" role="form">
                <h2 align="center">Registration Form</h2>
                <div class="form-group">
							< <label for="name" class="col-sm-3 control-label">Name</label>
                 <div class="col-sm-6">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="name" id="name" minlength="2" maxlength="30" pattern="[A-Z][A-za-z\s]{2,30}" placeholder="Enter your Name" title=" First char should be Uppercase followed by lowercase;no digits allowded;Minchar:2;Maxchar:30" required/>
								</div>
							</div>
						</div>
				<div class="form-group">
							<label for="username" class="col-sm-3 control-label">Username</label>
							<div class="col-sm-6">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="username" pattern="[a-z0-9]{5,30}" minlength="5" maxlength="30" id="username" title="Lowercase followed by atleast 2 digits;no space Minchar:5;Maxchar:30" placeholder="Enter your Username" required >
								</div>
							</div>
						</div>

                <div class="form-group"style="color:black;">
							<label for="email" class="col-sm-3 control-label">Email</label>
							<div class="col-sm-6">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="email" id="email"  placeholder="Enter your Email" onchange="email_validate(this.value);"required/>
								</div>
								<div class="status" id="status"></div>
							</div>
						</div>
                <div class="form-group"style="color:black;">
							<label for="password" class="col-sm-3 control-label">Password</label>
							<div class="col-sm-6">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<input type="password" class="form-control" name="password" id="password"  placeholder="Enter your Password" minlength="6" maxlength="16" title="Minchar:6;Maxchar:16" data-content="Enter Password...."required/>
								</div>
							</div>
						</div>
              <div class="form-group"style="color:black;">
							<label for="confirm" class="col-sm-3 control-label">Mobile</label>
							<div class="col-sm-6">
								<div class="input-group">
									<span class="input-group-addon"><i class="glyphicon glyphicon-phone" aria-hidden="true"></i></span>
									<input id="mobile" class="form-control" type="text" name="mobile" placeholder="Phone Number" onkeyup="validatephone(this);"pattern="[7-9]{1}[0-9]{9}"required/> </span>
 								
								</div>
							</div>
						</div>
             		                <div class="form-group">
                    <div class="col-sm-6 col-sm-offset-1">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" required>I accept <a href="#">terms</a>
                            </label>
                        </div>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <div class="col-sm-2 col-sm-offset-3">
                        <button type="submit" class="btn btn-primary btn-block">Register</button>
                    </div>
                </div>
            </form> <!-- /form -->
        </div> <!-- ./container -->
<script type="text/javascript">
function email_validate(email) {
			var regMail = /^([_a-zA-Z0-9-]+)(\.[_a-zA-Z0-9-]+)*@([a-zA-Z0-9-]+\.)+([a-zA-Z]{2,3})$/;
			if (regMail.test(email) == false) {
				document.getElementById("status").innerHTML = "<span class='warning'>Email address is not valid yet.</span>";
			} else {
				document.getElementById("status").innerHTML = "<span class='valid'>Thanks, you have entered a valid Email address!</span>";
			}
		}
function validatephone(mobile) {
	
	    var pass1 = document.getElementById('mobile');
	    var message = document.getElementById('message');
	  /*  var goodColor = "#0C6";
	    var badColor = "#FF9B37"; */
	    if(phone.value.length!=10){
	        /* phone.style.backgroundColor = badColor;
	        phone.style.color = badColor; */
	        message.innerHTML = "required 10 digits, match requested format!"
	    }else{
	    	message.innerHTML="phone number is valid"
	    }
	    }


	</script>
	<%@include file="Footer.jsp" %>
</body>
</html>
