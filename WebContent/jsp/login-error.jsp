<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<p>IDとパスワードを入力してください。</p>

<form action="../Login.action" method="post">

<p>ID<input type="text" name="id" value=""required><br>
パスワード<input type="password" name="password" required></p>

<p><input type="submit" value="ログイン"></p>

</form>

<p>※IDもしくはパスワードが違います</p>

<%@include file="../footer.html" %>