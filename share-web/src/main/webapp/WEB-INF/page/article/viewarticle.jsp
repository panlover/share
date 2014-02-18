<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <title>${article.title}</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.2/css/bootstrap.min.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<%@include file="../../common/header.jsp"%>
    <!--文章内容展示区域-->
    <div class="container">
        <div class="row">
            <div class="col-md-9 col-xs-12">
                <div  id="artcleHeadArea">
                    <h2>藏”可将文章保存到我的图书馆</h2>
                    <div class="fromwhere">
                        来自<a href="/user/${user.username}">${user.username}</a> &nbsp;&nbsp;&nbsp;&nbsp;<a href="">关注他</a>
                    </div>
                </div>
                <hr>
                <div class="articleBodyArea">
                    <div>${article.content}</div>
                </div>
                <hr>
                <div id="articleTailArea">
                    <div>
                        <div id="previousArticle">上一篇：<a href="">历史上唯一坐金銮殿睡龙床的妓女妓</a></div>
                        <div id="nextArticle">下一篇：<a href=""> 茜茜夺械村顶替事与愿违一矸扔下井  下大雨城一脸 2妓女妓</a></div>
                    </div>
                </div>
                <hr>
                <!--相关文章推荐-->
                <div class="row">
                    <div class="col-md-12 col-xs-12">
                        <h4>你可能会喜欢：</h4>
                        <div class="row">
                            <div class="col-md-6 col-xs-12">
                                <ul class="list-unstyled">
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                </ul>
                            </div>
                            <div class="col-md-6 col-xs-12">
                                <ul class="list-unstyled">
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                    <li><a href="#">建立良好人际关系的15大技巧</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <!--相关文章推荐结束-->
                <hr>
                <!--文章评论区域-->
                <div class="row">
                    <div class="col-md-12 col-xs-12">
                        <h4>文章评论</h4>
                        <div id="articleComments">
                            <div>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</div>
                            <div>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</div>
                            <div>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</div>
                            <div>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</div>
                            <div>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</div>
                            <div>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</div>
                            <div>xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</div>
                        </div>
                        <hr>
                        <h4>发表评论：</h4>
                        <div>
                            <form class="form-horizontal" role="form">
                                <div class="form-group">
                                    <div class="col-md-12 col-xs-12">
                                        <textarea class="form-control" rows="3"></textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12 col-xs-12">
                                        <button type="submit" class="btn btn-default"> 发表评论</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <!--文章评论区域结束-->
            </div>
        </div>
    </div>
    <!--文章内容展示区域结束-->
    <div class="container">
        <hr>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-xs-12">444444444444444444444444444</div>
            <div class="col-md-4 col-xs-12">444444444444444444444444444</div>
            <div class="col-md-4 col-xs-12">444444444444444444444444444</div>
        </div>
    </div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.2/js/bootstrap.min.js"></script>
    <ckeditor:replace replace="content" basePath="/resources/framework/ckeditor/"/>
</body>
</html>
