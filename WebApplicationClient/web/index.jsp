<!DOCTYPE html>
<html>
    <%@include file="templates\head.jsp" %>
<body>   
	<!-- header-section-starts -->
	<div class="header">
            <div class="top-header">
			<div class="wrap">
                            
				<div class="header-right">
					<ul>
						<li>
							<i class="user"></i>
							<%if (session.getAttribute("userid")!=null){ %>
                                                        <a href="viewAccount.jsp"><%out.print(session.getAttribute("useremail"));%></a>
                                                        <%} else{ %>
                                                        <a href="login.jsp">Login</a>
                                                        <% } %>
						</li>
                                                
                                                <%if (session.getAttribute("userid")!=null){ %>
                                                <li>
							<i class="cart"></i>
							<a href="#">Shopping Cart</a>
						</li>
						<li class="last">5</li>
                                                <%}%>
                                                
						<li class="login">
							<i class="lock"></i>
							<%if (session.getAttribute("userid")!=null){ %>
							<a href="logout.jsp">Logout</a>
                                                        <%} else{ %>               
							<a href="register.jsp">Sign up</a>
                                                        <% } %>
						</li>
						
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="wrap">
                    <hr/>
    
			<div class="header-bottom">
				<div class="logo">
					<a href="index.jsp"><img src="images/logo-4227.png" class="img-responsive" alt="" /></a>
				</div>
				
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- header-section-ends -->
	<div class="wrap">
            <%@include  file="templates\navigator.jsp" %>
		<div class="main-top">
			<div class="col-md-8 banner">
				<!-- start slider -->
				<!----->
				<div class="slider">	  
					  <div class="callbacks_container">
						  <ul class="rslides" id="slider">
							 <li>
								 <img src="images/slider1.jpg" alt=""/>
							 </li>
							 <li>
								 <img src="images/slider2.jpg" alt=""/>
							 </li>
							 <li>
								 <img src="images/slider3.jpg" alt=""/>
							 </li>
							 <li>
								 <img src="images/slider4.jpg" alt=""/>
							 </li>
						  </ul>	      
					  </div>
				</div>
				<!----->
				<!-- end  slider -->
		   </div>
		   <div class="col-md-4 right-grid">
				<div class="right-grid-top">
					<div class="r-sale text-center">
						<h6>Winter wear</h6>
						<h2>Sale</h2>
					</div>
					<div class="r-discount">
						<span>upto</span>
						<h2>50%</h2>
						<p>OFF</p>
						<a href="#">shop now<i class="go"></i></a>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="right-grid-bottom">
					<div class="right-grid-bottom-left">
						<h3>Deal of the Day</h3>
						<p>Expires in 3:42:56</p>
						<h5>Wireless Headphones</h5>
						<h2>Extra 33% OFF</h2>
						<a href="single.jsp">shop now<i class="go"></i></a>
					</div>
					<div class="right-grid-bottom-right">
						<img src="images/headset.png" alt="" />
					</div>
					<div class="clearfix"></div>
				</div>
		   </div>
		   <div class="clearfix"></div>
		</div>
		<div class="new-arrivals text-center">
			<div class="col-md-3 new-arrival-head">
				<h3>New Arrivals</h3>
				<a class="btn btn-1 btn-1d" href="products.jsp">View All</a>
			</div>
			<div class="col-md-3 product-item">
				<a href="products.jsp"><img src="images/watch.jpg" class="img-responsive" alt="" /></a>
				<h3>Arrival One</h3>
				<a href="single.jsp">Shop Now<i class="go"></i></a>
			</div>
			<div class="col-md-3 product-item">
				<a href="products.jsp"><img src="images/men-jacket.jpg" class="img-responsive zoom-img" alt="" /></a>
				<h3>Arrival Two</h3>
				<a href="single.jsp">Shop Now<i class="go"></i></a>
			</div>
			<div class="col-md-3 product-item">
				<a href="products.jsp"><img src="images/shoes.jpg" class="img-responsive zoom-img" alt="" /></a>
				<h3>Arrival Three</h3>
				<a href="single.jsp">Shop Now<i class="go"></i></a>
			</div>
			<div class="clearfix"></div>
		</div>
		<div class="best-sellers">
			<div class="best-sellers-head">
				<h3>Bestsellers</h3>
			</div>

			<div class="clearfix"></div>
		</div>
		<div class="device">
			<div class="course_demo">
		          <ul id="flexiselDemo">	
					<li>
						<div class="ipad text-center">
							<img src="images/phone.jpg" alt="" />
							<h4>Wine 1</h4>
							<h3>Price1</h3>
							<ul>
								<li><i class="cart-1"></i></li>
								<li><a class="cart" href="#">Add To Cart</a></li>
							</ul>
						</div>
					</li>
                                        
                                        <li>
						<div class="ipad text-center">
							<img src="images/phone.jpg" alt="" />
							<h4>Wine 1</h4>
							<h3>Price1</h3>
							<ul>
								<li><i class="cart-1"></i></li>
								<li><a class="cart" href="#">Add To Cart</a></li>
							</ul>
						</div>
					</li>
                                        
                                        <li>
						<div class="ipad text-center">
							<img src="images/phone.jpg" alt="" />
							<h4>Wine 1</h4>
							<h3>Price1</h3>
							<ul>
								<li><i class="cart-1"></i></li>
								<li><a class="cart" href="#">Add To Cart</a></li>
							</ul>
						</div>
					</li>
									    	  	       	   	  									    	  	       	   	    	
				</ul>
	  </div>
	  </div>
	  <div class="clients">
		
			<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
				<script type="text/javascript">
			$(window).load(function() {
				$("#flexiselDemo1").flexisel({
					visibleItems: 7,
					animationSpeed: 1000,
					autoPlay: false,
					autoPlaySpeed: 3000,    		
					pauseOnHover: true,
					enableResponsiveBreakpoints: true,
			    	responsiveBreakpoints: { 
			    		portrait: { 
			    			changePoint:480,
			    			visibleItems: 1
			    		}, 
			    		landscape: { 
			    			changePoint:640,
			    			visibleItems: 2
			    		},
			    		tablet: { 
			    			changePoint:768,
			    			visibleItems: 3
			    		}
			    	}
			    });
			    
			});
		</script>
		<script type="text/javascript" src="js/jquery.flexisel.js"></script>
		</div>
		<div class="transport-grid">
			<div class="col-md-4 shipping">
				<h3><i class="shipping-icon"></i>Free Shipping</h3>
				<p>Syphogrants called into the council chamber, and these are changed every day. It is a fundamental rule of their government,</p>
			</div>
			<div class="col-md-4 shipping">
				<h3><i class="correct-icon"></i>100 % Original</h3>
				<p>Syphogrants called into the council chamber, and these are changed every day. It is a fundamental rule of their government,</p>
			</div>
			<div class="col-md-4 return">
				<h3><i class="return-icon"></i>Free Return</h3>
				<p>Syphogrants called into the council chamber, and these are changed every day. It is a fundamental rule of their government,</p>
			</div>
			<div class="clearfix"></div>
		</div>
	  </div>
	 <%@include file="templates/footer.jsp"%>
</body>
</html>