<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  User: Administrator
  Date: 2019/1/22
  Time: 14:38
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>static</title>
</head>
<body>
<div id="all" style="margin-top: 200px">
<h2 align="center">Spring loading Page</h2>
<form:form method="GET" action="/redirect/staticPage">
    <table align="center">
        <tr>
            <td>
                <input type="submit" value="访问静态页面"/>
            </td>
        </tr>
    </table>
</form:form>
</div>
</body>
</html>
