<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"  + request.getServerName() + ":" + request.getServerPort()  + path + "/";
%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->

<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->

<!-- BEGIN HEAD -->

<head>

    <meta charset="utf-8" />

    <title>用户登录</title>

    <meta content="width=device-width, initial-scale=1.0" name="viewport" />

    <meta content="" name="description" />

    <meta content="" name="author" />

    <!-- BEGIN GLOBAL MANDATORY STYLES -->

    <link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

    <link href="resources/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>

    <link href="resources/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>

    <link href="resources/css/style-metro.css" rel="stylesheet" type="text/css"/>

    <link href="resources/css/style.css" rel="stylesheet" type="text/css"/>

    <link href="resources/css/style-responsive.css" rel="stylesheet" type="text/css"/>

    <link href="resources/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>

    <link href="resources/css/uniform.default.css" rel="stylesheet" type="text/css"/>

    <!-- END GLOBAL MANDATORY STYLES -->

    <!-- BEGIN PAGE LEVEL STYLES -->

    <link href="resources/css/login.css" rel="stylesheet" type="text/css"/>

    <!-- END PAGE LEVEL STYLES -->

    <link rel="shortcut icon" href="resources/image/favicon.ico" />

</head>

<!-- END HEAD -->

<!-- BEGIN BODY -->

<body class="login">

<!-- BEGIN LOGO -->

<div class="logo">

    <img src="resources/image/logo-big.png" alt="" />

</div>

<!-- END LOGO -->

<div class="content">

        <!-- BEGIN FORGOT PASSWORD FORM -->

        <form class="form-vertical forget-form" action="index.html">

            <h3 class="">忘记密码 ?</h3>

            <p>请输入您的E-mail地址来重置密码</p>

            <div class="control-group">

                <div class="controls">

                    <div class="input-icon left">

                        <i class="icon-envelope"></i>

                        <input class="m-wrap placeholder-no-fix" type="text" placeholder="Email" name="email" />

                    </div>

                </div>

            </div>

            <div class="form-actions">

                <div type="button" id="back-btn" class="btn">

                    <i class="m-icon-swapleft"></i><a href="login">返回登录</a>

                </div>

                <button type="submit" class="btn green pull-right">

                    提交 <i class="m-icon-swapright m-icon-white"></i>

                </button>

            </div>

        </form>

        <!-- END FORGOT PASSWORD FORM -->

</div>

<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->

<!-- BEGIN CORE PLUGINS -->

<script src="resources/js/jquery-1.10.1.min.js" type="text/javascript"></script>

<script src="resources/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>

<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->

<script src="resources/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>

<script src="resources/js/bootstrap.min.js" type="text/javascript"></script>

<!--[if lt IE 9]>

<script src="resources/js/excanvas.min.js"></script>

<script src="resources/js/respond.min.js"></script>

<![endif]-->

<script src="resources/js/jquery.slimscroll.min.js" type="text/javascript"></script>

<script src="resources/js/jquery.blockui.min.js" type="text/javascript"></script>

<script src="resources/js/jquery.cookie.min.js" type="text/javascript"></script>

<script src="resources/js/jquery.uniform.min.js" type="text/javascript" ></script>

<!-- END CORE PLUGINS -->

<!-- BEGIN PAGE LEVEL PLUGINS -->

<script src="resources/js/jquery.validate.min.js" type="text/javascript"></script>

<!-- END PAGE LEVEL PLUGINS -->

<!-- END JAVASCRIPTS -->

</body>

<!-- END BODY -->

</html>