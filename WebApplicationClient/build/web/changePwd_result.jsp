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
        <br/>
        <br/>
        <div class="wrap">

            <%@include file="templates\navigator.jsp" %> 
            <hr/>
            <hr/>   
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


        <hr/>
    </body>
</html>
