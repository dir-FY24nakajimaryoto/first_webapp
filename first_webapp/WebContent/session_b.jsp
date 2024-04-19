<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!-- 暗黙タグでセッションスコープであることを指定するための設定を追加 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String username=(String)request.getSession().getAttribute("username"); %>


<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>セッションスコープのテスト</title>
    </head>
    <body>
        <!-- セッションスコープであると明示 -->
        <h1>こんにちは、<c:out value="${sessionScope.username}" />さん</h1>
        <!-- <h1>こんにちは。<%= username %>さん</h1> -->
        <p><a href="session_c.jsp">次のページへ</a></p>
    </body>
</html>