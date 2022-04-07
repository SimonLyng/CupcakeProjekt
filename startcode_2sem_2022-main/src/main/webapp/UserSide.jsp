<%--
  Created by IntelliJ IDEA.
  User: simon
  Date: 06-04-2022
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Din Konto</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        * {box-sizing: border-box;}

        body {
            margin: 0;
            font-family: Serif, Helvetica, sans-serif;
        }

        .header {
            overflow: hidden;
            background-color: #f1f1f1;
            padding: 20px 10px;
        }

        .header a {
            float: left;
            color: black;
            text-align: center;
            padding: 12px;
            text-decoration: none;
            font-size: 18px;
            line-height: 25px;
            border-radius: 4px;
        }

        .header a.logo {
            font-size: 25px;
            font-weight: bold;
        }

        .header a:hover {
            background-color: #ddd;
            color: black;
        }

        .header a.active {
            background-color: dodgerblue;
            color: white;
        }

        .header-right {
            float: right;
        }

        @media screen and (max-width: 500px) {
            .header a {
                float: none;
                display: block;
                text-align: left;
            }

            .header-right {
                float: none;
            }
        }
    </style>
</head>
<body>
<div class="header">
    <a href="index.jsp" class="logo">Olsker Cupcakes</a>
    <div class="header-right">
        <a class="active" href="index.jsp">Hjem</a>
        <a href="login.jsp">Log ind</a>
        <a href="Logout">Log ud</a>
        <a href="UserSide.jsp">Min Konto</a>
        <a href="CreateAccount.jsp">Ny konto</a>
    </div>
</div>
<h2> Dine oplysninger</h2>
<br>
<h2>Dine ordre</h2>
</body>
</html>
