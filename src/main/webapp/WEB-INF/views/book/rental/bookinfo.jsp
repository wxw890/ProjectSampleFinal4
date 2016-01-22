<%@ page contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
<title>Insert title here</title>
<script type="text/javascript">
	function Rental(num){
		var disbook = document.getElementById("disbook").value
		
		if(disbook ==  0){
			alert("대여처리한다.")
			location.href="rental.book?book_num="+num;
			
		}
		else{
			alert("책을 이미 빌렸습니다.")
		}	
		
	}
	function Res(num){
		var disbook = document.getElementById("disbook").value
		var resbook = document.getElementById("resbook").value
		
		alert("이미 예약한 책:"+resbook)
		if(disbook ==  0 && resbook == 0){
		alert("예약 처리한다.")
		location.href="res.book?book_num="+num;
		}
		else if(disbook == 1){
			alert("책을 이미 빌렸습니다.")
		}
		else if(resbook == 1){
			alert("책을 이미 예약했습니다.")
		}
		
	}
	
</script>
</head>
<body>
<h2>파일 이름: ${dto.getBook_img()}</h2>
<div>
<img width="100" height="100" src="images/bookimage/${dto.getBook_img()}">
</div>


	<p>	
			<label>
				도서명 : <br/>
				<input type="text" name="book_title" id="book_title" value="${dto.getBook_title()}"/>
			</label>
		</p>
		<p>
			<label>
				출판사 : <br/>
				<input type="text" name="book_label" id="book_label" value="${dto.getBook_label()}"/>
			</label>
		</p>
		<p>
			<label>
				저자 : <input type="text" name="book_author" id="book_author" value="${dto.getBook_author()}"/>
			</label>
		</p>
		<p>
			<label>
				장르 : <input type="text" name="book_genre" id="book_genre" value="${dto.getBook_genre()}"/>
			</label>
		</p>
		<p>
			<label>
				ISBN : <input type="text" name="book_isbn" id="book_isbn" value="${dto.getBook_isbn()}"/>
			</label>
		</p>
		<p>
			<label>
				파일 :<input type="text" name="book_img" id="book_img"/><br/><br/>
			</label>
		</p>
		<p>
			<label>
				청구기호 :<input type="text" name="book_chunggu" id="book_chunggu" value="${dto.getBook_chunggu()}"/><br/><br/>
			</label>
		</p>
		<p>
			<label>
				소장위치 :<input type="text" name="book_loc" id="book_loc" value="${dto.getBook_loc()}"/><br/><br/>
			</label>
		</p>
		
		
		<br/><br/><br/><br/><br/>
		<input type="hidden" id="disbook" value="${disbook}"/>
		<input type="hidden" id="resbook" value="${resbook}"/>
		<table border="1">
		<tr>
		<td>순번</td><td>등록번호</td><td>제목</td>
		<td>출판사</td><td>저자</td>
		<td>ISBN</td><td>대여상태</td><td>예약상태</td>
		</tr>
		<c:forEach items="${list}" var="dto" varStatus="status">
			<tr>
				<td>${status.count}</td>
				<td>${dto.book_num }</td>
				<td>${dto.book_title}</td>
				<td>${dto.book_label}</td>
				<td>${dto.book_author}</td>
				<td>${dto.book_isbn}</td>
				<c:choose>
				<c:when test="${dto.book_status eq true}">
					<td>대여중</td>
				</c:when>
				<c:when test="${name!=null && dto.book_status eq false && dto.book_res eq false}">
				<td><input type="button" value="대여" onclick="Rental(${dto.book_num})"/></td>
				</c:when>
				<c:when test="${dto.book_status eq false && dto.book_res eq true}">
				<td>예약으로 인한 대출불가</td>
				</c:when>
				</c:choose>
				<c:choose>
				<c:when test="${dto.book_res eq true}">
					<td>예약중</td>
				</c:when>
				<c:when test="${name!=null && dto.book_res eq false }">
				<td><input type="button" value="예약" onclick="Res(${dto.book_num})"/></td>
				</c:when>
				</c:choose>
			</tr>
			</c:forEach>
			</table>
	
		
	
</body>
</html>