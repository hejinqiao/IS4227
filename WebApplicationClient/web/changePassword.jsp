<%@page import="org.json.JSONObject"%>
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
                              
                                <a href="viewAccount.jsp"><%out.print(session.getAttribute("useremail"));%></a>
                               
                            </li>
                            <li class="login">
                                <i class="lock"></i>
                               
                                <a href="logout.jsp">Logout</a>
                               
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
                    <div class="search">
                        <div class="search2">
                            <form>
                                <input type="submit" value="">
                                <input type="text" value="Search for a product, category or brand" onfocus="this.value = '';" onblur="if (this.value == '') {
                                            this.value = 'Search for a product, category or brand';
                                        }"/>
                            </form>
                        </div>
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
                            <li><a href="index.html">Home</a></li> 
                            <li class="act">Change Password</li>
                        </ul>
                    </div>
                
                               <script type="text/javascript">

            function checkForm(form)
            {
          
                if (form.oldPassword.value == "") {
                    alert("Please enter your password");
                    form.oldPassword.focus();
                    return false;
                }

                if (form.newPassword.value !=form.confirmedNewPassword.value ) {
                    alert("Please enter same password");
                    form.newPassword.focus();
                    return false;
                }

                
                return true;
            }

        </script>
                    
                    <form action="changePwd_result.jsp" method="POST" onsubmit="return checkForm(this);">

                            <div class="register-top-grid">
                                <h3>Change Password</h3>
                       
                                <div class="cus_info_wrap">
						<label class="labelTop">
						Old Password:
						<span class="require">*</span>
						</label>
						<input type="password" name="oldPassword">
					</div>
                                 <div></div>                         
                                 <div></div>  
                                 <div></div>                                  
                                 <div></div>  


                                <div class="cus_info_wrap">
						<label class="labelTop">
						New Password:
						<span class="require">*</span>
						</label>
						<input type="password" name="newPassword">
					</div>
                                 <div></div>
                                  <div></div>                         
                                 <div></div>  
                                 <div></div>                                  
                           
                                 
                                <div class="cus_info_wrap">
						<label class="labelTop">
						Confirm New Password:
						<span class="require">*</span>
						</label>
						<input type="password" name="confirmedNewPassword">
					</div>

                                <div></div>
                                  <div></div>

                                <div class="clearfix"></div>
                            </div>

                        <div class="clearfix"></div>

                        <div class="register-but">

                           
                            <br></br>
                            <input type="submit" name="choice" value="Submit" >
                            <input type="submit" name="choice" value="Back" >

                            <div class="clearfix"> </div>

                        </div>
                    </form>
                </div>
        </div>

        <div class="footer">
            <div class="wrap">
                <div class="contact-section">
                    <div class="col-md-4 follow text-left">
                        <h3>Follow Us</h3>
                        <p>Lorem ipsum dolor sit amet</p>
                        <div class="social-icons">
                            <i class="twitter"></i>
                            <i class="facebook"></i>
                            <i class="googlepluse"></i>
                            <i class="pinterest"></i>
                            <i class="linkedin"></i>
                        </div>
                    </div>
                    <div class="col-md-4 subscribe text-left">
                        <h3>Subscribe Us</h3>
                        <p>Get the latest updates & Offers right in your inbox.</p>
                        <input type="text" class="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {
                                    this.value = '';
                                }">
                        <input type="submit" value="Subscribe">
                    </div>
                    <div class="col-md-4 help text-right">
                        <h3>Need Help?</h3>
                        <p>Lorem ipsum dolor sit amet</p>
                        <a href="contact.html">Contact us</a>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="footer-middle">
                    <div class="col-md-6 different-products">
                        <ul>
                            <li class="first"> Shop </li> 
                            <li><a href=""> Mobiles </a></li> 
                            <li><a href=""> Laptops </a></li> 
                            <li><a href=""> Cameras </a></li> 
                            <li><a href=""> Clothing </a></li> 
                            <li><a href=""> Footwear </a></li> 
                            <li><a href=""> Jewellery </a></li> 
                        </ul>
                        <ul>
                            <li class="first"> Help </li> 
                            <li><a href=""> Faqs </a></li> 
                            <li><a href=""> shipping </a></li> 
                            <li><a href=""> payments </a></li> 
                            <li><a href=""> cancellation&returns </a></li> 
                        </ul>
                        <ul>
                            <li class="first"> account <li> 
                            <li><a href=""> log in </a></li> 
                            <li><a href=""> sign up </a></li> 
                            <li><a href=""> My WhishList </a></li> 
                            <li><a href=""> My cart </a></li> 
                        </ul>
                        <ul>
                            <li class="first"> boxshop </li> 
                            <li><a href=""> contact us </a></li> 
                            <li><a href=""> about us </a></li> 
                            <li><a href=""> careers </a></li> 
                            <li><a href=""> blog </a></li> 
                            <li><a href=""> press </a></li>
                        </ul>
                        <ul>
                            <li class="first"> policies</li> 
                            <li><a href=""> terms of use </a></li> 
                            <li><a href=""> security </a></li> 
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
                    <p>Copyright &copy; 2015 All rights reserved | Template by  <a href="http://w3layouts.com">  W3layouts</a></p>
                </div>

            </div>
        </div>
    </body>
</html>