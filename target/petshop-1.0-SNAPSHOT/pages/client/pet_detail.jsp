<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>商品详情</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link type="text/css" rel="stylesheet" href="css/bootstrap.css">
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <link type="text/css" rel="stylesheet" href="css/flexslider.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.flexslider.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="layer/layer.js"></script>
    <script type="text/javascript" src="js/cart.js"></script>
    <script>
        $(function() {
            $('.flexslider').flexslider({
                animation: "slide",
                controlNav: "thumbnails"
            });
        });
    </script>
</head>
<body>







<!--header-->
<jsp:include page="../common/head.jsp"></jsp:include>
<!--//header-->


<!--//single-page-->
<div class="single">
    <div class="container">
        <div class="single-grids">
            <div class="col-md-4 single-grid">
                <div class="flexslider">

                    <ul class="slides" style="height: 350px">
                        <li data-thumb="images${pet.picture}">
                            <div class="thumb-image"> <img src="images${pet.picture}" data-imagezoom="true" class="img-responsive"> </div>
                        </li>
                        <li data-thumb="images${pet.picture1}">
                            <div class="thumb-image"> <img src="images${pet.picture1}" data-imagezoom="true" class="img-responsive"> </div>
                        </li>
                        <li data-thumb="images${pet.picture2}">
                            <div class="thumb-image"> <img src="images${pet.picture2}" data-imagezoom="true" class="img-responsive"> </div>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="col-md-4 single-grid simpleCart_shelfItem">
                <br>
                <br>
                <h4> 猫咪编号:&nbsp  ${pet.petId}</h4>
                <br>
                <c:forEach items="${requestScope.type}" var="type" >
                    <c:if test="${type.typeId==pet.type}"> <p>品种: ${type.typeName} </p></c:if>
                </c:forEach>
                <br>
                <div class="tag">
                    <p> 疫苗情况:&nbsp ${pet.pin}针疫苗</p>
                </div>
                <br>
                <p>性别: &nbsp${pet.sex}</p>
                <br>
                <p>年龄:&nbsp ${age} 天</p>
                <br>
                    <br>
                <p>体重:&nbsp ${pet.weight} Kg</p>
                    <br>
                <p>描述:&nbsp ${pet.describe}</p>
                <div class="galry">
                    <div class="prices">
                        <h5 class="item_price">¥ ${pet.price}</h5>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="btn_form">
                    <a href="OrderServlet?action=showCreatOrder&pid=${pet.petId} class="add-cart >加入购物车</a>
                </div>
            </div>
            <div class="col-md-4 single-grid1">
                <!-- <h2>商品分类</h2> -->
                <ul>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <li>联系人: &nbsp 袁女士</li> <br>
                    <br>
                    <li>联系电话: &nbsp 13350189867
                    </li>
                    <br>
                    <br>
                    <li>异地运费: &nbsp 包运费,签协议!</li>
                    <br>
                    <br>
                    <div style="background-color: coral;width: 120px;height: 25px"  ><a href="#"> &nbsp&nbsp&nbsp&nbsp<img src="../../images/tel.jpg"><span style="color: whitesmoke">联系电话</span></a></div>


                </ul>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>







<!--footer-->
<jsp:include page="../common/footer.jsp"></jsp:include>
<!--//footer-->


</body>
</html>
