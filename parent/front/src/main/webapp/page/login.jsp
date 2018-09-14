<%@ page contentType="text/html;charset=UTF-8" %>
<%@include file="/include/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">
    <title>会员登录</title>

    <link rel="stylesheet" href="${ctxStatic}/css/fonts.googleapis.com.css">
    <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="${ctxStatic}/css/font-awesome.min.css">
    <link rel="stylesheet" href="${ctxStatic}/css/bootstrap.min.css">

    <link rel="stylesheet" href="${ctxStatic}/css/demo.css"/>
    <link rel="stylesheet" href="${ctxStatic}/css/templatemo-style.css">

    <script type="text/javascript" src="${ctxStatic}/js/modernizr.custom.86080.js"></script>

    <script type="text/javascript">
        function doSubmit(){
            return ;
        }
    </script>

</head>

<body>

<div id="particles-js"></div>

<ul class="cb-slideshow">
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
    <li></li>
</ul>

<div class="container-fluid">
    <div class="row cb-slideshow-text-container ">
        <div class="tm-content col-xl-6 col-sm-8 col-xs-8 ml-auto section">
            <header class="mb-5"><h1>Letter</h1></header>
            <P class="mb-5">A sign-up letter template with three background images shuffling by fade in out movements.
                Thank you for visiting our site!</P>

            <form action="${ctx}/login.html" method="post" class="subscribe-form">
                <div class="row form-section">

                    <div class="col-md-7 col-sm-7 col-xs-7">
                        <input name="susername" type="text" class="form-control" id="contact_susername"
                               placeholder="请输入用户名" required/>
                    </div>
                    <div class="col-md-7 col-sm-7 col-xs-7">
                        <input name="spassword" type="password" class="form-control" id="contact_spassword"
                               placeholder="请输入密码" required/>
                    </div>
                    <div class="col-md-5 col-sm-5 col-xs-5">
                        <button type="submit" onclick="return doSubmit();" class="tm-btn-subscribe">Sign In</button>
                    </div>

                </div>
            </form>

            <div class="tm-social-icons-container text-xs-center">
                <a href="#" class="tm-social-link"><i class="fa fa-facebook"></i></a>
                <a href="#" class="tm-social-link"><i class="fa fa-google-plus"></i></a>
                <a href="#" class="tm-social-link"><i class="fa fa-twitter"></i></a>
                <a href="#" class="tm-social-link"><i class="fa fa-linkedin"></i></a>
            </div>

        </div>
    </div>
    <%--<div class="footer-link">--%>
        <%--<p>Copyright © 2018 Your Company--%>

            <%--- Design: <a rel="nofollow" href="#" target="_parent">Templatemo</a></p>--%>
        <%--<p>More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a--%>
                <%--href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>--%>
    <%--</div>--%>
</div>
</body>
<script type="text/javascript" src="${ctxStatic}/js/particles.js"></script>
<script type="text/javascript" src="${ctxStatic}/js/app.js"></script>
</html>