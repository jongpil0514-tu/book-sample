package com.framework.book;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/book")
public class BookController {
	
	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/list")
	public String listBooks(@RequestParam("num") int num, Model model) {
		// Logic to retrieve the list of books
		List<Map<String, Object>> books = bookService.getBooks();
		model.addAttribute("books", books);
		return "book/list";
	}

}
