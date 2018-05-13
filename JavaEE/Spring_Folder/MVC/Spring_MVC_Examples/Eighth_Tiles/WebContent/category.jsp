<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<link rel="stylesheet" href="css/chocolat.css" type="text/css">

<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta property="og:title" content="Vide" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="keywords" content="Trip Guide Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!---->
<script src="js/bootstrap.min.js"></script>
<!---->
<link href='//fonts.googleapis.com/css?family=Questrial' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300' rel='stylesheet' type='text/css'>
<script src="js/jquery.chocolat.js"></script>
		<!--lightboxfiles-->
		<script type="text/javascript">
		$(function() {
			$('.gallery a').Chocolat();
		});
		</script>
<!--script-->
<!--startsmothscrolling-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
 <script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();	
				$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
			});
		});
	</script>

<script src="js/modernizr.custom.97074.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
    height: 100;
    margin: 0px;
	padding:0;
}

.hero-image {
  background-image: url("giphy2.gif");
    height: 210px;
  background-position: top;
  background-repeat: no-repeat;
  background-size: 100% 100%;
  position: relative;
  margin: 0px;
  padding-top: 0px;
}
.kachra{
background-image: url("1.jpg") ;
 border: solid 0px #000000; 
 width: 150px; 
 height: 22px;" 
 }
.hero-text {
  text-align: center;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: white;
  margin:0px;
}

.hero-text button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 10px 25px;
  color: black;
  background-color: #ddd;
  text-align: center;
  cursor: pointer;
}

.hero-text button:hover {
  background-color: #555;
  color: white;
  margin:0px;
}
body {
    padding-top: 50px;
}
.dropdown.dropdown-lg .dropdown-menu {
    margin-top: -1px;
    padding: 6px 20px;
}
.input-group-btn .btn-group {
    display: flex !important;
}
.btn-group .btn {
    border-radius: 0;
    margin-left: -1px;
}
.btn-group .btn:last-child {
    border-top-right-radius: 4px;
    border-bottom-right-radius: 4px;
}
.btn-group .form-horizontal .btn[type="submit"] {
  border-top-left-radius: 4px;
  border-bottom-left-radius: 4px;
}
.form-horizontal .form-group {
    margin-left: 0;
    margin-right: 0;
}
.form-group .form-control:last-child {
    border-top-left-radius: 4px;
    border-bottom-left-radius: 4px;
}

@media screen and (min-width: 768px) {
    #adv-search {
        width: 500px;
        margin: 0 auto;
    }
    .dropdown.dropdown-lg {
        position: static !important;
    }
    .dropdown.dropdown-lg .dropdown-menu {
        min-width: 500px;
    }
}
</style>
</head>
<body>
<div class="hero-image">
<div class="hero-text">
    <h1 style="font-size:50px">E-Tour</h1>
  </div>
 </div>
<div class="header">
		<div class="container">
			<div class="header-menu">
				<nav class="navbar navbar-default">
						<div class="container-fluid">
						<!-- Brand and toggle get grouped for better mobile display -->
						<div class="navbar-header">
						  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						  </button>
						  <div class="navbar-brand logo">
								<h1><a href="index.jsp"><span>E-Tour</span></a></h1>
							</div>
						</div>
						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						  <ul class="nav navbar-nav cl-effect-11">
							<li class="active"><a href="index.jsp" >Home </a></li>
							<li><a href="#about" data-hover="Search" class="scroll">Search</a></li>
							<li><a href="#services" data-hover="Services" class="scroll">Services</a></li>
							<li><a href="tourtab.jsp" >Tours</a></li>
							  <li><a  href="#guides" data-hover="Guides" class="scroll">Guides</a></li>
							 <li><a data-hover="Contact" href="#contact" class="scroll">Contact</a></li>
							  <li><a  href="Login.jsp" >Login</a></li>
						
						  </ul>
						  
						</div><!-- /.navbar-collapse -->
					</div><!-- /.container-fluid -->
				</nav>
			<div class="clearfix"></div>
			</div>	
		</div> 
	</div>
	</br>
	<div class="container">
	<div class="row">
		<div class="col-md-12">
            <div class="input-group" id="adv-search">
                <input type="text" class="form-control" placeholder="Search for Tours" />
                <div class="input-group-btn">
                    <div class="btn-group" role="group">
                        <div class="dropdown dropdown-lg">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><span class="caret"></span></button>
                            <div class="dropdown-menu dropdown-menu-right" role="menu">
                                <form class="form-horizontal" role="form">
                                 <div class="radio">
									<label><input type="checkbox" name="optradio1"> <b>Period</b></label>
									</br>
                                    From : 
											<input type="date" name="bday">
									To : 
											<input type="date" name="bday">
                                  </div>
                                  <div class="radio">
									<label><input type="checkbox" name="optradio2"> <b>Price Band</b></label>
									</br>
                                    From : <input type="text" name="bday">
									To:	<input type="text" name="bday">
                                  </div>
								  <div class="radio">
									<label><input type="checkbox" name="optradio3">
									 <b>Duration</b>
									</label>
                                  
									</br>
                                   From : <input type="text" name="bday">
								   To:<input type="text" name="bday">
                                  </div>
                                  <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                </form>
                            </div>
                        </div>
                        <button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                    </div>
                </div>
            </div>
          </div>
        </div>
	</div>
</div>

		<div class="content">
			<div class="promotions">			
	
      <div class="container">
      <div class="row">
<c:forEach var="images" items="${categorylist}">
     <div class="col-md-4 spacing">
     <a href="sector.do?id=${images.categoryid}&flag=${images.flag}">
 <img src="<c:url value='${images.imagepath}'/>"class="img-responsive" alt="" />
 </a >	
<a href="sector.do?catid=${images.categoryid}&flag=${images.flag}&homeid=${images.homeid}"><b>${images.categoryname}</b></a>
 </div>
  </c:forEach>
</div>
</div>
</div>
</div>

				
</body>
</html>








