<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>首页</title>
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
    <jsp:param name="flag" value="2"></jsp:param>
</jsp:include>
<!--//header-->


<!--products-->
<div class="products">
    <div class="container">
        <h2><c:choose><c:when test="${empty t}">全部系列</c:when><c:otherwise>${t}</c:otherwise> </c:choose></h2>

        <div class="col-md-12 product-model-sec">

            <c:forEach items="${requestScope.pets}" var="pet">
                <c:if test="${pet.num!=0}">
                <div class="product-grid">
                    <a href="InterfaceServlet?action=ShowPetInfo&bid=${pet.petId}">
                        <div class="more-product"><span> </span></div>
                        <div class="product-img b-link-stripe b-animate-go  thickbox">
                            <img src="images${pet.picture}" class="img-responsive"  width="240" height="240">
                            <div class="b-wrapper">
                                <h4 class="b-animate b-from-left  b-delay03">
                                    <button  onclick="window.location.href='InterfaceServlet?action=ShowPetInfo&bid=${pet.petId}'">查看详情</button>
                                </h4>
                            </div>
                        </div>
                    </a>
                    <div class="product-info simpleCart_shelfItem">
                        <div class="product-info-cust prt_name">
                            <br>
                            <h4>宠物编号: ${pet.petId}</h4>
                            <br>

                            <h4>疫苗情况: ${pet.pin}针疫苗</h4>
                            <br>

                            <h4>体重: ${pet.weight}kg</h4>
                            <span class="item_price">¥ ${pet.price}</span>
                            <a href="OrderServlet?action=showCreatOrder&pid=${pet.petId} "> <input type="button" class="item_add items" value="加入购物车" ></a>
                            <div class="clearfix"> </div>
                        </div>
                    </div>
                </div>
                </c:if>
            </c:forEach>



        </div>

        <jsp:include page="../common/page.jsp"></jsp:include>
    </div>
</div>
</div>
<!--//products-->






<!--footer-->
<jsp:include page="../common/footer.jsp"></jsp:include>
<!--//footer-->


</body>
</html>
