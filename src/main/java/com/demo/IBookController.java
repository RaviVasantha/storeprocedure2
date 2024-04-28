package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping(value="/Books")
@Transactional
public class IBookController {
	@Autowired
	private IBookServiceImpl ibs;
	@Autowired
	private IbookService bs;
	
	
	@PostMapping(value="/save")
	public String save(@RequestBody Book b) {
		return ibs.save(b);
	}
	@GetMapping(value="/findall")
	public List<Book> findall() {
		return ibs.findall();
	}
	@GetMapping(value="getBookCount/{author}")
	public int getBookCount(@PathVariable String author) {
		return bs.getBookCount(author);
	}
	@GetMapping(value="getBooksByAuthor/{author}")
	public List<Book> getBooksByAuthor(@PathVariable String author) {
		return bs.getbooksbyAuthor(author);
	}
	@GetMapping(value="getCountBook/{author}")
	public int getCountBook(@PathVariable String author) {
		return bs.getCountBook(author);
	}
	@GetMapping(value="getCount/{author}")
	public int getCount(@PathVariable String author) {
		return bs.getCount(author);
	}
	@GetMapping(value="getBookByAuthor/{author}")
	public List<Book> getBookByAuthor(@PathVariable String author) {
		return bs.getBookByAuthor(author);
	}
	@GetMapping(value="getBooksByPrice/{price}")
	public List<Book> getBooksByPrice(@PathVariable int price) {
	return bs.getbooksbyprice(price);
	}

}
