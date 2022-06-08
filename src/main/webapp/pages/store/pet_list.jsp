<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>商品列表</title>

    <%
        String basePath = request.getScheme()
                + "://"
                + request.getServerName()
                + ":"
                + request.getServerPort()
                + request.getContextPath()
                + "/";
    %>
    <!--写base标签，永远固定相对路径跳转的结果-->

    <base href="<%=basePath%>">
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="css/bootstrap.css"/>
</head>
<body>
<div class="container-fluid">

    <jsp:include page="header.jsp"></jsp:include>

    <div class="text-right"><a class="btn btn-warning" href="StoreServlet?action=addPet">添加商品</a></div>

    <br>

    <ul role="tablist" class="nav nav-tabs">
        <li <c:if test="${pettype==0 }">class="active"</c:if> role="presentation"><a href="StoreServlet?action=pet&pageNumber=1&pettype=0">全部宠物</a></li>



    </ul>





    <br>

    <table class="table table-bordered table-hover">

        <tr>
            <th width="5%">ID</th>
            <th width="10%">图片</th>
            <th width="10%">体重</th>
            <th width="20%">介绍</th>
            <th width="10%">价格</th>
            <th width="10%">品种编号</th>
            <th width="25%">操作</th>
        </tr>

        <c:forEach items="${requestScope.pets}" var="pet">
            <tr>
                <td><p>${pet.petId }</p></td>
                <td><p><a href="#" target="_blank"><img src="images/${pet.picture}" width="100px" height="100px"></a></p></td>
                <td><p><a href="#" target="_blank">${pet.weight}</a></p></td>
                <td><p>${pet.describe}</p></td>
                <td><p>${pet.price}</p></td>
                <td><p>${pet.type}</p></td>
                <td>

                    <a class="btn btn-success" href="StoreServlet?action=petUpdate&pid=${pet.petId }">修改</a>
                    <a class="btn btn-danger" href="StoreServlet?action=petDelete&pid=${pet.petId }"">删除</a>
                </td>
            </tr>
        </c:forEach>


    </table>


</div>
</body>
</html>
