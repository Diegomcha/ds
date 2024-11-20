package model.category;

import model.Rental;

public interface MovieCategory {
	public int getPoints(Rental rental);

	public double getPrice(Rental rental);
}
