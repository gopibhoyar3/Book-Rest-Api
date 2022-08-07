package com.gopibhoyar.books.entities;

public class Book {
	
	private long id;
	private String title;
	private String author;
	private String description;
	private int yearPublished;
	
	public Book() {
		super();
	}

	public Book(long id, String title, String author, String description, int yearPublished) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.description = description;
		this.yearPublished = yearPublished;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", yearPublished=" + yearPublished + "]";
	}
	
}
