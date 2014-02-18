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
    <%@include file="header.jsp"%>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-sm-3 col-xs-2"></div>
        <div class="col-md-4 col-sm-6 col-xs-8">
            <form:form action="login" commandName="user">
                <div class="form-group">
                    <label><s:message code="login.username"/></label>
                    <form:input path="username" class="form-control"></form:input>
                </div>
                <div class="form-group">
                    <label><s:message code="login.password"/></label>
                    <form:input path="password" class="form-control"></form:input>
                </div>
                <div class="checkbox">
                    <label>
                        <input type="checkbox"> <s:message code="login.remember"/>
                    </label>
                </div>
                <button type="submit" class="btn btn-info"><s:message code="login.submit" /></button>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/findpassword"><s:message code="login.findpass"/> </a>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/register"><s:message code="login.register"/> </a>
            </form:form>
        </div>
        <div class="col-md-4 col-sm-3 col-xs-2"></div>
    </div>
</div>
<div class="container">
    <%@include file="footer.jsp"%>
</div>
</body>
</html>