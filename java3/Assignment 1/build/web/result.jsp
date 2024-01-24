<%-- 
    Document   : result
    Created on : Oct. 4, 2023, 6:03:14 p.m.
    Author     : raksh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Statistical Calculator Results</title>
</head>
<body>
    <h1>Statistical Calculator Results</h1>
    
    <% String operation = (String) session.getAttribute("operation"); %>
    
    <% if ("Probability".equals(operation)) { %>
        <h2>Probability:</h2>
        <p><%= session.getAttribute("probability") %></p>
    <% } else if ("Combination".equals(operation)) { %>
        <h2>Combination:</h2>
        <p><%= session.getAttribute("combination") %></p>
    <% } else if ("Permutation".equals(operation)) { %>
        <h2>Permutation:</h2>
        <p><%= session.getAttribute("permutation") %></p>
    <% } %>
</body>
</html>
