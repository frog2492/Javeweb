<%--
  Created by IntelliJ IDEA.
  User: y'x'y
  Date: 2022/6/4
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>

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
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link type="text/css" rel="stylesheet" href="../../css/bootstrap.css">
<link type="text/css" rel="stylesheet" href="../../css/style.css">
<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../js/cart.js"></script>








