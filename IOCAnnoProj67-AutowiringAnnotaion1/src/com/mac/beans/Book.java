package com.mac.beans;

import org.springframework.beans.factory.annotation.Required;

public class Book {
	private int bookid;
	private String bname;
	private String author;
	
	public int getBookid() {
		return bookid;
	}
	
	@Required
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBname() {
		return bname;
	}
	
	@Required
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bname=" + bname + ", author=" + author + "]";
	}
	
	
}
