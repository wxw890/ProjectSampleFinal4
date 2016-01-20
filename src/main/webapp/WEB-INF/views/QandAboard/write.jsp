<%@ page language="java" contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/header.jsp"%>

<h2>글쓰기 페이지</h2>
<form action="write.board2" method="post">
	제목:<input type="text" name="b_title"/><br/><br/>
	내용:<input type="text" cols="50" name="b_content"></textarea><br/><br/>
	<input type="submit" value="저장"/>
	<input type="button" value="리스트 페이지로 이동"/>
</form>

<%@include file="/footer.jsp"%>