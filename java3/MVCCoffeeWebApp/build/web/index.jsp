<%-- 
    Document   : index
    Created on : Sep. 25, 2023, 2:17:20 p.m.
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
       <h1 align="center">Coffee Advisor </h1>
<form method="POST"
action="CoffeeControllerServlet">
Select coffee type:
<select name="type" size="1">
<option value="milky">Milky</option>
<option value="frothy">Frothy</option>
<option value="icey">Icey</option>
<option value="strong">Strong</option>
</select><br><br>
<center>
<input type="Submit" value="Ask Coffee Advisor">
</center>
</form>
    </body>
</html>
