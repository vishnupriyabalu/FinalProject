<%@ page language="java" contentType="text/html"%>
 
 <%@include file="WEB-INF/views/Header.jsp" %>
 <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
 width:40% ;
 height:70 px;
      margin: auto;
  }
</style> 
</head>

<body>


 <div class="container-fluid">
 
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>
    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="http://www.hdwallpapers.in/download/christmas_presents-1920x1200.jpg" alt="gift" width="450 pixel" height="400 pixel">
      </div>

      <div class="item">
        <img src="http://www.hdwallpapers.in/download/wall_e_happy_birthday_4k-1920x1200.jpg" alt="gift" width="450 pixel" height="400 pixel">
      </div>
    
      <div class="item">
        <img src="http://www.hdwallpapers.in/download/christmas_tree_bokeh-1920x1200.jpg" alt="gift" width="450 pixel" height="400 pixel">
      </div>

      <div class="item">
        <img src="http://www.hdwallpapers.in/download/love_heart_candy_pair-1920x1200.jpg" alt="gift" width="450 pixel" height="400 pixel">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<center><h3>Gifts of the heart can't be claimed by anyone except the giver.</h3> 
<p>We are here to help you to give the best of everthing</p></center>
<!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

       <!-- Three columns of text below the carousel -->
      <div class="w">
        <div class="col-lg-4">
          <img class="img-square" src="http://dreamatico.com/data_images/gift/gift-7.jpg" alt="Generic placeholder image" width="140" height="140">
          <h2>gifts for family</h2>
          <p>In this Category you will find the 
		  home decorating articles</p>
      <!--     <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p> -->
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-square" src="http://www.learnvest.com/wp-content/uploads/2013/12/pile-of-gifts.jpg" alt="Generic placeholder image" width="140" 

height="140">
          <h2>Glass articles</h2>
          <p>In this category you will find
		  Valuable glass items</p>
        <!--   <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p> -->
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
		 <img class="img-square" src="http://www.irvingcares.org/wp-content/uploads/2013/11/gift-in-hand-art.jpg" alt="Generic placeholder image" width="140" height="140">
         
           <h2>Greeting Cards</h2>
          <p>In this Category you will find Greeting Cards</p>
         <!--  <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p> -->
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->


      <!-- START THE FEATURETTES -->

     
     

      <hr class="feature-divider">

      <div class="rowe">
        <div class="col-md-11">
          <h2 class="featurette-heading"> <span class="text-muted">Happiness is??</span></h2>
          <p class="lead">The Gift of Truth excels all other Gifts..Gifts of the heart can't be claimed by anyone except the giver..Make ur love feel special..It is impossible to love and to be wise but love and care have the power to do it</p>
        </div>
        <div class="col-md-5">
          <img class="featurette-image img-responsive center-block" src="http://3.bp.blogspot.com/-2ExpuN9Y__g/VqnI7Tk8awI/AAAAAAAANro/d--6cU47aOc/s640/lovely-valentine-day-animation-image.gif" alt="Generic placeholder image">
        </div>
      </div>
      <hr class="feature-divider">

      <div class="rowe">
        <div class="col-md-11">
          <h2 class="featurette-heading"> <span class="text-muted">Gift is not just giving,it is a feel good factor presented to that relationship.</span></h2>
          <p class="lead">We should give as we would receive, cheerfully, quickly, and without hesitation.The manner of giving is worth more than the gift.Pleasure is spread through the earth
In stray gifts to be claimed by whoever shall find.
          </p>
        </div>
        <div class="col-md-11">
          <img class="featurette-image img-responsive center-block" src="http://static.squarespace.com/static/5176fdb5e4b083b631f31303/t/529f9883e4b0d8a34325bd13/1386190991178/gift-gif3.gif" alt="Generic placeholder image">
        </div>
      </div>
</div>

      <!-- /END THE FEATURETTES -->



<br>
<br>


 <a href="Category">Category</a>
 <a href="pro">Product</a>
 <a href="abc">Supplier</a>
 <a href="Admin">Admin</a>
 





  
<%@include file="WEB-INF/views/Footer.jsp" %>


</body>
</html>
