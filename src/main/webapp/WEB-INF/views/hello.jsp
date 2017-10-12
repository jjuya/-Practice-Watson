<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="../../favicon.ico" />

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="<c:url value="/resources/js/jquery-3.2.1.js" />"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

	${msg} <br />
	
	<hr />
	
	<c:forEach items="${voices}" var="voice">
		${voice.description}<br/>
	</c:forEach>
	
	<hr />
	
	<table border="1px">
		<tr>
			<th>no</th>
			<th>statement</th>
			<th>lang</th>
		</tr>
			
		<c:forEach items='${list}' var='vo'>
			<tr>
				<td>${vo.no}</td>
				<td>${vo.statement}</td>
				<td>${vo.lang}</td>
				<td><a href="delete?no=${vo.no}" id=del class="btn btn-default btn-danger btn-block">삭제</a></td>
			</tr>
		</c:forEach>
			
	</table>	


</body>
</html>