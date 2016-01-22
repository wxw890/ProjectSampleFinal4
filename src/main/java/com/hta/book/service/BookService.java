package com.hta.book.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.hta.board.repository.BoardDto;
import com.hta.book.repository.BookDto;
import com.hta.book.repository.BookResDto;
import com.hta.book.repository.BookandRentalDto;
import com.hta.book.repository.ConditionDto;
import com.hta.book.repository.RentalInfoDto;


public interface BookService {

		//책 추가
		public void bookinput(BookDto dto) throws SQLException;
		//전체 출력리스트
		public List getList() throws SQLException;
		//책보기
		public BookDto findBynum(int book_num);
		//오늘날짜만 출력
		public List todayList() throws SQLException;
		//삭제
		public void bookdelete(int book_num);
		//수정
		public void updatebook(BookDto dto);
		//조건검색
		public List samelist(String book_title);
		//조건검색1
		public List condition1(ConditionDto dto);
		//조건검색2
		public List condition2(ConditionDto dto);
		//조건검색3
		public List condition3(ConditionDto dto);
		//책 대여
		public void bookrental(BookDto dto, RentalInfoDto infodto, int book_num);
		//책 대여 리스트
		public List mylist(BookandRentalDto joindto);
		//책 반납
		public void bookreturn(int book_num,String member_email);
		//책 예약
		public void bookres(int book_num, BookResDto resdto,String member_email);
		//책 예약 리스트
		public List myreslist(BookandRentalDto joindto);
		//책 연장
		public void bookextension(int book_num);
		//책 예약 취소
		public void bookrescancel(int book_num,String member_email);
		//관리자 예약 취소
		public void bookrestodaycancel();
		//관리자 대여 리스트
		public List rantalinfoList();
		//관리자 예약 리스트
		public List resbookList();
		//사용자가 책 예약 후에 대여
		public void bookresrental(BookDto dto, RentalInfoDto infodto, int book_num);
		

		
		
		
}