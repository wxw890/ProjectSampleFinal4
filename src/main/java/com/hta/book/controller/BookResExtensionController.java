package com.hta.book.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hta.book.repository.BookDto;
import com.hta.book.repository.BookandRentalDto;
import com.hta.book.repository.RentalInfoDto;
import com.hta.book.service.BookService;

@Controller
public class BookResExtensionController {
	private BookService bookService;
	
	
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping("/extension.book")
	public String extensionhandle(int book_num){
		System.out.println(book_num);
		bookService.bookextension(book_num);
	
		return "redirect:myrental.book";
		
	}
	
	//예약 취소처리
	@RequestMapping("/rescan.book")
	public String reshandle(int book_num, HttpSession session){
		System.out.println("예약취소처리:"+book_num);
		System.out.println("예약취소처리이메일:");
		String member_email = (String)session.getAttribute("email");
		bookService.bookrescancel(book_num, member_email);
	
		return "redirect:myrental.book";
		
	}
	//예약 후 대여처리
	@RequestMapping("/resrental.book")
	public  ModelAndView resrentalhandle(@ModelAttribute RentalInfoDto infodto, BookDto dto,int book_num, BookandRentalDto joindto, HttpSession session, HttpServletRequest req){
		ModelAndView mav = new ModelAndView("redirect:myrental.book");
	
		System.out.println("rentalcontroller:"+book_num);
		String member_email = (String)session.getAttribute("email");
		session.setAttribute("member_email", member_email); //session에 이메일값 저장.
		infodto.setMember_email(member_email);
		infodto.setBook_num(book_num);
		bookService.bookresrental(dto, infodto,book_num);

		
		return mav;
		
		
	}
	
	
}