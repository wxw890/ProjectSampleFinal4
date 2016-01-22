package com.hta.book.repository;

public class RentalInfoDto {

    private String rental_date;//대여 날짜
	private String renbtal_returndate; //반납 예정일
	private int return_sal;//연체료
	private int rental_extension;//책 연장 상태


	private int book_num;            
	private String member_email;
    private String overdate;   //연체일
   	
    
    
	public String getOverdate() {
		return overdate;
	}
	public void setOverdate(String overdate) {
		this.overdate = overdate;
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
