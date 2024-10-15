package com.ssafy.ws;

public class Audience {
	private Movie movie;
	
	public Audience() {
		super();
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public void aud() {
		System.out.println(this.movie.getInfo()+"를 관람합니다");
	}
}
