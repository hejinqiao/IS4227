<%-- 
    Document   : login_result
    Created on : Mar 9, 2015, 4:10:05 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
</html>    <%-- start web service invocation --%><hr/>
    <%
    try {
	wss.AccountMgt_Service service = new wss.AccountMgt_Service();
	wss.AccountMgt port = service.getAccountMgtPort();
	 // TODO initialize WS operation arguments here
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
	java.lang.String adminId = email;
	java.lang.String encryptedPassword = password;
	// TODO process result here
	java.lang.String result = port.adminLogin(adminId, encryptedPassword);
	if(result.equalsIgnoreCase("yes")){
            session.setAttribute("adminId", email);
            response.sendRedirect("../../index.jsp");
        }else{
            response.sendRedirect("../../login_error.jsp");
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

