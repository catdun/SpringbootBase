<%--
  Created by IntelliJ IDEA.
  User: lc
  Date: 2022/6/6
  Time: 4:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户</title>
</head>
<body>
    <form action="/user/update" method="post">
        用户编号:<input type="text" name="id" value="${user.id}" readonly><br/>
        用户姓名:<input type="text" name="name" value="${user.name}"><br/>
        用户年龄:<input type="text" name="age" value="${user.age}"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
