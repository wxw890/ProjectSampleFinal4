package com.hta.book.controller;

import java.util.List;

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
import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;

@Controller
public class RentalBookController {
	private BookService bookService;
	
	
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping("/rental.book")
	public  ModelAndView rentalhandle(@ModelAttribute RentalInfoDto infodto, BookDto dto,int book_num, BookandRentalDto joindto, HttpSession session, HttpServletRequest req){
		ModelAndView mav = new ModelAndView("redirect:myrental.book");
		String book_title = req.getParameter("book_title");
		System.out.println("rentalcontroller:"+book_num);
		String member_email = (String)session.getAttribute("email");
		session.setAttribute("member_email", member_email); //session에 이메일값 저장.
		infodto.setMember_email(member_email);
		infodto.setBook_num(book_num);
		bookService.bookrental(dto, infodto,book_num);

		
		return mav;
		
		
	}
	
	
	
	
	@RequestMapping("/myrental.book")
	public ModelAndView mylist(@ModelAttribute BookandRentalDto joindto, HttpSession session, HttpServletRequest req){
		ModelAndView mav = new ModelAndView("myrental");
		String member_email = (String)session.getAttribute("email");
		session.setAttribute("member_email", member_email); //session에 이메일값 저장.
		joindto.setMember_email(member_email);
		
		List list = bookService.mylist(joindto);
		List lists = bookService.myreslist(joindto);
		
		mav.addObject("list", list);
		mav.addObject("lists", lists);
		
		return mav;
		
	}

	
}
