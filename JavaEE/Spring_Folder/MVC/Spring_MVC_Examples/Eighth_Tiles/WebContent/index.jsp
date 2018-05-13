<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Trip Guide a Travel Agency Category Flat Bootstrap Responsive website Template | Home :: w3layouts</title>
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
					<span>Best Travel Packages Available</span>
					<div class="promotion-grids">
						<div class="col-md-4 promation-grid">
							<img src="images/it1.jpeg" class="img-thumbnail" alt=""/>
							<div class="prom-text">
								<h4>International</h4>
								
						
							</div>
						</div>
						<div class="col-md-4 promation-grid">
							<img src="images/dm1.jpeg" class="img-responsive" alt=""/>
							<div class="prom-text">
								<h4>Domestic</h4>
								
								
							</div>
						</div>
						<div class="col-md-4 promation-grid">
							<img src="images/couple1.jpeg" class="img-responsive" alt=""/>
							<div class="prom-text">
								<h4>Couple</h4>
						
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="promotion-grids">
						<div class="col-md-4 promation-grid">
							<img src="images/honeym.jpeg" class="img-responsive" alt=""/>
							<div class="prom-text">
								<h4>Honeymoon</h4>
								
							</div>
						</div>
						<div class="col-md-4 promation-grid">
							<img src="images/kids.jpeg" class="img-responsive" alt=""/>
							<div class="prom-text">
								<h4>Little champ</h4>
								
							</div>
						</div>
						<div class="col-md-4 promation-grid">
							<img src="images/advnt.jpeg" class="img-responsive" alt=""/>
							<div class="prom-text">
								<h4>Adventure</h4>
								
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<!--about--->
				
			<!--gallery-->
				
				<script type="text/javascript" src="js/jquery.hoverdir.js"></script>	
				<script type="text/javascript">
					$(function() {
						$('#da-thumbs > li').each( function() { $(this).hoverdir(); } );
					});
				</script>
			</div>
		</div>

			<!--gallery-->
			<!-- team -->
			
			<!--news-->
		</div>
			<div class="contact"  id="contact">
				<div class="container">
					<h3 class="tittle">Contact</h3>
					<div class="contact-grids">
						<form action="#" method="post">
							<div class="col-md-6 grid-contact">
								<div class="your-top">
									<i class="glyphicon glyphicon-user"> </i>
									<input type="text" name="Name" placeholder="Name"  required >								
									<div class="clearfix"> </div>
								</div>
								<div class="your-top">
									<i class="glyphicon glyphicon-envelope"> </i>
									<input type="text" name="E-mail" placeholder="E-mail"  required>								
									<div class="clearfix"> </div>
								</div>
								<div class="your-top">
									<i class="glyphicon glyphicon-link"> </i>
									<input type="text" name="Website" placeholder="Website"  required>								
									<div class="clearfix"> </div>
								</div>
								
							</div>
							<div class="col-md-6 grid-contact-in">
								<textarea name="Message"  placeholder=" Message"  required></textarea>
								<input type="submit" value="Send">
							</div>
							<div class="clearfix"> </div>
						</form>
					</div>
					<div class="google-map">
						<iframe src="https://www.google.com/maps/embed?pb=!1m16!1m12!1m3!1d58888647.94218372!2d-103.76180439324321!3d25.728324341247273!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!2m1!1stravel+agents+near+USA!5e0!3m2!1sen!2sin!4v1462507725713"  frameborder="0" style="border:0" allowfullscreen></iframe>
					</div>
				</div>
			</div>
		<!--footer-->
			<div class="copy-section">
				<div class="container">
					<div class="footer-top">
						<p>&copy; 2016 Trip Guide. All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
					</div>
				</div>
			</div>
			<script type="text/javascript">
						$(document).ready(function() {
							/*
							var defaults = {
					  			containerID: 'home', // fading element id
								containerHoverID: 'toTopHover', // fading element hover id
								scrollSpeed: 1200,
								easingType: 'linear' 
					 		};
							*/
							
							$().UItoTop({ easingType: 'easeOutQuart' });
							
						});
					</script>
				<a href="#" id="home" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
			<div class="modal fade" id="myModal1" tabindex="-1" role="dialog">
				<div class="modal-dialog" role="document">
					<div class="modal-content modal-info">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
						</div>
						<div class="modal-body">
							<div class="news-gr">
							<img src="images/p6.jpg" class="img-responsive" />
							<h3 class="tittle1">Trip Guide</h3>
								<p>Nam aliquam pretium feugiat. Duis sem est, viverra eu interdum ac, suscipit nec mauris. Suspendisse commodo tempor sagittis! In justo est, sollicitudin eu scelerisque pretium, placerat eget elit. Praesent faucibus rutrum odio at rhoncus. Pel ermentum pretium. Maecenas ac lacus ut neque rhoncus laoreet sed id tellus. Donec justo tellus.</p>

							</div>
						</div>
					</div>
				</div>
			</div>
</body>
</html>
