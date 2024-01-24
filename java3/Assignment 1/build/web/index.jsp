<%-- 
    Document   : index
    Created on : Oct. 3, 2023, 10:36:58 p.m.
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
    <h1>Statistic Calculator</h1>
    <form action="Calculator" method="POST">
        Sample: <input type="text" name="sample">
        Population: <input type="text" name="population">
<!--        they have the same name for the controller to view to if else-->
        <input type="submit" name="operation" value="Probability">
        
        <input type="submit" name="operation" value="Permutation">
        <input type="submit" name="operation" value="Combination">
    </form>
</body>
</html>
