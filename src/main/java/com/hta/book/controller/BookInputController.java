package com.hta.book.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hta.book.repository.BookDto;
import com.hta.book.service.BookService;

@Controller
public class BookInputController {
	private BookService bookService;
	
	
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	//book 저장페이지
	@RequestMapping(value="/bookinput", method=RequestMethod.GET)
	public String bookinhandle(){
		
		return "bookinput";
		
	}
	
	//book 저장
	@RequestMapping(value="/bookinput", method=RequestMethod.POST)
	public String booksubmit(@ModelAttribute BookDto dto) {
		try {
			
			bookService.bookinput(dto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return "redirect:bookinput";//책 추가 할게 많을 경우 대비해서 다시 리셋 된다.
		
	}
	
	//전체 목록 보여주기 
	@RequestMapping("/success.book")
	public ModelAndView pageHandler(){
		ModelAndView mav = new ModelAndView("successbook");
		try {
			
			List list = bookService.getList();
			System.out.println("input size :"+list.size());
			mav.addObject("list", list);
		} catch (Exception err) {
			System.out.println("ListController:pageHandler():" + err);
		}
	
		return mav;
		
	}
	
	//오늘 등록한 책 목록 보여주기
	@RequestMapping("/today.book")
	public ModelAndView pageHandler1(){
		ModelAndView mav = new ModelAndView("todaybook");
		try {
				
			List list = bookService.todayList();
				
			mav.addObject("list", list);
		} catch (Exception err) {
			System.out.println("ListController:pageHandler():" + err);
		}
	
		return mav;
			
	}
	
	
}
