package com.framework.book;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.framework.book.mapper.BookMapper;

@Service
public class BookService {
	
	private final BookMapper bookMapper;
	
	public BookService(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}
	
	public List<Map<String, Object>> getBooks() {
		return bookMapper.selectBookList();
	}
}
