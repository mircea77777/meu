package com.softvision.mircea.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Post {

	@Id
	private long id;
	// 	Userul a caruia este postarea
	private User user;
	private String text;
	private Date dateCreated;
	
	public Post() {
	}
	

	public Post(long id, User user, String text, Date dateCreated) {
		super();
		this.id = id;
		this.user = user;
		this.text = text;
		this.dateCreated = dateCreated;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}


	@Override
	public String toString() {
		return "Post [id=" + id + ", user=" + user + ", text=" + text + ", dateCreated=" + dateCreated + "]";
	}


	
	
	
}
