<%@ page language="java" contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/header.jsp"%>
<head>
<script>
$(document).ready(function(){
	 setInterval(function(){cache_clear()},3000);
	 });
	 function cache_clear()
	{
	 window.location.reload(true);
	}
</script>
</head>

<h2>글쓰기 페이지</h2>
<form action="write.board" method="post" id="freeboardWrite">
	제목:<input type="text" name="b_title"/><br/><br/>
	내용:<textarea cols="50" name="b_content"></textarea>
	
	<input type="submit" value="저장"/>
	<input type="button" value="리스트 페이지로 이동"/>
</form>
<form:form method="POST" action="upload.spring" enctype="multipart/form-data"><!-- enctype="multipart/form-data"란 데이터를 여러개로 나눠서 전송하겠다는 뜻(파일 업로드할때 필요하다 꼭) -->
																					<!-- multipart로 하면 req로 받아올수 없다. -->

	파일:<input type="file" name="files"/><br/><br/>
	<input type="submit" value="데이터 전송"/>
</form:form>
<c:if test="${path!=null}">
<img src=${path}${name} alt="HTML5 Icon" style="width:300px;height:300px;">
</c:if>
<%@include file="/footer.jsp"%>