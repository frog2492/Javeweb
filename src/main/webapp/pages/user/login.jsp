
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>

<html>
<head>
    <title>登陆</title>
    <%@ include file="/pages/common/header.jsp"%>
</head>

<jsp:include page="/pages/common/head.jsp">
    <jsp:param name="flag" value="1"></jsp:param>
</jsp:include>
<!-account-->
<div class="account">
    <div class="container">
        <div class="register">
            <form action="UserServlet" method="post">
                <input type="hidden" name="action" value="login" />
                <div class="register-top-grid">
                    <h3>用户登录</h3>
                    <span class="errorMsg" style="color: crimson;font-size: 20px">
                        ${ requestScope.msg }
                    </span>
                    <div class="input">
                        <span>用户名= <label style="color:red;">*</label></span>
                        <input type="text" name="username" placeholder="请输入用户名" required="required">
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






<!--footer-->

<!--footer-->
<jsp:include page="../common/footer.jsp"></jsp:include>
<!--//footer-->

<!--//footer-->


</body>
</html>
