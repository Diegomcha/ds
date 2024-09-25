package model.category;

import model.Rental;

public class NewReleaseCategory implements MovieCategory {

	@Override
	public int getPoints(Rental rental) {
		return rental.getDays() > 1 ? 2 : 1;
	}

	@Override
	public double getPrice(Rental rental) {
		return rental.getDays() * 3;
	}
}
