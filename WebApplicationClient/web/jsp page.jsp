<%-- 
    Document   : jsp page
    Created on : Mar 2, 2015, 3:40:12 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="templates\head.jsp" %>
    </head>
    <body>
        <h1>
                <%-- start web service invocation --%><hr/>
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
        }
     
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        </h1>
    </body>
</html>
