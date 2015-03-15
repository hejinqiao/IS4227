<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<%@include file="templates/head.jsp"%>
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
		<!-- start login -->
		<section id="main">
	<div class="new-product">
				<div class="new-product-top">
				<div class="pag-nav">
					<ul class="p-list">
						<li><a href="index.jsp">Home</a></li> &nbsp;&nbsp;/&nbsp;
						<li class="act">&nbsp;Contact</li>
					</ul>
				</div>
				<div class="coats">
			        <h3 class="c-head">contact-us</h3>
		        </div>
					<div class="clearfix"></div>
				</div>
				<div class="singel_right">
			     <div class="lcontact span_1_of_contact">
                                 (Please login before you submit inquiry)
                                 <div class="clearfix"></div>
				      <div class="contact-form">
                                            <form method="post" action="contactPost.jsp">
                                                <p class="comment-form-author"><label for="author">Message:</label>
                                                    <textarea name="content" value="Enter your message here..." onfocus="this.value = '';" onblur="if (this.value === '') {this.value = 'Message';}">Enter your message here...</textarea>
                                                </p>
                                                <input name="submit" type="submit" id="submit" value="Submit">
                                            </form>
				       </div>
			     </div>
			     <div class="contact_grid span_2_of_contact_right">
					<h3>Address</h3>
				    <div class="address">
						<i class="pin_icon"></i>
					    <div class="contact_address">
						  Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Typi non
					    </div>
					    <div class="clearfix"></div>
					</div>
					<div class="address">
						<i class="phone"></i>
					    <div class="contact_address">
						   1-25-2568-897
					    </div>
					    <div class="clearfix"></div>
					</div>
					<div class="address">
						<i class="mail"></i>
					    <div class="contact_email">
						  <a href="mailto:example@gmail.com">info(at)company.com</a>
					    </div>
					    <div class="clearfix"></div>
					</div>
		        </div>
		        <div class="clearfix"></div>
		    </div>
		  
			</div>
			<div class="clearfix"></div>
		</div>
              <%@include file="templates/contact.jsp"%>
</body>
</html>