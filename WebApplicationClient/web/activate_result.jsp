<!DOCTYPE html>
<html>
 <%@include file="templates\head.jsp" %>
    <body>
    <%
	wss.AccountMgt_Service service = new wss.AccountMgt_Service();
	wss.AccountMgt port = service.getAccountMgtPort();
	 // TODO initialize WS operation arguments here
	java.lang.String email = request.getParameter("email");
	java.lang.String activationCode = request.getParameter("code");
	// TODO process result here
	java.lang.String result = port.activateAccount(email, activationCode); 
    %>
  

        
    
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
       
        
        <div class="wrap">
            
        <%@include file="templates\navigator.jsp" %> 
        
         <section id="main" style="height: 300px">
        <div class="content">
            <div class="col-md-12 help text-center">
                
                <%if(result.equals("YES")){%>
                <h3>Congratulations!</h3> 
                <p>Your account has been successfully activated. </p>
                <p>Please login using your email address. Thanks!</p>
                <a href="login.jsp">Click here to login now</a>
                <%}else if(result.equals("ACTIVATED")){%>
                <h3>Sorry!</h3> 
                <p>Your account has already been activated before. </p>
                <p>Please login using this email address.</p>
                <a href="login.jsp">Click here to login your account</a>
                
                <%}else{%>
                <h3>Oops!</h3> 
                <p>The email address or the activation code is incorrect. </p>
                <p>Please make sure you have entered correct information.</p>
                <a href="activate.jsp">Click here to re-activate your account</a>
                <%}%>
            </div>
        
        </div>
         </section>
        </div>
            
              <%@include file="templates/footer.jsp" %>
   </body>
</html>
