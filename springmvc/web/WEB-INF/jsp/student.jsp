<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  User: Administrator
  Date: 2019/1/22
  Time: 8:55
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>
<div id="all" style="width:255px;height:170px;margin-left: auto;margin-right: auto;margin-top: 200px; background-color: chartreuse;">
<h2 align="center">Student Information</h2>
<form:form method="POST" action="/HelloWeb/addStudent">
    <table>
        <tr>
            <td align="right"><form:label path="id">Id：</form:label></td>
            <td><form:input path="id"></form:input></td>
        </tr>
        <tr>
            <td align="right"><form:label path="age">Age：</form:label></td>
            <td><form:input path="age"></form:input></td>
        </tr>
        <tr>
            <td align="right"><form:label path="name">Name：</form:label></td>
            <td><form:input path="name"></form:input></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Submit">
            </td>
        </tr>
    </table>
</form:form>
</div>
</body>
</html>
