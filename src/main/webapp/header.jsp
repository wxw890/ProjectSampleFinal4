<%@ page language="java" contentType="text/html; charset=utf-8"
   isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Forte | About</title>
<meta charset="utf-8">
<!-- <link rel="stylesheet" href="css/normalize.css"> -->
<!-- <link rel="stylesheet" href="css/foundation.min.css" type="text/css"> -->
<!-- <link rel="stylesheet" href="css/superfish.css"> -->
<!-- <link rel="stylesheet" href="css/style.css" type="text/css"> -->
<link
   href='http://fonts.googleapis.com/css?family=PT+Sans+Caption|Open+Sans'
   rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="css/import.css" />
<script src="js/vendor/custom.modernizr.js"></script>
<script>
Modernizr.load({
    // test if browser understands media queries
    test: Modernizr.mq('only all'),
    // if not load ie8-grid
    nope: 'css/ie8-grid-foundation-4.css'
});
</script>
<!-- 게시판 부분 function들 -->
<script>
	function fnTest(email){//로그인 한 상태에서 게시판 접근할수게 해주는 소스코드
		if(email==null){
			alert("로그인을 하세요!!")
			location.href="index";
		}else if(email!=null){
			location.href="list.board";
		}
	}
</script>
<script>
	function fnTest1(email){//로그인 한 상태에서 게시판 접근할수게 해주는 소스코드
		if(email==null){
			alert("로그인을 하세요!!")
			location.href="index";
		}else if(email!=null){
			location.href="list.board1";
		}
	}
</script>
<script>
	function fnTest2(email){//로그인 한 상태에서 게시판 접근할수게 해주는 소스코드
		if(email==null){
			alert("로그인을 하세요!!")
			location.href="index";
		}else if(email!=null){
			location.href="list.board2";
		}
	}
</script>




<!-- step1부분 function들 -->
<script>
	function fnSearch(){
		var day = document.getElementById("day").value;
			if(day !== ""){
				location.href = "reservation.search?date="+day;
			}
			else if(day === ""){
				alert("날짜를 지정해주세요!");
				location.href ="reservation.study";
			}
		
	}
</script>
<script>
	function fndelete(reservation_num){
		var answer = confirm("예약을 정말로 삭제하시겠습니까?");
		if(answer == true){
			location.href = "reservation.delete?reservation_num="+reservation_num;
		}
		else{
			location.href = "reservation.search";
		}
	}
</script>
<script>
	function fnreservation(member_email){ //스터디 예약 로그인 안했을때 처리부분, step1Error.jsp 부분에는 추가 안해도 될것같다.. 이유는 로그인을 해야하만 step1Error.jsp부분을 갈수
			  							  //있게 때문이다. 하지만 여기서는 혹시모를 상황을 위해서 추가하겠다.
		var day1 = document.getElementById("day").value;
		//var submit1 = document.getElementById("selectDay");
		alert("날짜는"+day);
		//location.href="reservation1.study";
		if(member_email !== ""){
			alert("로그인을 하세요!!")
			//location.href="reservation3.study" //이부분에서는 form태그 안에서 버튼이 submit 타입이라서 location.href는 GET방식이라 아마 GET방식으로 가다가 POST방식 또한 같이가서 에러가 발생하는 것 같다.
			window.history.back(0);//버튼이 submit인 POST방식에서는 window.history.back()을 해야 되돌갈수 있는 듯하다....
			
		}
		else{
			if(day1 === ""){
				alert("날짜를 입력하세요");
				window.history.back(0);
			}
		}
		
		
	}
</script>



<c:set var="email" value="${email}"/><!--로그인 컨트롤에서 session으로 넘긴 email값을 변수 email로 저장한다.-->



<!--[if lt IE 9]>
<link rel="stylesheet" href="css/ie-fixes.css">
<![endif]-->



