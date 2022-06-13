<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>商品编辑</title>

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
    <meta charset="utf-8" />
    <link rel="stylesheet" href="css/bootstrap.css" />
</head>
<body>
<div class="container-fluid">

    <jsp:include page="header.jsp"></jsp:include>

    <br><br>
    <form class="form-horizontal" action="PetUpdate" method="post" enctype="multipart/form-data">
        <input type="hidden" name="action" value="UpdateInfo"/>
        <div class="form-group">
            <label for="input_name" class="col-sm-1 control-label">宠物编号</label>
            <div class="col-sm-6">
                <input type="text" readonly class="form-control" id="input_name" name="pid" value="${pet.petId }" required="required">
            </div>
        </div>
        <div class="form-group">
            <label for="input_name" class="col-sm-1 control-label">宠物性别</label>
            <div class="col-sm-6">
                <input type="text" readonly class="form-control" id="input_name" name="sex"  value="${pet.sex}" required="required">
            </div>
        </div>
        <div class="form-group">
            <label for="input_name" class="col-sm-1 control-label">生日</label>
            <div class="col-sm-6">
                <input type="date" class="form-control" id="input_name" name="birthday"  value="${pet.birthday}" required="required">
            </div>
        </div>
        <div class="form-group">
            <label for="input_name" class="col-sm-1 control-label">重量</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" id="input_name" name="weight"  value="${pet.weight}" required="required">
            </div>
        </div>
        <div class="form-group">
            <label for="input_file" class="col-sm-1 control-label">封面图片</label>
            <div class="col-sm-6"><img src="images/${pet.picture }" width="100" height="100"/>
                <input type="file" name="img1"  id="input_file" required="required">推荐尺寸: 500 * 500
            </div>
        </div>
        <div class="form-group">
            <label for="input_file" class="col-sm-1 control-label">详情图片1</label>
            <div class="col-sm-6"><img src="images/${pet.picture1 }" width="100" height="100"/>
                <input type="file" name="img2"  id="input_file" required="required">推荐尺寸: 500 * 500
            </div>
        </div>
        <div class="form-group">
            <label for="input_file" class="col-sm-1 control-label">详情图片2</label>
            <div class="col-sm-6"><img src="images/${pet.picture2 }" width="100" height="100"/>
                <input type="file" name="img3"  required="required">推荐尺寸: 500 * 500
            </div>
        </div>
        <div class="form-group">
            <label for="input_name" class="col-sm-1 control-label">价格</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" id="input_name" name="price" value="${pet.price}">
            </div>
        </div>
        <div class="form-group">
            <label for="select_topic" class="col-sm-1 control-label">种类</label>
            <div class="col-sm-6">
                <select class="form-control" id="select_topic" name="type">

                    <c:forEach items="${requestScope.petTypes }" var="type">
                        <option <c:if test="${type.typeId==pet.type }">selected="selected"</c:if> value="${type.typeId }">${type.typeName }</option>
                    </c:forEach>

                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="input_name" class="col-sm-1 control-label">疫苗针数</label>
            <div class="col-sm-6">
                <input type="number" class="form-control" id="input_name" name="pin" value="${pet.pin}">
            </div>
        </div>
        <div class="form-group">
            <label for="input_name" class="col-sm-1 control-label">数量</label>
            <div class="col-sm-6">
                <input type="number" class="form-control" id="input_name" name="num" value="${pet.num}">
            </div>
        </div>
        <div class="form-group">
            <label for="input_name" class="col-sm-1 control-label">介绍</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" id="input_name" name="desc" value="${pet.describe}">
            </div>
        </div>


        <div class="form-group">
            <div class="col-sm-offset-1 col-sm-10">
                <button type="submit" class="btn btn-success">提交保存</button>
            </div>
        </div>
    </form>
</div>
<jsp:include page="../common/page.jsp"></jsp:include>
</body>
</html>
