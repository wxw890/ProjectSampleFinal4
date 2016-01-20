package com.hta.book.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hta.board.repository.BoardDto;
import com.hta.board.service.BoardService;
import com.hta.book.repository.BookDto;
import com.hta.book.service.BookService;

@Controller
public class BookUpdateController {
	private BookService bookService;
	
	

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}



	@RequestMapping(value="/bookupdate", method=RequestMethod.GET)
	public ModelAndView changehandle(@RequestParam int book_num){
		ModelAndView mav = new ModelAndView("bookupdate");
		BookDto dto = bookService.findBynum(book_num);
		
		mav.addObject("dto", dto);
		return mav;
		
	}
	@RequestMapping(value="/bookupdate", method=RequestMethod.POST)
	public String submitted(@ModelAttribute BookDto dto){
		System.out.println(dto.getBook_title());
		try {
			bookService.updatebook(dto);
			
		} catch (Exception err) {
			System.out.println("writeErrorMessage:"+ err);
		}
		System.out.println(dto.getBook_num());
		return "redirect:success.book";
	}
	
	
	
}
