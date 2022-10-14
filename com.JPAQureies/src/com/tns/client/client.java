//https://github.com/NehaSGavali/JPAQureies.git
package com.tns.client;

import com.tns.entity.Book;
import com.tns.service.*;

public class client {
	public static void main(String args[])
	{
		BookService service= new BookServiceImpl();
		
		System.out.println("*********************Listing Book with Id 105********************");
		
		System.out.println("Book with Id 105 :"+service.getBookById(105));

		System.out.println("*********************Listing total number of Books********************");

		System.out.println("Number of Books Available :"+service.getBookCount());
		
		System.out.println("*********************List of Books********************");

		System.out.println(" List of Available Books :"+service.getAllBooks());
		
		System.out.println("*********************Listing Book Write By Danny Coward********************");

		System.out.println("Books written by Danny Coward :"+service.getAuthorBooks("Danny Coward"));
		for(Book book : service.getAuthorBooks("Danny Coward"))
		{
			System.out.println(book);
		}
		
		System.out.println("*********************Listing Book on Android********************");

		System.out.println("Books on Android :"+service.getBookByTitle("Android"));
		for(Book book : service.getBookByTitle("Android"))
		{
			System.out.println(book);
		}

		System.out.println("*********************Listing All Books Between 300 to 550********************");

		System.out.println("Books Price Between 300 to 550 :"+service.getBooksInPriceRange(300, 550));
		for(Book book : service.getBooksInPriceRange(300, 550))
		{
			System.out.println(book);
		}
	}
}
