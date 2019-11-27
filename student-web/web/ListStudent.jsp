<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="root" scope="page" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>首页</title>
    <style>

    </style>
    <link rel="stylesheet" href="${root}/css/bootstrap.min.css">
</head>
<body>
<table class="table table-striped table-hover table-bordered">
    <thead>
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>地址</th>
        <th>状态</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${student.list}"  var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.age}</td>
            <td>${s.adress}</td>
            <td>${s.state}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div>
    <a href="${root}/list?page=1&pageSize=${student.pageSize}">首页</a>
    <a href="${root}/list?page=${student.prePage}&pageSize=${student.pageSize}">上一页</a>
    <c:forEach items="${student.navigatepageNums}" var="num">
        <a href="${root}/list?page=${num}&pageSize=${student.pageSize}">${num}</a>
    </c:forEach>
    <a href="${root}/list?page=${student.nextPage}&pageSize=${student.pageSize}">下一页</a>
    <a href="${root}/list?page=${student.pages}&pageSize=${student.pageSize}">尾页</a>
</div>
</body>
</html>
