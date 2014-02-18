<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
     <link rel="stylesheet" type="text/css" href="styles.css">
     -->

</head>

<body>
文章列表 :
<c:if test="${!empty articles}">
    <table class="data">
        <tr>
            <th>标题</th>
            <th>内容</th>
            <th>发表时间</th>
            <th>查看次数</th>
            <th>更新时间</th>
            <th>状态</th>
            <th>&nbsp;</th>
            <th>&nbsp;</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${articles}" var="article">
            <tr>
                <td>${article.title}</td>
                <td>${article.content}</td>
                <td>${article.publishTime}</td>
                <td>${article.viewCount}</td>
                <td>${article.lastUpdateTime}</td>
                <td>${article.status}</td>
                <td><a href="/article/${article.id}/edit">更新</a> </td>
                <td>删除</td>
                <td><a href="/article/${article.id}">查看</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
