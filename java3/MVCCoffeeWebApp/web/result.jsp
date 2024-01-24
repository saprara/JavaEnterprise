<%-- 
    Document   : result
    Created on : Sep. 25, 2023, 2:19:24 p.m.
    Author     : raksh
--%>

<%@ page import="java.util.*" %>
<html>
<body>
<h1 align="center">Coffee styles recommended for you</h1>
<p>
<%
ArrayList<String> styles = (ArrayList<String>) session.getAttribute("styles");
for(String s: styles){
out.println("<br>try: " + s);
}
%>
</body>
</html>
