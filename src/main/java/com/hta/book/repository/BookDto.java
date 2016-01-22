package com.hta.book.repository;

import org.springframework.web.multipart.MultipartFile;

public class BookDto {
	private int book_num;    //책 번호
	private String  book_loc;//책 소장위치
	private boolean  book_status;//책 대여상태
	private String  book_img;//책 이미지
	private String  book_imdate;//책 입고날짜
	private boolean  book_res;//책 예약상태
	private String  book_chunggu;//책 청구기호
	private String  book_isbn;//책 isbn
	private String  book_title; //책 제목         
	private String  book_label;  //책 출판사        
	private String  book_author;  //책 저자        
	private String  book_genre;//책 장르
	private MultipartFile upFile;

	
	public MultipartFile getUpFile() {
		return upFile;
	}
	public void setUpFile(MultipartFile upFile) {
		this.upFile = upFile;
	}
	public String getBook_img() {
		return book_img;
	}
	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}
	public boolean isBook_status() {
		return book_status;
	}
	public void setBook_status(boolean book_status) {
		this.book_status = book_status;
	}
	public boolean isBook_res() {
		return book_res;
	}
	public void setBook_res(boolean book_res) {
		this.book_res = book_res;
	}
	public int getBook_num() {
		return book_num;
	}
	public void setBook_num(int book_num) {
		this.book_num = book_num;
	}
	public String getBook_loc() {
		return book_loc;
	}
	public void setBook_loc(String book_loc) {
		this.book_loc = book_loc;
	}

	
	public String getBook_imdate() {
		return book_imdate;
	}
	public void setBook_imdate(String book_imdate) {
		this.book_imdate = book_imdate;
	}
	
	public String getBook_chunggu() {
		return book_chunggu;
	}
	public void setBook_chunggu(String book_chunggu) {
		this.book_chunggu = book_chunggu;
	}
	public String getBook_isbn() {
		return book_isbn;
	}
	public void setBook_isbn(String book_isbn) {
		this.book_isbn = book_isbn;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_label() {
		return book_label;
	}
	public void setBook_label(String book_label) {
		this.book_label = book_label;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	
	
	
}
