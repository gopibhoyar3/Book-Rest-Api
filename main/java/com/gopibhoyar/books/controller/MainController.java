package com.gopibhoyar.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gopibhoyar.books.entities.Book;
import com.gopibhoyar.books.services.BookService;

@RestController
public class MainController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/")
	public String home() {
		return "Welcome to the Library";	
	}
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return this.bookService.getBooks();
	}
	
	@GetMapping("/books/{bookId}")
	public Book getBook(@PathVariable Long bookId) {
		return this.bookService.getBook(bookId);
	}
	
	@PostMapping("books")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}

	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return this.bookService.updateBook(book);
	}
	
	@DeleteMapping("/books/{bookId}")
	public String deleteBook(@PathVariable Long bookId) {
		return this.bookService.deleteBook(bookId);
	}
}
