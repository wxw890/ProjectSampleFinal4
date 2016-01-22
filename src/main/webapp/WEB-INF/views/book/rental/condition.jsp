<%@ page contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
<title>리스트</title>

</head>
<body>

<form action="condition.book" method="post">
	<select name="item" title="검색항목">
		<option selected="selected">분류</option>
		<option value="book_title">서명</option>
		<option value="book_author" >저자</option>
		<option value="book_label">출판사</option>
		<option value="book_num">등록번호</option>
		<option value="book_chunggu">청구기호</option>
		<option value="book_isbn">ISBN</option>
	</select>
	<input type="text" name="value" id="value1" title="검색어입력" />
	<select name="op" title="검색옵션">
		<option></option>
		<option value="AND">AND</option>
		<option value="OR">OR</option>
		<option value="NOT">NOT</option>
	</select>
	<br />
	<select name="seconditem" title="검색항목">
		<option selected="selected"></option>
		<option value="book_title">서명</option>
		<option value="book_author" >저자</option>
		<option value="book_label">출판사</option>
		<option value="book_num">등록번호</option>
		<option value="book_chunggu">청구기호</option>
		<option value="book_isbn">ISBN</option>
	</select>
	<input type="text" name="secondvalue" id="value1" title="검색어입력" />
	<select name="secondop" title="검색옵션">
		<option></option>
		<option value="AND">AND</option>
		<option value="OR">OR</option>
		<option value="NOT">NOT</option>
	</select>
	<br/>
	<select name="thirditem" title="검색항목">
		<option selected="selected"></option>
		<option value="book_title">서명</option>
		<option value="book_author" >저자</option>
		<option value="book_label">출판사</option>
		<option value="book_num">등록번호</option>
		<option value="book_chunggu">청구기호</option>
		<option value="book_isbn">ISBN</option>
	</select>
	<input type="text" name="thirdvalue" id="value1" title="검색어입력" />
	<br/>
	<input type="submit" value="검색"/>
</form>
</body>
</html>