<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="display">display voices</a><br/>
<a href="text2speech">watson : text2speech</a><br/>
<a href="weather">watson : Natural Language Classifier (날씨의 온도와 조건 구분)</a><br/>
<a href="translator">Language Translator</a><br/>
<a href="board/1/1">1번 게시판 1페이지</a><br/>
<a href="board/1/2">1번 게시판 2페이지</a><br/>
<a href="board/1/3">1번 게시판 3페이지</a><br/>

</body>
</html>
