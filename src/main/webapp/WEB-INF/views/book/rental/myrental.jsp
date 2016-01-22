<%@ page contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	//반납처리
	
		function returnbook(num){
		var sal = document.getElementById("oversal").value;
		alert("연체료는 "+sal+"원입니다.")
		alert("반납처리한다.")
		location.href="return.book?book_num="+num;
	}
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
	//예약 후 대여처리
	function resrental(num){
		alert("ddd")
		var a = document.getElementById("rental").value;
		if(a < 3){
			alert(a)
			alert("대여처리한다.")
			location.href="resrental.book?book_num="+num;
			}
		else{
			alert("대여가능 권수가 넘었습니다. 반납 후 빌려주시길 바랍니다.")
		}
	}
</script>
</head>
<body>
<h3>대출 내역</h3>

<table border="1" class="rental">
	 
	<tr>
		<td>번호</td><td>등록번호</td><td>자료명</td><td>대출일</td>
		<td>반납예정일</td><td>연체일</td><td>연체료</td><td>대여 가능 권수 </td>
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
		<td>${dto.return_sal }원</td>
		<td>${dto.rentallimit }권</td>
		<input type="hidden" id="book_title" value="${dto.getBook_title()}">
		<input type="hidden" id="oversal" value="${dto.getReturn_sal()}">
		<input type="hidden" id="overdate" value="${dto.getOverdate()}">
		<td><input type="button" value="연장" onclick="Extension(${dto.book_num})"></td>
		<td><input type="button" value="반납" onclick="returnbook(${dto.book_num})"></td>
	</tr>
	</c:forEach>
</table>

<br/><br/>
<h3>예약 내역</h3>

<table border="1" class="rental">
	 
	<tr>
		<td>번호</td><td>자료명</td><td>예약일</td>
		<td>예약만료일</td><td>예약 가능 권수</td><td>대여</td><td>취소</td>
	</tr>
	
	<c:forEach items="${lists}" var="dto" varStatus="status">
	<tr>
		<td>${status.count }</td>
		<td>${dto.book_title}</td>
		<td>${dto.res_date}</td>
		<td>${dto.res_end}</td>
		<td>${dto.reslimit}</td>
		<input type="hidden" id="book_title" value="${dto.getBook_title()}">
		<input type="hidden" id="rental" value="${dto.getRentallimit()}">
		<td><input type="button"  value="대여" onclick="resrental(${dto.book_num})"></td>
		<td><input type="button"  value="취소" onclick="Cancel(${dto.book_num})"></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>