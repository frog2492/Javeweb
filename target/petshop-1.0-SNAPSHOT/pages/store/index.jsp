<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>后台管理</title>

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
    <link rel="stylesheet" href="css/bootstrap.css"/>
</head>
<body>
<div class="container-fluid">
    <jsp:include page="header.jsp"></jsp:include>
    <br><br>
    <div class="alert alert-success" role="alert">欢迎进入猫狗大师后台管理系统！</div>
</div>
</body>
</html>