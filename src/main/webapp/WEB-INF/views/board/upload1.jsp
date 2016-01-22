<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" action="upload.spring" enctype="multipart/form-data"><!-- enctype="multipart/form-data"란 데이터를 여러개로 나눠서 전송하겠다는 뜻(파일 업로드할때 필요하다 꼭) -->
																					<!-- multipart로 하면 req로 받아올수 없다. -->

	파일:<input type="file" name="files"/><br/><br/>
	<input type="submit" value="데이터 전송"/>
</form:form>
</body>
</html>