package com.capgemini.jpawithhibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_info")
public class MovieInfo {
	
	@Id
	@Column(name="movieid")
	private int movieId;
	
	@Column(name="moviename")
	private String movieName;
	
	@Column(name="movierating")
	private String movieRating;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}
	
	

}
