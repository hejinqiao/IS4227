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
        <!-- header-section-starts -->
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
                        <a href="index.html"><img src="images/logo-4227.png" class="img-responsive" alt="" /></a>
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
                            <li class="act">My Account Information</li>
                        </ul>
                    </div>
                    <div class="coats">
                        <h3 class="c-head">My Account Information</h3>
                    </div>

                    <form action="editInfo_result.jsp" method="POST">
                        <div class="register">

                            <div class="register-top-grid">
                                <h3>PERSONAL INFORMATION</h3>
                                <div>
                                    <h2>First Name</h2>
                                    <input name="FirstName" style="width:200px" value="<%

                                        wss.AccountMgt_Service service = new wss.AccountMgt_Service();
                                        wss.AccountMgt port = service.getAccountMgtPort();
                                        // TODO initialize WS operation arguments here
                                        java.lang.String email = session.getAttribute("useremail").toString();
                                        // TODO process result here
                                        java.lang.String result = port.accountInfo(email);
                                        JSONObject obj = new JSONObject(result);
                                        out.println(obj.get("first"));
                                           %>"
                                           >

                                </div>
                                <div >
                                    <h2>Last Name</h2>
                                    <input name="LastName" style="width:200px" value="<%out.println(obj.get("last"));%>">
                                </div>
                                
                                <div >
                                    <h2>Email Address</h2>
                                    <input name="email" style="width:200px" value="<%out.println(obj.get("email"));%>">
                                </div>
                                <div >
                                    <h2>Address</h2>
                                    <input name="address" style="width:200px" value="<%out.println(obj.get("address"));%>">
                                </div>
                                <div >
                                    <h2>Contact Number</h2>
                                    <input name="contactNumber" style="width:200px" value="<%out.println(obj.get("contactNumber"));%>">
                                </div >

                                <div class="clearfix"></div>
                            </div>

                        </div>

                        <div class="clearfix"></div>

                        <div class="register-but">

                            <br></br>
                            <input type="submit" name="choice" value="Change Password" style="position: absolute; left: 920px; width: 160px">
                            <br></br>
                            <input type="submit" name="choice" value="Submit" style="position: absolute; left: 920px; width: 80px">
                            <input type="submit" name="choice" value="Back" style="position: absolute; left: 1020px; width: 160px">
                             <a href="index.jsp">Back</a>

                            <div class="clearfix"> </div>

                        </div>
                    </form>
                </div>
        </div>

      <%@include file="templates/viewAccount.jsp"%>
    </body>
</html>