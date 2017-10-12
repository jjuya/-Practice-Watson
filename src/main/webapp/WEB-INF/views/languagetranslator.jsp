<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="../../favicon.ico" />
</head>
<body>
<form action="identified">
	<div class="row">
		<div class="col-lg-12 col-sm-12">
			<textarea rows="7" name="text" class="form-control">
				There's a lady who's sure
				All that glitters is gold
				And she's buying a stairway to heaven
			</textarea>
		</div>
	</div>
	
	<div class="row">
		<div class="col-lg-10 col-sm-10">
		</div>
		<div class="col-lg-2 col-sm-2">
			<button class="btn btn-default btn-success btn-block">번역</button>
			<br/>
		</div>
	</div>
</form>

${lang}
</body>
</html>