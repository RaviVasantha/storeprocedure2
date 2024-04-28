package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class IBookServiceImpl implements IbookService {


private IBookRepository ibr;

@Autowired
public void setIbr(IBookRepository ibr) {
	this.ibr = ibr;
}


public String save(Book b) {
	ibr.save(b);
	return "success";
}
public List<Book> findall() {
	return ibr.findAll();
	
}
public List<Book> getbooksbyprice(int price) {
	return ibr.get_books_by_price(price);
}
@Override
public int getBookCount(String author) {
	return ibr.get_Book_Count(author);
}
public List<Book> getbooksbyAuthor(String author) {
	return ibr.get_books_by_Author(author);
}
@Override
public int getCountBook(String author) {
	return ibr.getCountBook(author);
}
@Override
@Transactional
public int getCount(String author) {
	return ibr.getCount(author);
}
@Override
public List<Book> getBookByAuthor(String author) {
	return ibr.getBookByAuthor(author);
}
}
