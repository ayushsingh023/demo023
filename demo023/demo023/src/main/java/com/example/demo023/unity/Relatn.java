package com.example.demo023.unity;

public class Relatn {

	private long id;
	private String title;
	private String author;
	
	
	
	
	
	public Relatn(long id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}


	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Relation [id=" + id + ", title=" + title + ", author=" + author + "]";
	}


}
