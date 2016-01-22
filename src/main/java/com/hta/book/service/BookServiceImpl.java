package com.hta.book.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.hta.member.repository.Member;
import com.hta.board.repository.BoardDto;
import com.hta.book.repository.BookDto;
import com.hta.book.repository.BookResDto;
import com.hta.book.repository.BookandRentalDto;
import com.hta.book.repository.ConditionDto;

import com.hta.book.repository.RentalInfoDto;
import com.hta.exception.IdPasswordNotMachingException;

import mybatis.BoardManager;
import mybatis.BookManager;
import mybatis.MemberManager;

public class BookServiceImpl implements BookService {

	public void bookinput(BookDto dto) throws SQLException {
		BookManager.bookinput(dto);
		// TODO Auto-generated method stub
	
		
	}
	
	// 책 리스트 전체 보여주기
	public List getList() throws SQLException{
		return BookManager.getList();
		
	}
	
	// 글 입고날짜 오늘꺼만 보여주기
	public List todayList() throws SQLException{
		return BookManager.todayList();
		
	}
	
	//글 보기
	public BookDto findBynum(int book_num) {
		BookDto dto = new BookManager().finBynum(book_num);
		return dto;
	}
	
	//글삭제
	public void bookdelete(int book_num) {
	
		BookManager.deletebook(book_num);
	}
	
	//글 수정
	public void updatebook(BookDto dto) {
		BookManager.updatebook(dto);
		
	}

	//같은 책제목은 리스트에 하나만 나오도록 하는 것 출력
	public List samelist(String book_title) {
		return BookManager.samelist(book_title);
	}
	
	//책 조건검색
	public List condition1(ConditionDto dto) {
		return BookManager.condition1(dto);
	}
	
	//책 조건검색
	public List condition2(ConditionDto dto) {
		return BookManager.condition2(dto);
	}
	
	//책 조건검색
	public List condition3(ConditionDto dto) {
		return BookManager.condition3(dto);
	}
	
	//사용자 책 대여
	public void bookrental(BookDto dto,RentalInfoDto infodto,int book_num) {
	
		BookManager.rentalbook(dto, infodto, book_num);
		
	}
	
	//사용자 책 대여 리스트
	public List mylist( BookandRentalDto joindto) {
		// TODO Auto-generated method stub
		return BookManager.mylist(joindto);
	}
	
	//사용자 책 반납 
	public void bookreturn(int book_num, String member_email) {
		BookManager.bookreturn(book_num, member_email);
		
	}
	
	//사용자 책 예약
	public void bookres(int book_num, BookResDto resdto,String member_email) {
		BookManager.bookres(book_num, resdto,member_email);
		
	}
	
	//사용자 책 예약 리스트
	public List myreslist(BookandRentalDto joindto) {
		// TODO Auto-generated method stub
		return BookManager.myreslist(joindto);
	}
	
	//책 연장 
	public void bookextension(int book_num) {
		BookManager.bookextension(book_num);
		
	}
	
	//책 예약 취소
	public void bookrescancel(int book_num,String member_email) {
		BookManager.bookrescancel(book_num,member_email);
		
	}
	
	//관리자 예약 취소 
	public void bookrestodaycancel() {
		BookManager.bookrestodaycancel();
		
	}
	
	//관리자에게 보여지는 전체 대여 책 리스트
	public List rantalinfoList(){
		// TODO Auto-generated method stub
		return BookManager.rantalinfolist();
	}
	
	//관리자에게 보여지는 전체 예약 책 리스트
	public List resbookList() {
		// TODO Auto-generated method stub
		return BookManager.resbooklist();
	}
	
	//사용자가 예약 후에 책을 대여
	public void bookresrental(BookDto dto, RentalInfoDto infodto, int book_num) {
		BookManager.resrentalbook(dto, infodto, book_num);
		
	}
	
	
	
	
	

}