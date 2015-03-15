<%-- 
    Document   : logout
    Created on : Mar 9, 2015, 4:54:24 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <% 
      
       session.invalidate();
       response.sendRedirect("login.jsp");
      
    %>
</html>
