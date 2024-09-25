package model.category;

import model.Rental;

public abstract class OnePointCategory implements MovieCategory {

	@Override
	public int getPoints(Rental rental) {
		return 1;
	}

}