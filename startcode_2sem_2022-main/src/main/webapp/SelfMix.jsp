<%--
  Created by IntelliJ IDEA.
  User: simon
  Date: 06-04-2022
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bland selv cupcakes</title>
</head>
<body>

<form action="Servlet_Products">
    <label for="Bottoms">vælg bund:</label>
    <select id="Bottoms" name="Bund">
        <option value="Bottoms">Bund</option>
        <label for="Toppings">vælg topping:</label>
        <select id="Toppings" name="top">
            <option value="Toppings">Topping</option>
    </select>
    <input type="submit">
</form>

<p>Jump back to the <a href="index.jsp">Frontpage</a>
</body>
</html>
