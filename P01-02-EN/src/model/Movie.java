package model;

import model.category.MovieCategory;

public class Movie // Movie
{
	private String title;
	private MovieCategory category;

	public Movie(String title, MovieCategory category) {
		this.title = title;
		this.category = category;
	}

	public MovieCategory getCategory() {
		return category;
	}

	public void setCategory(MovieCategory category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public int getPoints(Rental rental) {
		return this.getCategory().getPoints(rental);
	}

	public double getPrice(Rental rental) {
		return this.getCategory().getPrice(rental);
	}
}
