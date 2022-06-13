<%--
  Created by IntelliJ IDEA.
  User: y'x'y
  Date: 2022/6/4
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!--header-->
<div class="header">
    <div class="container">
        <nav class="navbar navbar-default" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <h1 class="navbar-brand"><a href="index.jsp">猫大人</a></h1>
            </div>
            <!--navbar-header-->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="index.jsp" <c:if test="${param.flag==1}">class="active"</c:if>>首页</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle <c:if test="${param.flag==2}">active</c:if>" data-toggle="dropdown">宠物分类<b class="caret"></b></a>
                        <ul class="dropdown-menu multi-column columns-2">
                            <li>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <h4>宠物分类</h4>
                                        <ul class="multi-column-dropdown">

                                            <li><a class="list" href="InterfaceServlet?action=ByTypeShowInfo&pageNumber=1&typeId=-1">全部系列</a></li>

                                            <c:forEach items="${petType}" var="type">
                                                <li><a class="list" href="InterfaceServlet?action=ByTypeShowInfo&pageNumber=1&typeId=${type.typeId}">${type.typeName}</a></li>
                                            </c:forEach>
                                        </ul>
                                    </div>

                                </div>

                            </li>

                        </ul>
                    </li>


                    <c:choose>
                        <c:when test="${empty user }">
                            <li><a href="pages/user/register.jsp" <c:if test="${param.flag==10 }">class="active"</c:if>>注册</a></li>
                            <li><a href="pages/user/login.jsp" <c:if test="${param.flag==9 }">class="active"</c:if>>登录</a></li>

                        </c:when>
                        <c:otherwise>
                            <li><a href="OrderServlet?action=showOrderList" <c:if test="${param.flag==5 }">class="active"</c:if>>我的订单</a></li>
                            <li><a href="pages/user/user_center.jsp" <c:if test="${param.flag==4 }">class="active"</c:if>>个人中心</a></li>
                            <li><a href="UserServlet?action=loginOut" >退出</a></li>
<%--                            <c:if test="${user}">--%>
<%--                                <li><a href="admin/index.jsp" target="_blank">后台管理</a></li>--%>
<%--                            </c:if>--%>
                        </c:otherwise>
                    </c:choose>

                </ul>
                <!--/.navbar-collapse-->
            </div>
            <!--//navbar-header-->
        </nav>
        <div class="header-info">
            <div class="header-right search-box">
                <a href="javascript:;"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></a>

            </div>

            <div class="header-right cart">
                <a href="pages/cart/cart.jsp">
                    <span class="glyphicon glyphicon-shopping-cart <c:if test="${param.flag==8 }">active</c:if>" aria-hidden="true"><span class="card_num"><c:choose><c:when test="${empty cart}">0</c:when><c:otherwise>${cart.itemMap.size()}</c:otherwise></c:choose></span></span>
                </a>
            </div>
            <div class="clearfix"> </div>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!--//header--