</head>
<body>
<div class="call top-call-to-action">
  <div class="row">
    <div class="large-12 columns loginstyles">
    
     
    <c:if test="${name==null}">
		<span><a href="register.member">회원가입</a></span>
		<span><a href="login.member">로그인   </a></span>
	</c:if>
	
	<c:if test="${name!=null}">
	<span><a href="logout.member">로그아웃</a></span>
	<span><a href="loginchange.member">비밀번호 변경하기</a></span>
	</c:if> </div>
  </div>
</div>
<div class="header">
      <div class="row">
         <div class="large-12 twelve columns"
            style="padding-left: 0px; padding-right: 0px; width: 1000px;">

            <div class="logo">
               <a href="index.jsp"> <img src="images/library-logo2.png" alt=""></a>

               <c:choose>
                  <c:when test="${name ne null && email ne 'admin@hta.co.kr'}">
                     <div class="welcome">
                        <img src="images/Membericon.png" alt=""><font
                           style="font-weight: bolder;">${name}님 환영합니다.</font>
                     </div>
                  </c:when>
                  <c:when test="${name ne null && email eq 'admin@hta.co.kr'}">
                     <div class="welcome">
                        <img src="images/admin.png" alt=""><font
                           style="font-weight: bolder;">관리자 모드</font>
                     </div>
                  </c:when>
               </c:choose>

            </div>
         </div>
      </div>
   
   <div class="topmenu">
      <div class="row">
         <div class="large-12 twelve columns hide-for-small" style="width: 1200px;">
      
      
      <ul class="sf-menu">
        <li><a href="intro.jsp"><font color="#E8CEC2"; >아카데미
                        소개</font></a></li>
               <li><a href="condition.book"><font color="#E8CEC2"; >도서
                        검색 및 대여</font></a></li>
               <li><a href="list.board"><font color="#E8CEC2"; >게시판</font></a>
                  <ul class="dropdown" style="background-color: #2A2A2A">
                     <li style="background-color: #2A2A2A"><a href="list.board" onclick="fnTest(${email})"><font
                           color="#E8CEC2"; >공지사항</font></a>
                     <li style="background-color: #2A2A2A"><a href="list.board1" onclick="fnTest1(${email})"><font
                           color="#E8CEC2"; >자유게시판</font></a>
                     <li style="background-color: #2A2A2A"><a href="list.board2" onclick="fnTest2(${email})"><font
                           color="#E8CEC2"; >질문게시판</font></a>
                  </ul></li>

               <li><a href="#"><font color="#E8CEC2"; >스터디룸</font></a>
                  <ul class="dropdown">
                     <li style="background-color: #2A2A2A"><a href="reservation.study"><font
                           color="#E8CEC2"; >스터디룸 예약하기</font></a></li>

                  </ul> <c:choose>
                     <c:when test="${name ne null && email ne 'admin@hta.co.kr'}">
                        <li><a href="#"><font color="#E8CEC2"; >마이페이지</font></a>
                           <ul class="dropdown">
                              <li style="background-color: #2A2A2A"><a href="#"><font
                                    color="#E8CEC2"; >도서 대출 현황</font></a></li>
                              <li style="background-color: #2A2A2A"><a href="#"><font
                                    color="#E8CEC2"; >스터디룸 예약 확인</font></a></li>
                           </ul></li>
                     </c:when>
                     <c:when test="${name ne null && email eq 'admin@hta.co.kr'}">
                        <li><a href="#"><font color="#E8CEC2"; >관리자페이지</font></a>
                           <ul class="dropdown">
                              <li style="background-color: #2A2A2A"><a href="bookinput"><font
                                    color="#E8CEC2"; >도서 추가</font></a></li>
                              <li style="background-color: #2A2A2A"><a href="#"><font
                                    color="#E8CEC2"; >관리자페이지2</font></a></li>
                           </ul></li>
                     </c:when>
                  </c:choose>
            </ul>
         </div>
      </div>
   </div>
</div>
  </body>