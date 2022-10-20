package com.digitalbook.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbook.model.Book;
import com.digitalbook.serviceImpl.BookServiceImpl;

@RestController
public class BookController {
	
	@Autowired
	private BookServiceImpl bookServiceimpl;
	
	@GetMapping("/getBookData")
	public List<Book> getAllStudent(){
		List<Book> bookList = bookServiceimpl.getAllBook();
		return bookList;
	}
	
	@PostMapping("/addBook")
	public Book addCourse(@RequestBody Book book){
		return this.bookServiceimpl.addBook(book);
	}
	
	@PostMapping("/updateBook/{bookId}")
	public Book updateCourse(@RequestBody Book book){
		return this.bookServiceimpl.updateBook(book);
	}
	
	@DeleteMapping("/deleteBook/{bookId}")
	public ResponseEntity<HttpStatus> deleteBook(@PathVariable Integer bookId){
		try {
			this.bookServiceimpl.deleteBook(bookId);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}


}
