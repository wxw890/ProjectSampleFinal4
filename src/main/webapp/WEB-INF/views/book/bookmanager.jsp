<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>�뿩 å ����Ʈ</h3>
<table border="1">
	 
	<tr>
		<td>����</td><td>��Ϲ�ȣ</td><td>����</td><td>å �ݳ���</td><td>�뿩��</td>
	</tr>
	<c:forEach items="${list}" var="dto" varStatus="status">
	<tr>
		<td>${status.count }</td>
		<td>${dto.book_num}</td>
		<td>${dto.book_title}</td>
		<td>${dto.renbtal_returndate}</td>
		<td>${dto.member_email}</td>
		<input type="hidden" value="${dto.book_num}"/> 
	</tr>
	</c:forEach>
</table>


<h3>���� å ����Ʈ</h3>
<form action="resbookcancel.book" method="get">
<table border="1">
	 
	<tr>
		<td>����</td><td>��Ϲ�ȣ</td><td>����</td><td>å ���� ��������</td><td>�뿩��</td>
	</tr>
	<c:forEach items="${lists}" var="dto" varStatus="status">
	<tr>
		<td>${status.count }</td>
		<td>${dto.book_num}</td>
		<td>${dto.book_title}</td>
		<td>${dto.res_end}</td>
		<td>${dto.member_email}</td>
		
	</tr>
	</c:forEach>
</table>
<input type="submit" value="�������" /> 

</form>


</body>
</html>