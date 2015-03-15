<%-- 
    Document   : logout
    Created on : Mar 9, 2015, 4:54:24 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <meta http-equiv="Refresh" content="5;url=index.jsp">
   <% 
      
       session.invalidate();
       %>
   
    <%@include file="templates\head.jsp" %>
    <body>
        
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
                
                <h3>See You Soon</h3>
                <p>You have successfully logged out. Thanks for your shopping!</p>
                <p>You will be redirected to our home page in 5 seconds.</p>
                <a href="login.jsp">Click here to login</a>
           
                
                
            </div>

        </div>
            </section>
        </div>
            
           <%@include file="templates/footer.jsp"%> 
           
    </body>
</html>


      
</html>
