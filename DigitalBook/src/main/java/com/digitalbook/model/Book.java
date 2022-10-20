package com.digitalbook.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	private int bid;
	private String bookName;
	private String bookContent;
	private String category;
	private String bookAuthorName;
	private String publisherName;
	private String imagepath;
	private String price;
	private Date Created_at;
	private Date Updated_at;
	private int is_active;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bid, String bookName, String bookContent, String category, String bookAuthorName,
			String publisherName, String imagepath, String price, Date created_at, Date updated_at, int is_active) {
		super();
		this.bid = bid;
		this.bookName = bookName;
		this.bookContent = bookContent;
		this.category = category;
		this.bookAuthorName = bookAuthorName;
		this.publisherName = publisherName;
		this.imagepath = imagepath;
		this.price = price;
		Created_at = created_at;
		Updated_at = updated_at;
		this.is_active = is_active;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookContent() {
		return bookContent;
	}

	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBookAuthorName() {
		return bookAuthorName;
	}

	public void setBookAuthorName(String bookAuthorName) {
		this.bookAuthorName = bookAuthorName;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Date getCreated_at() {
		return Created_at;
	}

	public void setCreated_at(Date created_at) {
		Created_at = created_at;
	}

	public Date getUpdated_at() {
		return Updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		Updated_at = updated_at;
	}

	public int getIs_active() {
		return is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", " + (bookName != null ? "bookName=" + bookName + ", " : "")
				+ (bookContent != null ? "bookContent=" + bookContent + ", " : "")
				+ (category != null ? "category=" + category + ", " : "")
				+ (bookAuthorName != null ? "bookAuthorName=" + bookAuthorName + ", " : "")
				+ (publisherName != null ? "publisherName=" + publisherName + ", " : "")
				+ (imagepath != null ? "imagepath=" + imagepath + ", " : "")
				+ (price != null ? "price=" + price + ", " : "")
				+ (Created_at != null ? "Created_at=" + Created_at + ", " : "")
				+ (Updated_at != null ? "Updated_at=" + Updated_at + ", " : "") + "is_active=" + is_active + "]";
	}

}
