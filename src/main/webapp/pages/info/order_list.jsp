<%@ page import="com.yxy.service.OrderService" %>
<%@ page import="com.yxy.service.impl.OrderServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>我的订单</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link type="text/css" rel="stylesheet" href="css/bootstrap.css">
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="layer/layer.js"></script>
    <script type="text/javascript" src="js/cart.js"></script>
</head>
<body>







<!--header-->

<jsp:include page="../common/head.jsp">
    <jsp:param name="flag" value="5"></jsp:param>
</jsp:include>
<!--//header-->


<!--cart-items-->
<div class="cart-items">
    <div class="container">



        <h2>我的订单</h2>

        <table class="table table-bordered table-hover">

            <tr>
                <th width="10%">ID</th>
                <th width="10%">总价</th>
                <th width="20%">商品详情</th>
                <th width="30%">收货信息</th>
                <th width="10%">订单状态</th>
                <th width="10%">支付方式</th>
                <th width="10%">下单时间</th>
            </tr>

            <c:forEach items="${orders }" var="order">

                <tr>
                    <td><p>${order.orderId }</p></td>
                    <td><p>${order.totalPrice }</p></td>
                    <td>


                        <c:forEach items="${order.itemList }" var="item">
                            <p>宠物编号:${item.goodsId }--></p>
                            <p>宠物类型:${item.pet.type}</p>
                            <p>价格:￥ (${item.price }) x ${item.amount }</p>
                        </c:forEach>

                    </td>
                    <td>
                        <p><span style="color: crimson">收货人:</span>  ${order.consignee }</p>
                        <p><span style="color: crimson">联系电话:</span> ${order.phone }</p>
                        <p><span style="color: crimson"> 收货地址: </span>${order.address }</p>
                    </td>
                    <td>
                        <p>
                            <c:if test="${order.orderState eq '已付款'}">
                                <span style="color:red;">已付款
                                </span></c:if>
                            <c:if test="${order.orderState eq '运输中'}">
                                <span style="color:green;">运输中
                                </span></c:if>
                            <c:if test="${order.orderState eq '已完成'}">
                                <span style="color:deepskyblue;">已完成
                                </span></c:if>
                            <c:if test="${order.orderState eq '已取消'}">
                                <span style="color:grey;">已取消
                                </span></c:if>


                        </p>
                    </td>
                    <td>
                        <p>

                            <c:if test="${order.payType==1 }">微信</c:if>
                            <c:if test="${order.payType==2 }">支付宝</c:if>
                            <c:if test="${order.payType==3 }">货到付款</c:if>

                        </p>
                    </td>
                    <td><p>${order.createDate }</p></td>
                </tr>

            </c:forEach>



        </table>




    </div>
</div>
<!--//cart-items-->






<!--footer-->
<jsp:include page="../common/footer.jsp"></jsp:include>
<!--//footer-->


</body>
</html>
