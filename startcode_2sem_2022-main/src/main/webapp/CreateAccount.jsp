<%--
  Created by IntelliJ IDEA.
  User: simon
  Date: 06-04-2022
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a new Account</title>
</head>
<body>
<html>
<head>
    <title>Register form</title>
</head>
<body>
<form method="post" action="Servlet_CreateAccount">
    FirstName:<input type="text" name="Fname" /><br/>
    LastName:<input type="text" name="Lname" /><br/>
    Email:<input type="text" name="email" /><br/>
    Password:<input type="text" name="pass" /><br/>
    <input type="submit" value="CreateAccount" />
</form>


</body>
</html>
