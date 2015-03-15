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
                <div class="login-content">
                    <div class="pag-nav">
                        <ul class="p-list">
                            <li><a href="index.jsp">Home</a></li> &nbsp;&nbsp;/&nbsp;
                            <li class="act">&nbsp;Login</li>
                        </ul>
                    </div>
                    <div class="login-signup-form">
                        <div class="col-md-5 login text-center">
                            <h4>login</h4>
                            <div class="how_to">
                                <a href="#"><div class="reg_fb"><img src="images/facebook.png" alt=""><i>Facebook</i><div class="clearfix"></div></div></a>
                                <a href="#"><div class="reg_gp"><img src="images/gp.png" alt=""><i>GOOGLE</i><div class="clearfix"></div></div></a>
                                <p><img src="images/locked.png" alt="" />Be assured, we do not store your password</p>
                            </div>
                            <h5>OR</h5>
                            <script type="text/javascript">

                                function checkLogin(form)
                                {

                                    if (form.email.value == "") {
                                        alert("Please enter your email");
                                        form.email.focus();
                                        return false;
                                    }

                                    if (form.password.value == "") {
                                        alert("Please enter your password");
                                        form.password.focus();
                                        return false;
                                    }

                                    return true;
                                }

                            </script>
                            <form action="login_result.jsp" method="POST" onsubmit="return checkLogin(this);">
                                <div class="cus_info_wrap">
                                    <label class="labelTop">
                                        Email:
                                        <span class="require">*</span>
                                    </label>
                                    <input type="text" name="email">
                                </div>
                                <div class="clearfix"></div>
                                <div class="cus_info_wrap">
                                    <label class="labelTop">
                                        Password:
                                        <span class="require">*</span>
                                    </label>
                                    <input type="password" name="password">
                                </div>
                                <div class="clearfix"></div>
                                <div class="sky-form">
                                </div>
                                <div class="botton8">
                                    <input type="submit" value="LOGIN" class="botton">
                                </div>
                            </form>
                            
                            </div>
                            <div class="col-md-5 sign-up text-center">
                                
                                <h4>signup</h4>
                                New customer?
                                <div class="clearfix"></div>
                                <div class="sky-form">
                                </div>
                                <div class="botton5">
                                    <form action="register.jsp">
                                        <input type="submit" value="Create Account" class="botton100" >
                                    </form>

                                </div>
                                
                                <div class="forgetit">
                                    <script type="text/javascript">

                                function checkReset(form)
                                {

                                    if (form.email1.value == "") {
                                        alert("Please enter your email");
                                        form.email1.focus();
                                        return false;
                                    }
                                    return true;
                                }

                            </script>
                                    <form action="reset_result.jsp" method="POST" onsubmit="return checkReset(this);">
                                <h4>Forgot Password?</h4>
                                Enter email to reset it
                                <input type="text" class="text" name="email1">
                                <div class="clearfix"></div>
                                <div class="sky-form">
                                    <br>
                                </div>
                                <div class="botton5">

                                    <input type="submit" value="SUBMIT" class="botton">

                                </div>
                                    </form>
                            </div>
                                
                            </div>
                            <div class="col-md-2 benefits">
                                <h4>Benefits of signup</h4>
                                <p>Manage your purchases anytime: Track your order status and print your vouchers</p>
                                <p>Quick shopping: no need to fill in your contact and shipping details while buying</p>
                                <p>Easy access to member only benefits</p>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                </div>
            </section>
            <%@include  file="/templates/footer.jsp"%>
        </div>
    </body>
</html>