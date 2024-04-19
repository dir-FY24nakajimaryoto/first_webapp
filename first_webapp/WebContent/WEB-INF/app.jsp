<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>

<!-- テンプレートファイル -->
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title><c:out value="${param.title}" /> | サンプルサイト</title>
    </head>
    <body>
        <header>
            <!-- こっちはimport_a.jspにHTMLタグが含まれていないためc:outでOK -->
            <h1><c:out value="${param.title}" /></h1>
        </header>

        <div id="main">
            ${param.content}
            
            <!-- 下記のように表記すると、c:outのサニタイジングによりHTMLタグが無害化される -->
            <!-- 結果としてタグがそのまま表示される（<h2>こんにちは</h2>みたいに） -->
            <!-- 意図的にHTMLタグをparamで使用した場合はEL式のみを指定する -->
            <!-- <c:out value="${param.content}" /> -->
        </div>

        <footer>
            (c) Taro Kirameki
        </footer>
    </body>
</html>
