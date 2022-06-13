<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<div style='text-align:center;'>
    <a class='btn btn-info'   <c:if test="${p.pageNo==1 }">disabled</c:if>  <c:if test="${p.pageNo!=1 }">href="${p.url }&pageNumber=1&typeId=${type }"</c:if>>首页</a>
    <a class='btn btn-info' <c:if test="${p.pageNo==1 }">disabled</c:if> <c:if test="${p.pageNo!=1 }">href="${p.url }&pageNumber=${p.pageNo-1}&typeId=${type}"</c:if>>上一页</a>

    <a class='btn btn-info'style="background-color: #ddd" disable>第${p.pageNo }页</a>

    <a class='btn btn-info' disable>共${p.pageTotal }页</a>
    <a class='btn btn-info' disable>${p.pageTotalCount }条记录</a>
    <a class='btn btn-info' <c:if test="${p.pageTotal==0 || p.pageNo==p.pageTotal }">disabled</c:if> <c:if test="${p.pageNo!=p.pageTotal }">href="${p.url }&pageNumber=${p.pageNo+1}&typeId=${requestScope.type}"</c:if>>下一页</a>
    <a class='btn btn-info' <c:if test="${p.pageTotal==0 || p.pageNo==p.pageTotal }">disabled</c:if> <c:if test="${p.pageNo!=p.pageTotal }">href="${p.url }&pageNumber=${p.pageTotal}&typeId=${type }"</c:if>>尾页</a>
    <input type='text' class='form-control' style='display:inline;width:60px;' value=''/><a class='btn btn-info' href='javascript:void(0);' onclick='location.href="${p.url }&pageNumber="+(this.previousSibling.value)+"&typeId=${type }"'>GO</a>
</div>

</body>
</html>
