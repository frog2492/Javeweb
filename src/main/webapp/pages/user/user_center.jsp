<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>个人中心</title>
    <%@ include file="/pages/common/header.jsp"%>
</head>

<jsp:include page="/pages/common/head.jsp">
    <jsp:param name="flag" value="1"></jsp:param>
</jsp:include>
<!--account-->
<div class="account">
    <div class="container">
        <div class="register">
            <c:if test="${!empty msg }">
                <div class="alert alert-success">${msg }</div>
            </c:if>
            <c:if test="${!empty failMsg }">
                <div class="alert alert-danger">${failMsg }</div>
            </c:if>

            <div class="register-top-grid">
                <h3>个人中心</h3>
                <form action="UserServlet" method="post">
<%--                    执行方法--%>
                    <input type="hidden" name="action" value="updateInfo"/>
                    <!-- 收货信息 start -->

                    <input type="hidden" name="uid" value="${sessionScope.user.userid}"/>
                    <h4>收货信息</h4>
                    <div class="input">
                        <span>用户名<label></label></span>
                        <input type="text" name="urealname" value="${sessionScope.user.username }" readonly="readonly"/>
                    </div>
                    <div class="input">
                        <span>收货人<label></label></span>
                        <input type="text" name="userMan" value="${sessionScope.user.userMan }"  />
                    </div>
                    <div class="input">
                        <span>收货电话</span>
                        <input type="text" name="uphone" value="${sessionScope.user.phone }" placeholder="请输入收货电话">
                    </div>
                    <div class="input">
                        <span>收货地址</span>
                        <input type="text" name="uaddress" value="${user.address }" placeholder="请输入收货地址">
                    </div>
                    <div class="input">
                        <span>邮箱</span>
                        <input type="text" name="email" value="${user.email }" placeholder="请输入收货地址">
                    </div>
                  <div class="input">
                     <span>个人简介</span>
                     <input type="text" name="descript" value="${sessionScope.user.descript }" style="height: 50px" placeholder="描述一下自己吧">
                </div>
                    <div class="register-but text-center">
                        <input type="submit" value="提交">
                    </div>
                    <!-- 收货信息 end -->
                </form>
                <hr>
                <form action="UserServlet" method="post">
                    <input name="action" type="hidden" value="updatePassword">
                    <input type="hidden" name="uid" value="${sessionScope.user.userid}"/>
                    <h4>安全信息</h4>
                    <div class="input">
                        <span>原密码</span>
                        <input type="password" name="oldupwd" placeholder="请输入原密码">
                    </div>
                    <div class="input">
                        <span>新密码</span>
                        <input type="password" name="upwd" placeholder="请输入新密码">
                    </div>
                    <div class="clearfix"> </div>
                    <div class="register-but text-center">
                        <input type="submit" value="提交">
                    </div>
                </form>
            </div>

            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<!--//account-->




<jsp:include page="../common/footer.jsp"></jsp:include>


</body>
</html>