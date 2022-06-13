<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<%@ include file="/pages/common/header.jsp"%>
</head>
<body>







<!--header-->
<jsp:include page="../common/head.jsp">
    <jsp:param name="flag" value="7"></jsp:param>
</jsp:include>
<!--//header-->


<!--cart-items-->
<div class="cart-items">
    <div class="container">



        <h2>我的购物车</h2>


        <c:forEach items="${sessionScope.cart.items}" var="item">
            <div class="cart-header col-md-6">
                <div class="cart-sec simpleCart_shelfItem">
                    <div class="cart-item cyc">
                        <a href="#">
                            <img src="${item.value.picture}" class="img-responsive">
                        </a>
                    </div>
                    <div class="cart-item-info">
                        <h3><a href="#">${item.value.name}</a></h3>
                        <h3><span>单价: ¥ ${item.value.price}</span></h3>
                        <h3><span>数量: ${item.value.totalPrice}</span></h3>
                        <a class="btn btn-info" href="javascript:buy(${item.key});">增加</a>
                        <a class="btn btn-warning" href="javascript:lessen(${item.key});">减少</a>
                        <a class="btn btn-danger" href="javascript:deletes(${item.key});">删除</a>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
        </c:forEach>

        <div class="cart-header col-md-12">
            <hr>
            <h3>订单总金额: ¥ ${order.ototal}</h3>
            <a class="btn btn-success btn-lg" style="margin-left:74%" href="order_submit.action">提交订单</a>
        </div>



    </div>
</div>
<!--//cart-items-->






<!--footer-->
<jsp:include page="../common/footer.jsp"></jsp:include>
<!--//footer-->


</body>
</html>