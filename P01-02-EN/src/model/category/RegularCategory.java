package model.category;

import model.Rental;

public class RegularCategory extends OnePointCategory {

	@Override
	public double getPrice(Rental rental) {
		double price = 2;
		if (rental.getDays() > 2)
			price += (rental.getDays() - 2) * 1.5;
		return price;
	}
}
