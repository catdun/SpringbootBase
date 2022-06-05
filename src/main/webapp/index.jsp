<%--
  Created by IntelliJ IDEA.
  User: lc
  Date: 2022/6/5
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>用户</title>
    <style>
        .container {
            width: 70%;
            margin: 0 auto;
        }
        .add{
            padding: 10px;
        }
        a {
            text-decoration: none;
        }
        a:hover{
            color: #3ca8e2;
            margin: 10px 0;
        }
        .center {
            text-align: center;
        }

        ul {
            list-style: none;
            padding: 0px;
            margin: 0px;
            height: 40px;
            line-height: 40px;
            border: 1px solid #99CC00;
            border-top: 0px;
            font-size: 20px;
        }

        ul li {
            display: block;
            float: left;
            text-indent: 2em
        }

        .th {
            background: #F1FADE;
            font-weight: bold;
            border-top: 1px
        }
    </style>
</head>
<body>
<div class="container">
    <h1 class="center">用户信息</h1>
    <div><a href="/save.jsp">添加用户</a></div>
    <ul class="th">
        <li style="width: 20%">用户编号</li>
        <li style="width: 15%">用户姓名</li>
        <li style="width: 15%">用户年龄</li>
        <li style="width: 30%">注册时间</li>
        <li style="width: 20%">操作</li>
    </ul>
    <c:forEach items="${list}" var="user">
        <ul>
            <li style="width: 20%">${user.id}</li>
            <li style="width: 15%">${user.name}</li>
            <li style="width: 15%">${user.age}</li>
            <li style="width: 30%"><fmt:formatDate value="${user.createTime}" pattern="yyyy年MM月dd日 HH:mm:ss"/></li>
            <li style="width: 20%">
                <a href="/user/findById/${user.id}">修改</a>
                <a href="/user/deleteById/${user.id}">删除</a>
            </li>
        </ul>
    </c:forEach>
</div>
</body>
</html>
