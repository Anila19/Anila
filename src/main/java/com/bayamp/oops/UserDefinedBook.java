package com.bayamp.oops;

public class UserDefinedBook {

	private String author;
	private String publisher;
	private int pages;
	private String title;
	private int publishedyear;

	public UserDefinedBook(String author, String publisher, int pages,
			String title, int publishedyear)

	{
		this.author = author;
		this.publisher = publisher;
		this.pages = pages;
		this.title = title;
		this.publishedyear = publishedyear;
	}

	/*
	 * public UserDefinedBook[] getBook(UserDefinedBook[] myBooks, int index)
	 * 
	 * {
	 * 
	 * return myBooks; }
	 */
	public String toString() {
		return ("Author :  " + this.author + " \n publisher :  "
				+ this.publisher + "\n pages : " + this.pages + "\n title : "
				+ this.title + " " + "\n publishedyesr :  " + this.publishedyear);
	}

	public void print() {
		System.out.println("the author is  :" + author);
	}

	public void setAuthor() {
		this.author = "charles";
	}
}
