<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>

<html>
<head>
    <title>注册</title>
    <%@ include file="/pages/common/header.jsp"%>
    <script type="text/javascript">
        // 页面加载完成之后
        $(function () {

            $("#username").blur(function () {
                //1 获取用户名
                var username = this.value;
                $.getJSON("http://localhost:8080/AjaxServlet","action=ajaxExistsUsername&username=" + username,function (data) {
                    if (data.existsUsername) {
                        $("span.errorMsg").text("用户名可用");
                    } else {
                        $("span.errorMsg").text("用户名已存在！");
                    }
                });
            });



            //给验证码图片添加单击事件
            $("#img-code").click(function (){
                //在事件响应function函数有一个this对象,这个this对象,是正在响应事件的dom对象
                //src表示验证码img标签的图片路径,可读可写
                // alert(this.src)
                this.src = "${basePath}Kaptch.jpg?"+new Date()
            })

            // 给注册绑定单击事件
            $("#sub_btn").click(function () {
                // 验证用户名：必须由字母，数字下划线组成，并且长度为5到12位
                //1 获取用户名输入框里的内容
                var usernameText = $("#username").val();
                //2 创建正则表达式对象
                var usernamePatt = /^\w{5,12}$/;
                //3 使用test方法验证
                if (!usernamePatt.test(usernameText)) {
                    //4 提示用户结果
                    $("span.errorMsg").text("用户名不合法！");

                    return false;
                }

                // 验证密码：必须由字母，数字下划线组成，并且长度为5到12位
                //1 获取用户名输入框里的内容
                var passwordText = $("#password").val();
                //2 创建正则表达式对象
                var passwordPatt = /^\w{5,12}$/;
                //3 使用test方法验证
                if (!passwordPatt.test(passwordText)) {
                    //4 提示用户结果
                    $("span.errorMsg").text("密码不合法！");

                    return false;
                }

                // 验证确认密码：和密码相同
                //1 获取确认密码内容
                var repwdText = $("#repwd").val();
                //2 和密码相比较
                if (repwdText != passwordText) {
                    //3 提示用户
                    $("span.errorMsg").text("确认密码和密码不一致！");

                    return false;
                }

                // 邮箱验证：xxxxx@xxx.com
                //1 获取邮箱里的内容
                var emailText = $("#email").val();
                //2 创建正则表达式对象
                var emailPatt = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
                //3 使用test方法验证是否合法
                if (!emailPatt.test(emailText)) {
                    //4 提示用户
                    $("span.errorMsg").text("邮箱格式不合法！");

                    return false;
                }

                // 验证码：现在只需要验证用户已输入。因为还没讲到服务器。验证码生成。
                var codeText = $("#code").val();

                //去掉验证码前后空格
                // alert("去空格前：["+codeText+"]")
                codeText = $.trim(codeText);
                // alert("去空格后：["+codeText+"]")

                if (codeText == null || codeText == "") {
                    //4 提示用户
                    $("span.errorMsg").text("验证码不能为空！");

                    return false;
                }

                // 去掉错误信息
                $("span.errorMsg").text("");

            });

        });

    </script>
</head>

<jsp:include page="/pages/common/head.jsp">
    <jsp:param name="flag" value="1"></jsp:param>
</jsp:include>

<!--account-->
<div class="account">
    <div class="container">
        <div class="register">
            <form action="UserServlet" method="post">
                <input type="hidden" name="action" value="register" />
                <div class="register-top-grid">
                    <h3>注册新用户</h3>
                    <span class="errorMsg" style="color: crimson;font-size: 20px">
                        ${ requestScope.msg }
                    </span>
                    <div class="input">
                        <span>用户名 <label style="color:red;">*</label></span>
                        <input type="text" name="username" placeholder="请输入用户名" value="${requestScope.username}" required="required" id="username">
                    </div>
                    <div class="input">
                        <span>密码 <label style="color:red;">*</label></span>
                        <input type="password" name="password" placeholder="请输入密码" required="required" id="password">
                    </div>
                    <div class="input">
                        <span>确认密码 <label style="color:red;">*</label></span>
                        <input type="password" name="password" placeholder="请输入密码" required="required" id="repwd">
                    </div>
                    <div class="input">
                        <span>电话<label></label></span>
                        <input type="text" name="uphone" placeholder="请输入电话">
                    </div>
                    <div class="input">
                        <span>邮箱<label></label></span>
                        <input type="text" name="email" placeholder="请输入邮箱">
                    </div>
                    <div class="input">
                        <span>性别<label></label></span>
                    <input name="gen" type="radio" value="男"  checked />男
                    <input name="gen" type="radio" value="女" />女
                    </div>
                    <div class="input">
                        <span>收货地址<label></label></span>
                        <input type="text" name="uaddress" placeholder="请输入收货地址">
                    </div>

                    <div class="input">
                        <span>验证码<label></label></span>
                        <input class="itxt" type="text" name="code" style="width: 120px;" id="code" />
                        <img alt="" id="img-code" src="Kaptch.jpg" style="position: relative ;height: 30px">
                    </div>
                    <div class="clearfix"> </div>
                </div>
                <div class="register-but text-center">
                    <input type="submit" value="提交">
                    <div class="clearfix"> </div>
                </div>
            </form>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<!--//account-->






<!--footer-->

<!--footer-->
<jsp:include page="../common/footer.jsp"></jsp:include>
<!--//footer-->

<!--//footer-->


</body>
</html>