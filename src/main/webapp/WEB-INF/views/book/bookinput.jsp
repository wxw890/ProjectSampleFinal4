<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<head>
<title>Insert title here</title>
<script type="text/javascript">
	function fnsuccess(){
		alert("책 추가에 성공하셨습니다.")
	}
</script>
</head>
<body>
<form action="bookinput" enctype="multipart/form-data" method="POST"><!--로그인 또한  자체 dto가 필요하다. action는 같은 이름으로 해도된다. 구별은 method방식(즉 보내는 방법으로 구별) -->
		<p>					<!-- 또한 만약 같은 GET방식으로 보내야할 상황이면 param로 전달하는 방식으로 구분해서 전달받을수 있다.-->
			<label>
				도서명 : <br/>
				<input type="text" name="book_title" id="book_title"/>
			</label>
		</p>
		<p>
			<label>
				출판사 : <br/>
				<input type="text" name="book_label" id="book_label"/>
			</label>
		</p>
		<p>
			<label>
				저자 : <input type="text" name="book_author" id="book_author"/>
			</label>
		</p>
		<p>
			<label>
				장르 : <input type="text" name="book_genre" id="book_genre"/>
			</label>
		</p>
		<p>
			<label>
				ISBN : <input type="text" name="book_isbn" id="book_isbn"/>
			</label>
		</p>
		<p>
			<label>
				파일 :<input type="file" name="upFile" id="book_img"/><br/><br/>
			</label>
		</p>
		<p>
			<label>
				청구기호 :<input type="text" name="book_chunggu" id="book_chunggu"/><br/><br/>
			</label>
		</p>
		<p>
			<label>
				소장위치 :<input type="text" name="book_loc" id="book_loc"/><br/><br/>
			</label>
		</p>
		
		<input type="submit" value="저장" onclick="fnsuccess()"/>
		<input type="reset" value="취소" />
		<input type="button" value="전체목록보기" onclick="location.href='success.book'">
		<input type="button" value="오늘추가목록보기" onclick="location.href='today.book'">
	</form>
</body>
</html>