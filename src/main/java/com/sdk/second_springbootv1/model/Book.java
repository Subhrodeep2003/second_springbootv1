package com.sdk.second_springbootv1.model;

public class Book {
	private int bookid;
	private String title;
	private String author;
	public Book(int bookid, String title, String author) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBook(int bookid) {
		this.bookid = bookid;
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
	@Override
	public String toString() {
		return "Book [book=" + bookid + ", title=" + title + ", author=" + author + "]";
	}
	
	
	

}
