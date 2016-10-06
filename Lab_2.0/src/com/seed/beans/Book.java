package com.seed.beans;

//TODO:0	Modification required
public class Book extends Product{
	private String authorName;
	private String publication;
	
//	TODO:1	Provide no-argument public constructor
	public Book(){
		
	}
//	TODO:2	Provide getters and setters for all attributes.

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}
	
}
