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
	background-image: url("http://cdn.wallpapersafari.com/12/67/ar1clU.png");
	background-size:100%;
}
</style>

 </head>
 <body class="background">
 <div class="container">
            <form align="center" name="myform" class="form-horizontal" action="InsertUser" modelAttribute="user" method="post" role="form">
                <h2 align="center">Registration Form</h2>
                <div class="form-group">
                    <label for="username" class="col-sm-3 control-label">Name</label>
                    <div class="col-sm-6">
                       <input type="text" class="form-control" name="username" pattern="[A-Z][a-z]{1,15}" minlength="6" maxlength="16" title="First should be Uppercase followed lowercase,no white space or symbols,min char:6"
										placeholder="Username" id="username" required />
							  <span class="help-block"> Name eg.: Smith, Harry</span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email</label>
                    <div class="col-sm-6">
                       <input class="form-control" required type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$"
									title="eg:abc@gmail.com"	placeholder="Email" name="email" id="email"
										onchange="email_validate(this.value);" />
							 </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Password</label>
                    <div class="col-sm-6">
                        <input required name="password" type="password" 
										class="form-control inputpass" placeholder="Enter Password" minlength="6" maxlength="16" title="min char should be 6"
										id="password" />
				</div>
                </div>
                  
              <div class="form-group">
                    <label for="mobile" class="col-sm-3 control-label">Mobile</label>
                    <div class="col-sm-6">
                        <input required name="mobile" type="text" 
										class="form-control inputpass" placeholder="Enter Phonenumber" length="10" title="Compulsary 10 digits,starts only with(7,8,9)"
						id="mobile" onkeyup="validatephone(this);"pattern="[7-9]{1}[0-9]{9}"required />
						
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
