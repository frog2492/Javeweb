<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>商品列表</title>
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

<jsp:include page="/pages/common/head.jsp">
    <jsp:param name="flag" value="1"></jsp:param>
</jsp:include>

<!--header-->

<!--//header--








<!-banner-->

<div class="banner">
    <div class="container">
        <h2 class="hdng"><a href="InterfaceServlet?action=ShowPetInfo&bid=1001}">宠物猫咪</a><span></span></h2>
        <p>今日精选推荐</p>
        <a class="banner_a" href="javascript:;" onclick="buy(${pet.petId})">立刻查看</a>
        <div class="banner-text">
            <a href="book_detail.action?bid=100002">
                <img src="images/9787547715543_0.jpg" alt="" width="350" height="350">
            </a>
        </div>
    </div>
</div>

<!--//banner-->

<!--gallery-->
<div class="gallery">
    <div class="container">


        <div class="clearfix"></div>
        <div class="alert alert-info">
            <img src="images/cat.png"width="56" height="46">
            <span class="cat" style="position: relative; top: 10px; font-size: 30px">喵星人
                </span>
        </div>
        <div class="gallery-grids">
        <c:forEach items="${requestScope.pets}" var="pet">
    <c:if test="${pet.num!=0}">
            <div class="col-md-3 gallery-grid ">

                <a href="InterfaceServlet?action=ShowPetInfo&bid=${pet.petId}">
                    <img src="images${pet.picture}" class="img-responsive" />
                </a>
                <div class="gallery-info">
                    <p>
                        <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                        <a href="InterfaceServlet?action=ShowPetInfo&bid=${pet.petId}">查看详情</a>
                    </p>
                    <a class="shop" href="OrderServlet?action=showCreatOrder&pid=${pet.petId}">立刻购买</a>
                    <div class="clearfix"> </div>
                </div>
                <div class="galy-info">
                    <p>宠物编号:${pet.petId}</p>
            <c:forEach items="${requestScope.type}" var="type" >

                <c:if test="${type.typeId==pet.type}"> <p>品种名  >  ${type.typeName} </p></c:if>
            </c:forEach>
                    <p>体重 : ${pet.weight} Kg </p>
                    <div class="galry">
                        <div class="prices">
                            <h5 class="item_price">¥  ${pet.price}</h5>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
    </c:if>
        </c:forEach>
        </div>
    </div>
</div>

<!--//gallery-->
<!--subscribe-->
<div class="subscribe"></div>
<!--//subscribe-->


<!--footer-->

<!--footer-->
<jsp:include page="../common/footer.jsp"></jsp:include>
<!--//footer-->

</body>
</html>


