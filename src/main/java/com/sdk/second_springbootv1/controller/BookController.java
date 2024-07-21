package com.sdk.second_springbootv1.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sdk.second_springbootv1.model.Book;
import com.sdk.second_springbootv1.service.BookServiceImpl;

@RestController
public class BookController {
	@Autowired
	BookServiceImpl bookServiceImpl;
	
	@PostMapping("/")
	public void addBook(@RequestBody Book book) {
		System.out.println("==================================>>addBook");
		bookServiceImpl.addBook(book);
		
	}
	@GetMapping("/find_all")
	public HashSet<Book> getAllBooks(){
		System.out.println("==================================>>getAllBooks");
		return bookServiceImpl.findAllBooks();
	}
	
	@GetMapping("/find_by_id/{bookid}")
	public Book getBookById(@PathVariable long bookid) {
		System.out.println("==================================>>FindByid");
		return bookServiceImpl.findById(bookid);
		
	}
	
	@GetMapping("/del_by_id/{bookid}")
	public void delBookById(@PathVariable long bookid) {
		System.out.println("==================================>>DelByid");
		bookServiceImpl.delById(bookid);
	}
	
	@DeleteMapping("/delete")
	public void deleteAllBooks() {
		System.out.println("==================================>>DelAll");
		bookServiceImpl.deleteAllBooks();
	}
	
	
}
