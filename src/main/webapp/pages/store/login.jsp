<%--
  Created by IntelliJ IDEA.
  User: y'x'y
  Date: 2022/6/5
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>

<html>
<head>
    <title>商家登陆</title>
    <%@ include file="/pages/common/header.jsp"%>
</head>

<!-account-->
<div class="account">
    <div class="container">
        <div class="register">
            <form action="StoreServlet" method="post">
                <input type="hidden" name="action" value="login" />
                <div class="register-top-grid">
                    <h3>商家登录</h3>
                    <span class="errorMsg" style="color: crimson;font-size: 20px">
                        ${ requestScope.msg }
                    </span>
                    <div class="input">
                        <span>用户名= <label style="color:red;">*</label></span>
                        <input type="text" name="account" placeholder="请输入用户名" required="required">
                    </div>
                    <div class="input">
                        <span>密码 <label style="color:red;">*</label></span>
                        <input type="password" name="password" placeholder="请输入密码" required="required">
                    </div>

                    <div class="clearfix"> </div>
                </div>
                <div class="register-but text-center">
                    <input type="submit" value="提交">
                    <div class="clearfix"> </div>
                </div>
            </form>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<!--//account-->
