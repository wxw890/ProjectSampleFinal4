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
	//책 조건검색

	public List samelist(String book_title) {
		System.out.println(book_title);
		return BookManager.samelist(book_title);
	}
	public List condition1(ConditionDto dto) {
		System.out.println("serive :"+ dto.getValue() +","+dto.getItem());
		return BookManager.condition1(dto);
	}
	public List condition2(ConditionDto dto) {
		System.out.println("serive :"+ dto.getSecondvalue() +","+dto.getSeconditem());
		return BookManager.condition2(dto);
	}
	public List condition3(ConditionDto dto) {
		// TODO Auto-generated method stub
		return BookManager.condition3(dto);
	}

	public void bookrental(BookDto dto,RentalInfoDto infodto) {
		System.out.println("rentalservice:"+infodto.getMember_email());
		System.out.println("rentalservice:"+infodto.getBook_num());
		BookManager.rentalbook(dto, infodto);
		
	}
	public List mylist( BookandRentalDto joindto) {
		// TODO Auto-generated method stub
		return BookManager.mylist(joindto);
	}
	public void bookreturn(int rental_num, int book_num) {
		BookManager.bookreturn(rental_num, book_num);
		
	}
	public void bookres(int book_num, BookResDto resdto) {
		BookManager.bookres(book_num, resdto);
		
	}
	public List myreslist(BookandRentalDto joindto) {
		// TODO Auto-generated method stub
		return BookManager.myreslist(joindto);
	}
	
	public void bookextension(int book_num) {
		BookManager.bookextension(book_num);
		
	}
	public void bookrescancel(int book_num, int res_num) {
		BookManager.bookrescancel(book_num, res_num);
		
	}
	
	
	

}
