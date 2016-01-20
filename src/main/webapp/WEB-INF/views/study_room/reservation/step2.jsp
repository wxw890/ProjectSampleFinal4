<%@ page language="java" contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/header.jsp"%>







<h5>예약이 완료되었습니다.</h5>
	<p>예약자 계정 :${studyroomdto.getMember_email()}</p>
	<p>예약날짜 : ${studyroomdto.getReservation_date()}</p>
	<p>예약시간 : ${studyroomdto.getReservation_time()}</p> 
	<p>예약좌석 : ${studyroomdto.getTable_num()}</p>
	<p>
			$('#calendar-demo').dcalendar(); 
			$('input').dcalendarpicker({ 
			 format: 'yyyy-mm-dd' });
	</p>
		
		
		
<%@include file="/footer.jsp"%>
