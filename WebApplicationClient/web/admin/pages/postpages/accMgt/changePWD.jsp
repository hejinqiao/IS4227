<%-- 
    Document   : changePWD
    Created on : Mar 9, 2015, 6:26:55 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	wss.AccountMgt_Service service = new wss.AccountMgt_Service();
	wss.AccountMgt port = service.getAccountMgtPort();
	 // TODO initialize WS operation arguments here
	java.lang.String adminId = (String)session.getAttribute("adminId");
	java.lang.String oldEncryptedPassword = request.getParameter("current1");
	java.lang.String newEncryptedPassword = request.getParameter("newPassword");
	// TODO process result here
	boolean result = port.adminChangePassword(adminId, oldEncryptedPassword, newEncryptedPassword);
        
        if(result)
            response.sendRedirect("../../changePassword.jsp?result=success");
        else
            response.sendRedirect("../../changePassword.jsp?result=fail");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

</html>
