<!DOCTYPE html>
<html>
    <%@include file="templates\head.jsp" %>
    <body>
        <%
            java.lang.String choice=request.getParameter("choice");
            if(choice.equals("Change Password"))response.sendRedirect("changePassword.jsp");
            else if(choice.equals("Back"))response.sendRedirect("index.jsp");
            else{
            wss.AccountMgt_Service service = new wss.AccountMgt_Service();
            wss.AccountMgt port = service.getAccountMgtPort();
            // TODO initialize WS operation arguments here
            java.lang.String email = request.getParameter("myEmail");
            java.lang.String name = request.getParameter("myName");
//            java.lang.String address = request.getParameter("address");
//            java.lang.String contactNumber = request.getParameter("contactNumber");
            System.out.println("email: " + email + ", name: " + name);
            // TODO process result here
//            java.lang.String result = port.editAccountInfo(email, name, address, contactNumber).toString();
//
//            if (result.isEmpty()) {
//                response.sendRedirect("editFail.jsp");
//            }
            }%>
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
        <br/>
        <br/>
        <div class="wrap">

            <%@include file="templates\navigator.jsp" %> 
            <hr/>
            <hr/>   
            <div class="col-md-12 help text-center">
                <h3>Your Account Has Been Successfully Updated</h3>
                <p>The email or the password is incorrect</p>
                <a href="viewAccount.jsp">Click Here To Return Account Page</a>
            </div>

        </div>


        <hr/>
    </body>
</html>
