<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
    <%@include file="templates/head.jsp" %>
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
            <%@include file="templates/navigator.jsp" %>
		<!-- start registration -->
		<section id="main">
	<div class="content">
		<div class="pag-nav">
			<ul class="p-list">
				<li><a href="index.jsp">Home</a></li> &nbsp;&nbsp;/&nbsp;
				<li class="act">&nbsp;Activate Account</li>
			</ul>
		</div>
		<div class="coats">
			<h3 class="c-head">Activate Account</h3>
			<p>Please fill in the activation code that was sent to your email address.</p>
		</div>
            <script type="text/javascript">

            function checkForm(form)
            {
                
                if (form.email.value == "") {
                    alert("Please enter your email");
                    form.email.focus();
                    return false;
                }
                if (form.code.value == "") {
                    alert("Please enter your activation code");
                    form.code.focus();
                    return false;
                }
                
                return true;
            }

        </script>
            <form action="activate_result.jsp" method="POST" onsubmit="return checkForm(this);">
		<div class="register">
                    
			 <div class="register-top-grid">
				
				 
				 <div>
					 <span>Email Address</span>
					 <input type="text" name="email"> 
				 </div>
                             
                             <div>
					 <span>Activation Code</span>
					 <input type="text" name="code"> 
				 </div>
                                
				  </div>
                    
				  
				 </div>
				 
				 
			     
			
			<div class="clearfix"> </div>
			<div class="register-but">
			   
                               <input type="submit" value="Submit">
				   <div class="clearfix"> </div>
			   
			</div>
            </form>
	   </div>
	</div>
	</div>
	</div>
	<%@include file="templates/footer.jsp"%>
</body>
</html>