package model.category;

import model.Rental;

public class ChildrensCategory extends OnePointCategory {

	@Override
	public double getPrice(Rental rental) {
		double price = 1.5;
		if (rental.getDays() > 3)
			price += (rental.getDays() - 3) * 1.5;
		return price;
	}

}
