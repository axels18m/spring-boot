package com.javasb.Spring.Models;

import java.util.Date;

public class Posts 
{
	private int id;
	private String description;
	private String image;
	private Date date;
	private String title;
	
	public Posts(int Id, String Title, String description, String img, Date datePost)
	{
		this.id = Id;
		this.title = Title;
		this.description = description;
		this.image = img;
		this.date = datePost;
	}
	
	public Posts() { }

	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public String getImage() 
	{
		return image;
	}
	
	public void setImage(String image) 
	{
		this.image = image;
	}
	
	public Date getDate() 
	{
		return date;
	}
	
	public void setDate(Date date) 
	{
		this.date = date;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	
}
