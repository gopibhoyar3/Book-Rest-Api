package com.gopibhoyar.books.services;

import java.util.List;

import com.gopibhoyar.books.entities.Book;

public interface BookService {
	public List<Book> getBooks();
	public Book getBook(long bookId);
	public Book addBook(Book book);
	public Book updateBook(Book book);
	public String deleteBook(long bookId);
}
