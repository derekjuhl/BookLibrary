package com.spconger.MediaCollection;

public class Movie extends Item{
	private String genre;
	private String year;
	private String studio;
	private String leadingActor;
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public String getLeadingActor() {
		return leadingActor;
	}
	public void setLeadingActor(String leadingActor) {
		this.leadingActor = leadingActor;
	}
}
