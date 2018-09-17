<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/include/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>会员注册</title>
</head>
<body>
<%--${message.msg}--%>
<form action="${ctx}/hy/user/register.html" method="post" class="subscribe-form">
    <div class="row form-section">

        <div class="col-md-7 col-sm-7 col-xs-7">
            <input name="susername" type="text" class="form-control" id="contact_susername"
                   placeholder="请输入用户名" required/>
        </div>
        <div class="col-md-7 col-sm-7 col-xs-7">
            <input name="spassword" type="password" class="form-control" id="contact_spassword"
                   placeholder="请输入密码" required/>
        </div>
        <div class="col-md-7 col-sm-7 col-xs-7">
            <button type="submit" class="tm-btn-subscribe">Sign In</button>
        </div>

    </div>
</form>
</body>
</html>
