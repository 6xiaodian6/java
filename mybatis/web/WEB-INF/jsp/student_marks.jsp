<%--
  User: Administrator
  Date: 2019/3/16
  Time: 11:26
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--从jstl1.2.5开始jstl表达式的jar包就分成了四个，即compat，impl，jstlel，spec，只有将他们全部导进lib里面才能使用jstl--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--默认的从jsp2.0开始el表达式就是开启的，即isELIgnored属性为false--%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>springMVC_mybatis</title>
</head>
<body>
<c:forEach items="${marks}" var="mark">
    Mark:${mark.mark},mark:${mark.sid}<br/>
</c:forEach>
</body>
</html>
