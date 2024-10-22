package com.ssafy.mvc.dto;

public class Book {
	private int id;
	private String title;
	private String author;
	private int price;
	private String description;
	
	public Book() {}
	public Book(int id, String title, String author, int price, String description) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", description="
				+ description + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
