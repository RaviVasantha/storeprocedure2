package com.demo;

import java.util.List;

public interface IbookService {

	int getBookCount(String author);
	int getCountBook(String author);
	int getCount(String author);
	List<Book> getBookByAuthor(String author);
	List<Book> getbooksbyAuthor(String author);
	List<Book> getbooksbyprice(int price);
}

