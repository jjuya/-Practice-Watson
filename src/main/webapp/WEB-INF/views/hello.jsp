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
	
	<script type="text/javascript">
		$(document).ready(function(){
			$('#speak').click(function(){
				$('#myaudio').stop();
				$('#myaudio').attr('speaker?&' + $('#myform').serialize());
				$('#myaudio').attr('autoplay','autoplay');
			});
		});
	</script>

</head>
<body>

	${msg} <br />
	
	<div class="jumbotron">
		<h2>text2speech sample example</h2><br/>
		<p>텍스트의 내용은 선택한 보이스의 언어와 일치해야 합니다.
		혼합언어(예:영어 텍스트와 일본 여성음성)는 유효한 결과를 
		생성하지 않습니다. 한글은 조만간 지원됩니다.</p>
	</div>
	
	<div class="row">
		<div class="col-lg-1 col-sm-1"></div>
		<div class="col-lg-10 col-sm-10">
			<textarea rows="7" name="statement" class="form-control"></textarea>
		</div>
		<div class="col-lg-1 col-sm-1"></div>
	</div>
	<br />
	<hr size="1px"/>
	<br />
	<div class="row">
		<div class="col-lg-1 col-sm-1"></div>
		<div class="col-lg-8 col-sm-8">
			<select name="voice" class="form-control">
				<c:forEach items="${voices}" var="voice">
					<option value="${voice.name}">${voice.language} : ${voice.description}</option>
				</c:forEach>
			</select>
		</div>
		<div class="col-lg-2 col-sm-2">
			<input type="button" id="speak" value="읽기" 
			class="btn btn-default btn-success btn-block"/><br/>
		</div>
		<div class="col-lg-1 col-sm-1"></div>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-lg-10 col-sm-10">
				<audio id="myaudio" style="width:100%;" controls="controls" preload="auto" />
			</div>
		</div>
	</div>
	

</body>
</html>