<!DOCTYPE html>
<html>
    <%@include file="templates\head.jsp" %>
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

                    <div class="clearfix"></div>
                </div>
            </div>
        </div>

        <div class="wrap">

            <%@include file="templates\navigator.jsp" %> 
            <section id="main" style="height: 300px">
                <div class="content">
                    <div class="col-md-12 help text-center">

                        <%
                            java.lang.String choice = request.getParameter("choice");
                            if (choice.equals("Back"))
                                response.sendRedirect("index.jsp");
                            else {
                                java.lang.String oldPwd = request.getParameter("oldPassword").toString();
                                java.lang.String newPwd = request.getParameter("newPassword").toString();
                                java.lang.String confirmedNewPwd = request.getParameter("confirmedNewPassword").toString();

                                wss.AccountMgt_Service service = new wss.AccountMgt_Service();
                                wss.AccountMgt port = service.getAccountMgtPort();

                                java.lang.String email = session.getAttribute("useremail").toString();
                                System.out.println(email);

                                java.lang.String result = port.memberLogin(email, oldPwd);
                                if (result.startsWith("YES")) {

                                    if (!newPwd.equals(confirmedNewPwd)) {
                        %> <h3>Sorry, the two new passwords do not match!</h3>
                        <br>
                        <a href="changePassword.jsp">Back</a>
                        <%
                        } else {
                            boolean result1 = port.changePassword(email, newPwd);

                        %> <h3>The password has been successfully changed</h3>
                        <br>
                        <a href="viewAccount.jsp">Back</a>
                        <%                        }

                        } else {
                            System.out.println("fail");
                        %>

                        <h3>Your password is wrong!</h3>
                        <br>
                        <a href="viewAccount.jsp">Back</a>

                        <%  }
                            }
                        %>
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

        <hr/>
    </body>
</html>
