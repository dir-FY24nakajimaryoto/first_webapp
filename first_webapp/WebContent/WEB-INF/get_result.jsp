<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- JSTLのうちコア機能をcという名前で利用できるようにする設定 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% //request.setCharacterEncoding("UTF-8"); %>


<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>クエリパラメータのテスト</title>
    </head>
    <body>
        <!-- リクエストスコープの中身を読み取るデフォルトの記述はこれだが -->
        <p>送信パラメータ:<%= request.getAttribute("q") %></p>
        <!-- JSTLを使えばこんなに楽に書ける(qの中身は.javaのクエリ・set済み) -->
        <p>送信パラメータ:<c:out value="${q}" /></p>
        <!-- EL式のみでもOK。内容は全部同じ意味 -->
        <p>送信パラメータ:${q}</p>
    </body>
</html>