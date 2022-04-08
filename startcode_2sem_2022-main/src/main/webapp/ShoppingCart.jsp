<%--
  Created by IntelliJ IDEA.
  User: nickl
  Date: 07/04/2022
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>${requestScope.fejl}</h3>
<form action="Servlet_Payment">
    <label for="Payment">Bekfræft Ordre:</label><br>
    <input type="text" id="Payment" name="beløb" value=0><br>
    <input type="submit" value="Bekræft Ordre">
<button type="Confirm Order" value="Confirm Order">Bekræft Køb<a href="OrderConfirmation.jsp"></a></button>
</form>
</body>
</html>
