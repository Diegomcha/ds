package model;

import java.util.ArrayList;
import java.util.List;

// Video Store client

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public String status() {
		double totalPrice = 0;
		int totalPoints = 0;
		String result = "Rentals of: " + getName() + "\n";

		for (Rental rental : rentals) {

			// 1) Calculation of the rental amount
			double price = rental.getPrice();

			// 2) Each video rental gives 1 point. Extra point for new videos rented 2 or
			// more days of rental
			int points = rental.getPoints();

			// 3) Accumulate the amounts to calculate the total
			totalPrice += price;
			totalPoints += points;

			// 4) Shows the amount of this rented movie
			result += "\t" + rental.getMovie().getTitle() + "\t" + price + " €\n";
		}

		result += "Your debt is " + totalPrice + " €\n";
		result += "You have obtained " + totalPoints + " points in your card";

		return result;
	}
}
