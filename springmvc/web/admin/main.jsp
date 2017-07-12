<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/10 0010
  Time: 下午 09:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
    <link href="../css/icon.css" rel="stylesheet">
    <link href="../css/easyui.css" rel="stylesheet">
    <script src="../js/jquery.js" type="text/javascript"></script>
    <script src="../js/easyui.js" type="text/javascript"></script>
    <script>
        function  init() {
            $("#first").datagrid({
                title:"用户信息",
                columns:[[
                    {field:"id",checkbox:true,title:"序号",width:60},
                    {field:"account",title:"账号",width:100}
                ]],
                toolbar:[
                    <shiro:hasPermission name="user:create">
                       {text:"添加",iconCls:"icon-add"},
                    </shiro:hasPermission>
                    <shiro:hasPermission name="user:remove">
                        {text:"删除",iconCls:"icon-remove"},
                    </shiro:hasPermission>
                    <shiro:hasPermission name="user:update">
                        {text:"修改",iconCls:"icon-edit"}
                    </shiro:hasPermission>
                ]
            });
        }
        $(init);
    </script>
</head>
<body>
<div id="first"></div>
</body>
</html>
