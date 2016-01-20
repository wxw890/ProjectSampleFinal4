<%@ page contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	
	//연장처리
	function Extension(num){
		var i= document.getElementById("overdate").value;
		if(i == 0 || i == null){	
		location.href="extension.book?book_num="+num;
		}
		else{
			alert("연체로 인한 연장 불가")
		
		}
	}
	//예약 취소처리
	function Cancel(num){
		alert("ddd")
		location.href="rescan.book?book_num="+num;
	}
</script>
</head>
<body>
<h3>대출 내역</h3>
<form action="return.book" method="get">
<table border="1" class="rental">
	 
	<tr>
		<td>번호</td><td>등록번호</td><td>자료명</td><td>대출일</td>
		<td>반납예정일</td><td>연체일</td><td>연체료</td>
		<td>연장</td><td>반납</td>
	</tr>
	
	<c:forEach items="${list}" var="dto" varStatus="status">
	<tr>
		<td>${status.count }</td>
		<td>${dto.book_num}</td>
		<td>${dto.book_title}</td>
		<td>${dto.rental_date}</td>
		<td>${dto.renbtal_returndate}</td>
		<td>${dto.overdate }일</td>
		<td>${dto.return_sal }</td>
		<input type="hidden" name="book_num" value="${dto.book_num}">
		<input type="hidden" name="rental_num" value="${dto.rental_num}">
		<input type="hidden" id="overdate" value="${dto.getOverdate()}">
		<td><input type="button" value="연장" onclick="Extension(${dto.book_num})"></td>
		<td><input type="submit" value="반납" ></td>
	</tr>
	</c:forEach>
</table>
</form>
<br/><br/>
<h3>예약 내역</h3>
<form action="rescan.book" method="get">
<table border="1" class="rental">
	 
	<tr>
		<td>번호</td><td>자료명</td><td>예약일</td>
		<td>예약만료일</td><td>취소</td>
	</tr>
	
	<c:forEach items="${lists}" var="dto" varStatus="status">
	<tr>
		<td>${status.count }</td>
		<td>${dto.book_title}</td>
		<td>${dto.res_date}</td>
		<td>${dto.res_end}</td>
		<input type="hidden" name="res_num" value="${dto.res_num}">
		<input type="hidden" name="book_num" value="${dto.book_num}">
		
		<td><input type="submit" value="취소"></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>