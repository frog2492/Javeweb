<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>订单列表</title>

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

    <br>
    <ul role="tablist" class="nav nav-tabs">
        <li class="active" role="presentation"><a href="StoreServlet?action=showOrder&pageNumber=1&ostatus=1">全部订单</a></li>
        <li <c:if test="${ostatus==5 }">class="active"</c:if> role="presentation"><a href="StoreServlet?action=showOrder&pageNumber=1&ostatus=5">已取消</a></li>
        <li <c:if test="${ostatus==2 }">class="active"</c:if> role="presentation"><a href="StoreServlet?action=showOrder&pageNumber=1&ostatus=2">已付款</a></li>
        <li <c:if test="${ostatus==3 }">class="active"</c:if> role="presentation"><a href="StoreServlet?action=showOrder&pageNumber=1&ostatus=3">运输中</a></li>
        <li <c:if test="${ostatus==4 }">class="active"</c:if> role="presentation"><a href="StoreServlet?action=showOrder&pageNumber=1&ostatus=4">已完成</a></li>
    </ul>

    <br>

    <table class="table table-bordered table-hover">

        <tr>
            <th width="5%">ID</th>
            <th width="5%">总价</th>
            <th width="15%">商品详情</th>
            <th width="20%">收货信息</th>
            <th width="10%">订单状态</th>
            <th width="10%">支付方式</th>
            <th width="10%">下单用户</th>
            <th width="10%">下单时间</th>
            <th width="10%">操作</th>
        </tr>

        <c:forEach items="${requestScope.orders }" var="order">
            <tr>
                <td><p>${order.orderId }</p></td>
                <td><p>${order.totalPrice }</p></td>
                <td>
                    <c:forEach items="${order.itemList }" var="item">
                        <p>${item.pet.petId }(${item.pet.type }) x ${item.amount}</p>
                    </c:forEach>
                </td>
                <td>
                    <p>${order.consignee }</p>
                    <p>${order.phone }</p>
                    <p>${order.address }</p>
                </td>
                <td>
                    <p>
                        <c:if test="${order.orderState eq '已付款'}"><span style="color:red;">已付款</span></c:if>
                        <c:if test="${order.orderState eq '运输中' }"><span style="color:green;">运输中</span></c:if>
                        <c:if test="${order.orderState eq '已完成' }"><span style="color:black;">已完成</span></c:if>

                    </p>
                </td>
                <td>
                    <p>

                        <c:if test="${order.payType==1 }">微信</c:if>
                        <c:if test="${order.payType==2 }">支付宝</c:if>
                        <c:if test="${order.payType==3 }">货到付款</c:if>

                    </p>
                </td>
                <td><p>${order.orderId }</p></td>
                <td><p>${order.createDate }</p></td>
                <td>
                    <c:if test="${order.orderState eq '已付款' }">
                        <a class="btn btn-success" href="StoreServlet?action=changeState&oid=${order.orderId}&ostatus=3">发货</a>
                    </c:if>
                    <c:if test="${order.orderState eq '运输中' }">
                        <a class="btn btn-warning" href="StoreServlet?action=changeState&oid=${order.orderId}&ostatus=4">完成</a>
                    </c:if>
                    <a class="btn btn-danger" href="StoreServlet?action=deleteOrder&oid=${order.orderId}&ostatus=1">删除</a>
                </td>
            </tr>
        </c:forEach>


    </table>

    <br>

    <br>
</div>
</body>
</html>