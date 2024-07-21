package com.sdk.second_springbootv1.service;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.sdk.second_springbootv1.model.Book;
@Service
public class BookServiceImpl  implements BookService{
	HashSet<Book> bookList=new HashSet<>();
	
	@Override
	public HashSet<Book> findAllBooks() {
		if(bookList.isEmpty()) {
			return null;
		}else {
			return bookList;
		}
		
	}

	@Override
	public Book findById(long bookid) {
		Book book=bookList.stream().filter(b->b.getBookid()==bookid).findAny().orElse(null);
		System.out.println(" book found with id:"+bookid);
		return book;
	}
	
	@Override
	public void delById(long bookid) {
		Book book=bookList.stream().filter(b->b.getBookid()==bookid).findAny().orElse(null);
		System.out.println(" book deleted with id:"+bookid);
		bookList.remove(book);
	}

	@Override
	public void addBook(Book b) {
		
		boolean idExists=bookList.stream().anyMatch(bk->bk.getBookid()==b.getBookid());
		if(idExists) {
			System.out.println("already a book exist with id:"+b.getBookid());
		}
		else {
			bookList.add(b);
		}	
	}

	@Override
	public void deleteAllBooks() {
		bookList.clear();
		
	}

}
