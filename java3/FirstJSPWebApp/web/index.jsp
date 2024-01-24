<%-- 
    Document   : index.jsp
    Created on : Sep. 18, 2023, 4:29:23 p.m.
    Author     : raksh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello There.</h1>
<%
java.util.Date date = new java.util.Date();
out.println("The time now is "+date);
%>
    </body>
</html>
