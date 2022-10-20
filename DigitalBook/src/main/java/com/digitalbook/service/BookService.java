package com.digitalbook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.digitalbook.model.Book;

@Service
public interface BookService {

	List<Book> getAllBook();

	public Book addBook(Book book);

	public Book updateBook(Book book);

	public void deleteBook(Integer bid);

}
