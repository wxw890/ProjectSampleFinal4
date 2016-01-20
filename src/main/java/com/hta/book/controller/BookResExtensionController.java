package com.hta.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hta.book.repository.BookDto;
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
	
	@RequestMapping("/rescan.book")
	public String reshandle(int book_num, int res_num){
		System.out.println(book_num);
		System.out.println("예약 취소:"+res_num );
		
		bookService.bookrescancel(book_num, res_num);
	
		return "redirect:myrental.book";
		
	}
	
	
}
