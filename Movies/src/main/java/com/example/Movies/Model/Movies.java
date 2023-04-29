package com.example.Movies.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movies {
	@Id
	
	private String name;
	private String relesedate;
	private String language;
	private String runningtime;
	private String category;
	private String rating;

	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getRelesedate() 
	{
		return relesedate;
	}
	public void setRelesedate(String relesedate) 
	{
		this.relesedate = relesedate;
	}
	
	public String getLanguage() 
	{
		return language;
	}
	public void setlanguage(String language) 
	{
		this.language = language;
	}
	
	public String getRunningtime() 
	{
		return runningtime;
	}
	public void setRunningtime(String runningtime) 
	{
		this.runningtime = runningtime;
	}
	
	public String getCategory() 
	{
		return category;
	}
	public void setCategory(String category) 
	{
		this.category = category;
	}
	
	public String getRating() 
	{
		return rating;
	}
	public void setRating(String rating) 
	{
		this.rating = rating;
	}
}
