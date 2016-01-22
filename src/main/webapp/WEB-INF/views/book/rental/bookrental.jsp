<%@ page contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
<title>리스트</title>

<style type="text/css">
.rental td{text-align: center}
</style>
</head>
<body>


<table border="1" class="rental">
	 
	<tr>
		<td>선택</td><td>등록번호</td><td>제목</td><td>출판사</td><td>저자</td><td>ISBN</td><td>입고날짜</td>
	</tr>
	<c:forEach items="${list}" var="dto" varStatus="status">
	<tr>
		<td><input type="checkbox" name="multbook" value=${dto.book_num }/></td>
		<td>${dto.book_num}</td>
		<td><a href="bookinfo?book_num=${dto.book_num}">${dto.book_title}</td>
		<td>${dto.book_label}</td>
		<td>${dto.book_author}</td>
		<td>${dto.book_isbn}</td>
		<td>${dto.book_imdate }</td>
	</tr>
	</c:forEach>
</table>

<br/><br/>
<input type="button" value="메인" onclick="location.href='main'"/>



</body>
</html>