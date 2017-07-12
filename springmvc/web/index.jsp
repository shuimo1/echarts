<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/10 0010
  Time: 下午 08:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <a href="admin/main.jsp">去后台管理系统</a>
    <form action="login.do" method="post">
      <input type="text" name="account" placeholder=""/><br/>
      <input type="password" name="pass" placeholder=""/><br>
      <input type="submit" value="登录">
    </form>
  </body>
</html>
