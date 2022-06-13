<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>支付</title>
    <%@ include file="/pages/common/header.jsp"%>
</head>
<body>







<!--header-->
<jsp:include page="../common/head.jsp"></jsp:include>
<!--//header-->

<div class="cart-items">
    <div class="container">
        <h2>确认收货信息</h2>
        <form class="form-horizontal" action="OrderServlet?action=creatOrder" method="post" id="payform">
            <input type="hidden" name="petId" value="${pet.petId}">
            <input type="hidden" name="price" value="${pet.price}">
            <div class="row">
                <label class="control-label col-md-1">收货人</label>
                <div class="col-md-6">
                    <input type="text" class="form-control" name="consignee" value="${user.username }" style="height:auto;padding:10px;" required="required"><br>
                </div>
            </div>
            <div class="row">
                <label class="control-label col-md-1">收货电话</label>
                <div class="col-md-6">
                    <input type="number" class="form-control" name="phone" value="${user.phone }" style="height:auto;padding:10px;"  required="required"><br>
                </div>
            </div>
            <div class="row">
                <label class="control-label col-md-1">收货地址</label>
                <div class="col-md-6">
                    <input type="text" class="form-control" name="address" value="${user.address }" style="height:auto;padding:10px;"  required="required"><br>
                </div>
            </div>

            <br><hr><br>

            <h2>选择支付方式</h2>
            <h3>支付金额: ${pet.price }</h3><br><br>


            <div class="col-sm-6 col-md-4 col-lg-3 ">
                <label>
                    <div class="thumbnail">
                        <input type="radio" name="paytype" value="1" checked="checked" />
                        <img src="images/wechat.jpg" alt="微信支付">
                    </div>
                </label>
            </div>
            <div class="col-sm-6 col-md-4 col-lg-3 ">
                <label>
                    <div class="thumbnail">
                        <input type="radio" name="paytype" value="2"  />
                        <img src="images/alipay.jpg" alt="支付宝支付">
                    </div>
                </label>
            </div>
            <div class="col-sm-6 col-md-4 col-lg-3 ">
                <label>
                    <div class="thumbnail">
                        <input type="radio" name="paytype" value="3""/>
                        <img src="images/offline.jpg" alt="货到付款">
                    </div>
                </label>
            </div>
            <div class="clearfix"> </div>
            <div class="register-but text-center">
                <input type="submit" value="确认订单">
                <div class="clearfix"> </div>
            </div>
        </form>
    </div>
</div>





<!--footer-->
<jsp:include page="../common/footer.jsp"></jsp:include>
<!--//footer-->



</body>
</html>
