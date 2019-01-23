<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  User: Administrator
  Date: 2019/1/22
  Time: 13:07
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<div id="all" style="width:350px;height:150px;margin-left: auto;margin-right: auto;margin-top: 200px; background-color: chartreuse;">
<h2 align="center">Spring Page Redirection</h2>
<p align="center">点击按钮来执行重定向到新页面</p>
<form:form method="get" action="/redirect/redirect">
    <table align="center">
        <tr>
            <td>
                <input type="submit" value="重定向页面"/>
            </td>
        </tr>
    </table>
</form:form>
</div>
</body>
</html>
