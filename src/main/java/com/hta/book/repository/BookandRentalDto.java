package com.hta.book.repository;

import org.springframework.web.multipart.MultipartFile;

public class BookandRentalDto {
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
    private String rental_date;//대여날짜
	private String renbtal_returndate;//대여 후에 반납예정날짜
	private int return_sal;//연체료      
	private int rental_extension; //책 연장
	private String member_email;//회원이메일
	private int overdate;   //연체일
	private String returndate; //반납 날짜
	
	private String res_date; //예약날짜		
    private String res_end;//예약 종료일
    private int rentallimit;//대여 권 수 한계
    private int reslimit;//예약 권 수 한계
    private MultipartFile file;


	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public String getBook_img() {
		return book_img;
	}
	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}
	public int getRentallimit() {
		return rentallimit;
	}
	public void setRentallimit(int rentallimit) {
		this.rentallimit = rentallimit;
	}
	public int getReslimit() {
		return reslimit;
	}
	public void setReslimit(int reslimit) {
		this.reslimit = reslimit;
	}
	public String getRes_date() {
		return res_date;
	}
	public void setRes_date(String res_date) {
		this.res_date = res_date;
	}
	public String getRes_end() {
		return res_end;
	}
	public void setRes_end(String res_end) {
		this.res_end = res_end;
	}
	
	public int getOverdate() {
		return overdate;
	}
	public void setOverdate(int overdate) {
		this.overdate = overdate;
	}
	public String getReturndate() {
		return returndate;
	}
	public void setReturndate(String returndate) {
		this.returndate = returndate;
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
	public boolean isBook_status() {
		return book_status;
	}
	public void setBook_status(boolean book_status) {
		this.book_status = book_status;
	}
	
	public String getBook_imdate() {
		return book_imdate;
	}
	public void setBook_imdate(String book_imdate) {
		this.book_imdate = book_imdate;
	}
	public boolean isBook_res() {
		return book_res;
	}
	public void setBook_res(boolean book_res) {
		this.book_res = book_res;
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
	
	public String getRental_date() {
		return rental_date;
	}
	public void setRental_date(String rental_date) {
		this.rental_date = rental_date;
	}
	public String getRenbtal_returndate() {
		return renbtal_returndate;
	}
	public void setRenbtal_returndate(String renbtal_returndate) {
		this.renbtal_returndate = renbtal_returndate;
	}
	public int getReturn_sal() {
		return return_sal;
	}
	public void setReturn_sal(int return_sal) {
		this.return_sal = return_sal;
	}
	
	public int getRental_extension() {
		return rental_extension;
	}
	public void setRental_extension(int rental_extension) {
		this.rental_extension = rental_extension;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	
	
}
