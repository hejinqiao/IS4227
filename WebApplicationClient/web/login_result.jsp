<!DOCTYPE html>
<html>
 <%@include file="templates\head.jsp" %>
    <body>
    <%
    try {
	wss.AccountMgtWS_Service service = new wss.AccountMgtWS_Service();
	wss.AccountMgtWS port = service.getAccountMgtWSPort();
	 // TODO initialize WS operation arguments here
        String email_para = request.getParameter("email");
        String pwd_para = request.getParameter("password");
	java.lang.String email = email_para;
	java.lang.String password = pwd_para;
	// TODO process result here
	java.lang.String result = port.login(email, password);
        
        if(result.equalsIgnoreCase("yes")){
            response.sendRedirect("index.jsp");
            session.setAttribute("userid", 1);
        }else if (result.equalsIgnoreCase("wrong")){ %>
        <div class="header">
            <div class="top-header">
			<div class="wrap">
				<div class="header-right">
					<ul>
						<li>
							<i class="user"></i>
							<a href="account.jsp">Login</a>
						</li>
						<li class="login">
							<i class="lock"></i>
							<a href="login.jsp">Sign up</a>
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
        <br/>
        <br/>
        <div class="wrap">
            
        <%@include file="templates\navigator.jsp" %> 
        <hr/>
        <hr/>   
            <div class="col-md-12 help text-center">
					<h3>An error happens</h3>
					<p>The email or the password is incorrect</p>
					<a href="login.jsp">Click here to re-login</a>
				</div>
        
        </div>
        <% }
     
	//out.println("Result = "+result);
   } catch (Exception ex) {
    System.err.println("An error occurs");
    } %>
    <%-- end web service invocation --%><hr/>
   </body>
</html>
