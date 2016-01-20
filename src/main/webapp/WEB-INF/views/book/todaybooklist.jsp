<%@ page contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
<title>오늘 책 추가 리스트</title>
s<script type="text/javascript">
function fnDelete(){
		location.href="delete.board?b_seq="+${dto["b_seq"]};
	}
</script>
</head>
<body>
<table border="1">
	<tr>
		<td>순서</td><td>제목</td><td>출판사</td><td>저자</td>
	</tr>
	<c:forEach items="${list}" var="dto" varStatus="status">
	<tr><td>${status.count}</td>
		<td><a href="bookupdate?book_num=${dto.book_num}">${dto.book_title}</td>
		<td>${dto.book_label}</td>
		<td>${dto.book_author}</td>
		<td><input type="button" value="삭제" onclick="fnDelete()"/></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>