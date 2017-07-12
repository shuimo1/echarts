<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/10 0010
  Time: 下午 09:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
登录成功！<br/>
<shiro:hasRole name="经理">
    <a href="admin/main.jsp">去后台管理系统</a>
</shiro:hasRole>
<shiro:hasRole name="书记">
    <a href="admin/main.jsp">去后台管理系统</a>
</shiro:hasRole>
</body>
</html>
