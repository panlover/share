<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>我的图书馆</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<%@include file="header.jsp"%>

<div class="container">
    <div class="row">
        <div class="col-md-3 col-xs-12">
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="4"></li>
                </ol>
                <!-- Wrapper for slides -->
                <div class="carousel-inner">
                    <div class="item active"> <img src="/resources/image/slider1.jpg" alt="...">
                        <div class="carousel-caption"> ... </div>
                    </div>
                    <div class="item"> <img src="/resources/image/slider2.jpg" alt="...">
                        <div class="carousel-caption"> ... </div>
                    </div>
                    <div class="item"> <img src="/resources/image/slider3.jpg" alt="...">
                        <div class="carousel-caption"> ... </div>
                    </div>
                    <div class="item"> <img src="/resources/image/slider4.jpg" alt="...">
                        <div class="carousel-caption"> ... </div>
                    </div>
                    <div class="item"> <img src="/resources/image/slider5.jpg" alt="...">
                        <div class="carousel-caption"> ... </div>
                    </div>
                </div>
                <!-- Controls -->
                <!--<a class="left carousel-control" href="#carousel-example-generic" data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"></span> </a> <a class="right carousel-control" href="#carousel-example-generic" data-slide="next"> <span class="glyphicon glyphicon-chevron-right"></span> </a>-->
            </div>
        </div>
        <div class="col-md-5 col-xs-12">
            <ul>
                <li><a href="#">古今战争史上十个真实的空城计:他们比诸葛亮更聪明</a></li>
                <li><a href="#">古今战争史上十个真实的空城计:他们比诸葛亮更聪明</a></li>
                <li><a href="#">古今战争史上十个真实的空城计:他们比诸葛亮更聪明</a></li>
                <li><a href="#">古今战争史上十个真实的空城计:他们比诸葛亮更聪明</a></li>
            </ul>
            <hr>
            <ul>
                <li><a href="#">古今战争史上十个真实的空城计:他们比诸葛亮更聪明</a></li>
                <li><a href="#">古今战争史上十个真实的空城计:他们比诸葛亮更聪明</a></li>
                <li><a href="#">古今战争史上十个真实的空城计:他们比诸葛亮更聪明</a></li>
                <li><a href="#">古今战争史上十个真实的空城计:他们比诸葛亮更聪明</a></li>
            </ul>
            <hr>
            <div class="bs-example bs-example-tabs">
                <ul id="myTab" class="nav nav-tabs">
                    <li class="active"><a href="#home" data-toggle="tab">健康养生</a></li>
                    <li class=""><a href="#profile" data-toggle="tab">健康养生</a></li>
                    <li class=""><a href="#information" data-toggle="tab">健康养生</a></li>
                </ul>
                <div id="myTabContent" class="tab-content">
                    <div class="tab-pane fade active in" id="home">
                        <p>Raw denim you probably haven't heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua </p>
                    </div>
                    <div class="tab-pane fade" id="profile">
                        <p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo booth letterpress, commodo enim craft beer mlkshk aliquip jean shorts ullamco ad vinyl cillum PBR. </p>
                    </div>
                    <div class="tab-pane fade" id="information">
                        <p>Etsy mixtape wayfarers, ethical wes anderson tofu before they sold out mcsweeney's organic lomo retro fanny pack lo-fi farm-to-table readymade. Messenger bag gentrify pitchfork tattooed craft beer </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-4 col-xs-12">
            <ul>
                <li><a href="#">古今战争史上十个真实的空城计::他们比诸葛</a></li>
                <li><a href="#">古今战争史上十个真实的空城计::他们比诸葛</a></li>
                <li><a href="#">古今战争史上十个真实的空城计::他们比诸葛</a></li>
                <li><a href="#">古今战争史上十个真实的空城计::他们比诸葛</a></li>
            </ul>
            <hr>
            <ul>
                <li><a href="#">古今战争史上十个真实的空城计::他们比诸葛</a></li>
                <li><a href="#">古今战争史上十个真实的空城计::他们比诸葛</a></li>
                <li><a href="#">古今战争史上十个真实的空城计::他们比诸葛</a></li>
                <li><a href="#">古今战争史上十个真实的空城计::他们比诸葛</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container">
    <hr>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-3 col-xs-12">
            <div class="indexheader">
                <h3>职场社交</h3>
            </div>
            <div class="indexcontent">
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
        <div class="col-md-5 col-xs-12">
            <div class="indexheader">
                <h3>职场社交</h3>
            </div>
            <div class="indexcontent">
                <ul class="list-unstyled">
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                </ul>
            </div>
        </div>
        <div class="col-md-4 col-xs-12">
            <div class="indexheader">
                <h3>职场社交</h3>
            </div>
            <div class="indexcontent">
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
<div class="container">
    <hr>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-xs-12"> <img src="resources/image/img-md-4.jpg"> </div>
        <div class="col-md-2 col-xs-12">
            <div><img  src="resources/image/img-md-2.jpg"></div>
            <div><img  src="resources/image/img-md-2.jpg"></div>
        </div>
        <div class="col-md-2 col-xs-12">
            <div><img  src="resources/image/img-md-2.jpg"></div>
            <div><img  src="resources/image/img-md-2.jpg"></div>
        </div>
        <div class="col-md-2 col-xs-12">
            <div><img  src="resources/image/img-md-2.jpg"></div>
            <div><img  src="resources/image/img-md-2.jpg"></div>
        </div>
        <div class="col-md-2 col-xs-12">
            <div><img  src="resources/image/img-md-2.jpg"></div>
            <div><img  src="resources/image/img-md-2.jpg"></div>
        </div>
    </div>
</div>
<div class="container">
    <hr>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-3 col-xs-12">
            <div class="indexheader">
                <h3>职场社交</h3>
            </div>
            <div class="indexcontent">
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
        <div class="col-md-5 col-xs-12">
            <div class="indexheader">
                <h3>职场社交</h3>
            </div>
            <div class="indexcontent">
                <ul class="list-unstyled">
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                    <li><a href="#">建立良好人际关系的15大技巧建立良好人际关系的15大技巧</a></li>
                </ul>
            </div>
        </div>
        <div class="col-md-4 col-xs-12">
            <div class="indexheader">
                <h3>职场社交</h3>
            </div>
            <div class="indexcontent">
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
<div class="container">
    <hr>
</div>
<div class="container">
        <%@include file="footer.jsp"%>
</div>

</body>
</html>
