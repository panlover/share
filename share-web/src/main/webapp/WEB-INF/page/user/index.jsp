<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"  + request.getServerName() + ":" + request.getServerPort()  + path + "/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>卡卡分享登陆</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
</head>
<body>
<div class="container">
    <%@include file="../../common/header.jsp" %>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <div class="panel panel-default">
                <!--USER BASIC INFO BEGIN-->
                <div class="panel-heading">
                    <h3 class="panel-title">${user.username}</h3>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-md-2 col-xs-6"><img src="/resources/image/avator/default.jpg" class="img-rounded"></div>
                        <div class="col-md-10 col-xs-12">
                            <div>
                                <ul class="list-unstyled">
                                    <li>昵称:这个地方根据用户显示昵称</li>
                                    <li>签名:</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <!--USER BASIC INFO END-->
            </div>

            <!--USER ACTIVITIES BEGIN-->
            <!-- Nav tabs -->
            <ul class="nav nav-tabs">
                <li><a href="#home" data-toggle="tab">主页</a></li>
                <li><a href="#articles" data-toggle="tab">文章</a></li>
                <li><a href="#collections" data-toggle="tab">收藏</a></li>
                <li><a href="#shares" data-toggle="tab">分享</a></li>
                <li><a href="#comments" data-toggle="tab">评论</a></li>
            </ul>

            <!-- Tab panes -->
            <div class="tab-content">
                <div class="tab-pane active" id="home">
                    <div class="row">
                        <div class="col-md-12 col-xs-12">
                            <div><strong>文章</strong></div>
                            <c:if test="${!empty articles}">
                                    <c:forEach items="${articles}" var="article">
                                        <div class="article">
                                            <div class="article title"><a href="/article/${article.id}" alt="${article.title}">${article.title}</a><span>${article.publishTime}</span></div>
                                            <div class="article content">${article.content}</div>
                                        </div>
                                    </c:forEach>
                            </c:if>
                        </div>
                    </div>

                </div>
                <div class="tab-pane" id="articles">



                    <c:if test="${!empty articles}">
                        <c:forEach items="${articles}" var="article">
                            <div class="article">
                                <div class="article title"><a href="/article/${article.id}" alt="${article.title}">${article.title}</a><span>${article.publishTime}</span></div>
                                <div class="article content">${article.content}</div>
                            </div>
                        </c:forEach>
                    </c:if>
                </div>
                <div class="tab-pane" id="collections">收藏</div>
                <div class="tab-pane" id="shares">分享</div>
                <div class="tab-pane" id="comments">
                    <c:if test="${!empty comments}">
                        <table class="data">
                            <tr>
                                <th>内容</th>
                                <th>发表时间</th>
                            </tr>
                            <c:forEach items="${comments}" var="comment">
                                <tr>
                                    <td>${comment.content}</td>
                                    <td>${comment.publishTime}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </c:if>
                </div>
            </div>
            <!--USER ACTIVITIES END-->
        </div>
        <div class ="col-md-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">${user.username}</h3>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-md-12 col-xs-12">
                            aaaaa
                           <hr/>
                            bbbbb
                            <hr/>
                            ccccc
                            <hr/>
                            ddddd
                            <hr/>
                            eeeee
                            <hr/>
                            fffff
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>

    <a href="/user/${user.username}">${user.username}</a>

</div>
<div class="container">
    <%@include file="../../common/footer.jsp" %>
</div>
</body>
</html>