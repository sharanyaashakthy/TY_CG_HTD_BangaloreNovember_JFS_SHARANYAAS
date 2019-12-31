package com.cg.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Book  extends Author{

	private String bookName="Java";
	
	@Autowired
	@Qualifier("book")
	private Author author;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	public Author getAuthor() {
		return author;
	}
}
