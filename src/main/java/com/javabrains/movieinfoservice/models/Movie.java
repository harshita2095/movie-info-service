package com.javabrains.movieinfoservice.models;

public class Movie {
	
	private String movieId;
	private String title;
	private String description;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Movie(String movieId, String title, String description) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.description = description;
	}
	
	
	
	

}
