<%-- 
    Document   : register_result
    Created on : Mar 8, 2015, 3:35:43 PM
    Author     : WangTianQi
--%>

<!DOCTYPE html>
<html>
 <%@include file="templates\head.jsp" %>
    <body>
    <%
    
	wss.AccountMgt_Service service = new wss.AccountMgt_Service();
	wss.AccountMgt port = service.getAccountMgtPort();
	 // TODO initialize WS operation arguments here
	java.lang.String email = request.getParameter("email");
	java.lang.String password = request.getParameter("password");
	java.lang.String first = request.getParameter("first");
	java.lang.String last = request.getParameter("last");
	java.lang.String gender = request.getParameter("gender");
	// TODO process result here
	boolean result = port.registerAccount(email, password, first, last, gender);        
        
	// TODO handle custom exceptions here
    
    %>
    <%-- end web service invocation --%>

        
    
        <div class="header">
            <div class="top-header">
			<div class="wrap">
				<div class="header-right">
					<ul>
						<li>
							<i class="user"></i>
							<a href="login.jsp">Login</a>
						</li>
						<li class="login">
							<i class="lock"></i>
							<a href="register.jsp">Sign up</a>
						</li>
						
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="wrap">
			<div class="header-bottom">
				<div class="logo">
					<a href="index.jsp"><img src="images/logo-4227.png" class="img-responsive" alt="" /></a>
				</div>
				
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
       
        
        <div class="wrap">
            
        <%@include file="templates\navigator.jsp" %> 
        
          <section id="main" style="height: 300px">
        <div class="content">
            <div class="col-md-12 help text-center">
                
                <%if(result){%>
                <h3>Congratulations!</h3> 
                <p>Your account has been created, and we have sent an Activation Code to your email. </p>
                <p>Please activate your account first before login using your email address. Thanks!</p>
                <a href="activate.jsp">Click here to activate your account</a>
                <%}else{%>
                <h3>Oops!</h3> 
                <p>Your email address has already been registered. </p>
                <p>Please login using this email address.</p>
                <a href="login.jsp">Click here to login your account</a>
                <%}%>
            </div>
        
        </div>
        </div>
            
            
            
         <div class="footer">
		<div class="wrap">
			<div class="contact-section">
				<div class="col-md-4 follow text-left">
					<h3>Follow Us</h3>
					<p>On various social network platforms</p>
					<div class="social-icons">
						<i class="twitter"></i>
						<i class="facebook"></i>
						<i class="googlepluse"></i>
						<i class="pinterest"></i>
						<i class="linkedin"></i>
					</div>
				</div>
	
				<div class="col-md-offset-1 help text-right">
					<h3>Need Help?</h3>
					<p>Contact our stuff</p>
					<a href="contact.jsp">Contact us</a>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="footer-middle">
				<div class="col-md-6 different-products">
					<ul>
						<li class="first"> Shop </li> -
						<li><a href=""> Mobiles </a></li> |
						<li><a href=""> Laptops </a></li> |
						<li><a href=""> Cameras </a></li> |
						<li><a href=""> Clothing </a></li> |
						<li><a href=""> Footwear </a></li> |
						<li><a href=""> Jewellery </a></li> 
					</ul>
					<ul>
						<li class="first"> Help </li> -
						<li><a href=""> Faqs </a></li> |
						<li><a href=""> shipping </a></li> |
						<li><a href=""> payments </a></li> |
						<li><a href=""> cancellation&returns </a></li> 
					</ul>
					<ul>
						<li class="first"> account <li> -
						<li><a href=""> log in </a></li> |
						<li><a href=""> sign up </a></li> |
						<li><a href=""> My WhishList </a></li> |
						<li><a href=""> My cart </a></li> 
					</ul>
					<ul>
						<li class="first"> boxshop </li> -
						<li><a href="contact.jsp"> contact us </a></li> |
						<li><a href=""> about us </a></li> |
						<li><a href=""> careers </a></li> |
						<li><a href=""> blog </a></li> |
						<li><a href=""> press </a></li>
					</ul>
					<ul>
						<li class="first"> policies</li> -
						<li><a href=""> terms of use </a></li> |
						<li><a href=""> security </a></li> |
						<li><a href=""> privacy policy</a></li>
					</ul>
				</div>
				<div class="col-md-6 about-text text-right">
					<h4>About BoxShop</h4>
					<p>The fashion never alters, and as it is neither disagreeable nor uneasy, so it is suited to the climate, and calculated both for their summers and winters. Every family makes their own clothes; but all among them, women as well as men, learn one or other of the trades formerly mentioned.</p>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="cards text-center">
				<img src="images/cards.jpg" alt="" />
			</div>
			<div class="copyright text-center">
				<p>Copyright &copy; 2015 All rights reserved by WineXpress</p>
			</div>

		</div>
	 </div>
   </body>
</html>
