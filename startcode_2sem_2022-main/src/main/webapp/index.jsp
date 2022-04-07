<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="error.jsp" isErrorPage="false" %>

<html>
<head>
    <title>Frontpage</title>
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

        .div1 {
            width: 300px;
            height: 100px;
            right: 1px;
            bottom: 400px;
            border: 2px solid darkblue;

        }
        .div2 {
            width: 300px;
            height: 100px;
            right: 0;
            bottom: 100px;
            border: 2px solid darkblue;
        }
        .div3 {
            width: 300px;
            height: 100px;
            right: 100px;
            bottom: 300px;
            border: 2px solid darkblue;
        }
        .div4 {
            width: 300px;
            height: 100px;
            border: 2px solid darkblue;
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
<div style="padding-left:20px">
    <h1>Velkommen til Olsker Cupcakes</h1>
    <p>Bornholms bedste cupcakes</p>
    <p>Køb dem i dag!</p>
<br>
<div class="div1">Dette her den lille størrelse <br>Der er 5 cupcakes i denne pakke.</div>
<div class="div2">Dette er den mellem størrelse <br>Der er 10 cupcakes i denne pakke.</div>
<div class="div3">Dette er den store størrelse <br>Der er 20 cupcakes i denne pakke.</div>
<div class="div4">Dette er en mix selv<br>Der er 12 cupcakes i denne pakke</div>
    <input type="submit"  value="Bland selv" href="SelfMix.jsp"/>
</div>

</body>
</html>

