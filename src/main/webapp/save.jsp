<%--
  Created by IntelliJ IDEA.
  User: lc
  Date: 2022/6/6
  Time: 5:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加用户</title>
    <style>

    </style>
</head>
<body>
    <form action="/user/save" method="post">
        用户编号:<input type="text" name="id"><br/>
        用户姓名:<input type="text" name="name"><br/>
        用户年龄:<input type="text" name="age"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
