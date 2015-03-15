<%-- 
    Document   : blockPost
    Created on : Mar 7, 2015, 4:47:24 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        System.out.println("Attribute is: "+ request.getParameter("accountId"));
    try {
	wss.AccountMgt_Service service = new wss.AccountMgt_Service();
	wss.AccountMgt port = service.getAccountMgtPort();
	 // TODO initialize WS operation arguments here
	java.lang.String email = request.getParameter("email");
	// TODO process result here
	boolean result = port.unblockMember(email);
        
        response.sendRedirect("../../AccountTables.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
</html>