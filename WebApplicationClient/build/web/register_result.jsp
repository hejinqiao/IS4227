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
            
            <%@include file="templates/footer.jsp"%>
   </body>
</html>
