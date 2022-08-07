package com.gopibhoyar.books.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gopibhoyar.books.entities.Book;

@Service
public class BookServiceImpl implements BookService {

	List<Book> books;
	
	public BookServiceImpl() {
		books = new ArrayList<>();
		books.add(new Book(1, "Java", "John", "This is Java book", 1998));
		books.add(new Book(2, "Python", "Auth Py", "This is Python book", 1999));
		books.add(new Book(3, "Rust", "Auth Ru", "This is Rust book", 2000));
	}
	
	@Override
	public List<Book> getBooks() {			
		return books;
	}

	@Override
	public Book getBook(long bookId) {
		Book b = null;
		for(Book book1:books) {
			if(book1.getId() == bookId) {
				b = book1;
				break;
			}
		}
		return b;
	}

	@Override
	public Book addBook(Book book) {
		books.add(book);
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		
		for(Book book2: books) {
			if(book.getId() == book2.getId()) {
				book2.setTitle(book.getTitle());
				book2.setAuthor(book.getAuthor());
				book2.setDescription(book.getDescription());
				book2.setYearPublished(book.getYearPublished());
			}
		}
		return book;
	}

	@Override
	public String deleteBook(long bookId) {
		Book b = null;
		for(Book book3: books) {
			if(bookId == book3.getId()) {
				b = book3;
			}
		}
		books.remove(books.indexOf(b));
		return "Book Deleted..!!";
	}
	
}
