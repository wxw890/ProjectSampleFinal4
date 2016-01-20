package com.hta.book.repository;

public class RentalInfoDto {
	private int rental_num;
    private String rental_date;
	private String renbtal_returndate; //반납예정일
	private int return_sal;//연체료
	private int rental_extension;//예약상태
	private int rental_res1;//예약자
	private int rental_return;//반납상태
	private int book_num;            
	private String member_email;
    private String overdate;   //연체일
    private String returndate; //반납일
	
    
    
	public String getOverdate() {
		return overdate;
	}
	public void setOverdate(String overdate) {
		this.overdate = overdate;
	}
	public String getReturndate() {
		return returndate;
	}
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	public int getRental_num() {
		return rental_num;
	}
	public void setRental_num(int rental_num) {
		this.rental_num = rental_num;
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
	public int getRental_res1() {
		return rental_res1;
	}
	public void setRental_res1(int rental_res1) {
		this.rental_res1 = rental_res1;
	}
	public int getRental_return() {
		return rental_return;
	}
	public void setRental_return(int rental_return) {
		this.rental_return = rental_return;
	}
	public int getBook_num() {
		return book_num;
	}
	public void setBook_num(int book_num) {
		this.book_num = book_num;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	
	
	
	
}
