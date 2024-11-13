package main;

import model.Customer;
import model.Movie;
import model.Rental;
import model.category.ChildrensCategory;
import model.category.RegularCategory;

public class Main {

	public static void main(String[] args) {

		Customer raul = new Customer("Raúl");

		Movie hotFuzz = new Movie("Hot Fuzz", new RegularCategory());
		Movie toyStory = new Movie("Toy Story", new ChildrensCategory());
		Movie zombiesParty = new Movie("Zombies Party", new RegularCategory());

		raul.addRental(new Rental(hotFuzz, 2));
		raul.addRental(new Rental(toyStory, 6));
		raul.addRental(new Rental(zombiesParty, 8));

		System.out.println(raul.status());

	}
}
