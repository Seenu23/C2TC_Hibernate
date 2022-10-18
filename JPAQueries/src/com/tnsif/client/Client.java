package com.tnsif.client;

import com.tnsif.entities.Book;
import com.tnsif.service.BookService;
import com.tnsif.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {

		BookService service = new BookServiceImpl();
		
		
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("************Listing book with id 6*************");
		System.out.println("Boo with ID 6:"+service.getBookById(6));
		
		System.out.println("************Listing All books*************");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		
		
		
		System.out.println("************Listing book written byKP Poornachandra Tejaswi *************");
		for(Book book:service.getAuthorBooks("KPPT") ) {
			System.out.println(book);
		}
		
		System.out.println("************Listing book on Nakutanti*************");
		for(Book book:service.getBookByTitle("Nakutanti")) {
			System.out.println(book);
		}
		
		
		
		System.out.println("************Listing All books between 150 and 250*************");
		for(Book book:service.getBooksInPriceRange(150,250) ) {
			System.out.println(book);
		}
		
		
		
		

	}
}