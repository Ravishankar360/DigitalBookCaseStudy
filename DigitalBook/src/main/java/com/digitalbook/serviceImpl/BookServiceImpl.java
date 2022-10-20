package com.digitalbook.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbook.Repository.BookRepository;
import com.digitalbook.model.Book;
import com.digitalbook.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepo;

	@Override
	public List<Book> getAllBook() {
		List<Book> bookList = bookRepo.getAllBookList();
		if(bookList != null && ! bookList.isEmpty()) {
			return bookList;
		}else {
			return null;
		}
		
	}

	public Book addBook(Book book) {
		bookRepo.save(book);
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		bookRepo.save(book);
		return book;
	}

	@Override
	public void deleteBook(Integer bid) {
		Book book = bookRepo.getOne(bid);
		bookRepo.delete(book);
		
	}

}
