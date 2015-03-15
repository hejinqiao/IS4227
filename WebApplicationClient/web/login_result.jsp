<!DOCTYPE html>
<html>
    <%@include file="templates\head.jsp" %>
    <body>
        <%
            try {
                System.out.println("haha");
                wss.AccountMgt_Service service = new wss.AccountMgt_Service();
                wss.AccountMgt port = service.getAccountMgtPort();
                // TODO initialize WS operation arguments here
                String email_para = request.getParameter("email");
                String pwd_para = request.getParameter("password");
                java.lang.String email = email_para;
                java.lang.String password = pwd_para;
                // TODO process result here
                java.lang.String result = port.memberLogin(email, password);

                if (result.startsWith("YES")) {
                    response.sendRedirect("index.jsp");
                    session.setAttribute("userid", result.split(" ")[1]);
                    session.setAttribute("useremail", result.split(" ")[2]);
            } else if (result.equalsIgnoreCase("wrong")) { %>
        <div class="header">
            <div class="top-header">
                <div class="wrap">
                    <div class="header-right">
                        <ul>
                            <li>
                                <i class="user"></i>
                                <a href="login.jsp">Login</a>
                            </li>
                            <li class="login">
                                <i class="lock"></i>
                                <a href="register.jsp">Sign up</a>
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
            }%>
    </body>
</html>
