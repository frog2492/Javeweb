<%--
  Created by IntelliJ IDEA.
  User: y'x'y
  Date: 2022/6/4
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆成功</title>
    <%@ include file="/pages/common/header.jsp"%>
</head>

<jsp:include page="/pages/common/head.jsp">
    <jsp:param name="flag" value="1"></jsp:param>
</jsp:include>
<!--account-->
<div style="position: relative">
    <h1 style="color: crimson ;width: 500px;height:300px ;position: center  ">登陆成功 </h1>
</div>
<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>
