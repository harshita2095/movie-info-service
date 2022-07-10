package com.javabrains.movieinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.javabrains.movieinfoservice.models.Movie;
import com.javabrains.movieinfoservice.models.MovieSummary;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
	
	@Value("${api.key}")
	private String apiKey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	//when Movie.java has only two parameters
//	@RequestMapping("{movieId}")
//	public Movie getMovieInfo(@PathVariable String movieId) {
//		return new Movie(movieId,"Titanic");
//		
//	}
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		MovieSummary movieSummary = restTemplate.getForObject("http://api.themoviedb.org/3/movie/" + movieId 
				+ "?api_key=" +apiKey, MovieSummary.class);
		return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
	}
	
	

}
