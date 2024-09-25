package model;

public class Rental // Rental
{
	private Movie movie;
	private int days;

	public Rental(Movie movie, int days) {
		this.movie = movie;
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public Movie getMovie() {
		return movie;
	}

	/**
	 * Identic to {@link model.Movie#getPoints(model.Rental)}
	 */
	public int getPoints() {
		return movie.getPoints(this);
	}

	/**
	 * Identic to {@link model.Movie#getPrice(model.Rental)}
	 */
	public double getPrice() {
		return movie.getPrice(this);
	}
}
