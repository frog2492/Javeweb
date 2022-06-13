<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="index.jsp">猫大人后台</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li ><a href="StoreServlet?action=showOrder&pageNumber=1&ostatus=1">订单管理</a></li>
                <li ><a href="StoreServlet?action=pet&pageNumber=1&pettype=-1">宠物管理</a></li>
                <li><a href="StoreServlet?action=loginout">退出</a></li>
            </ul>
        </div>
    </div>
</nav>

