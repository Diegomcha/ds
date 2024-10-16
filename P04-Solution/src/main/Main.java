package main;

import form.*;
import validations.*;
import validations.composite.*;

public class Main {

	public static void main(String[] args) {
		Form form = new Form();

		form.addField(new Field("Name", new CheckText()));
		form.addField(new Field("Surname", new CheckText()));
		form.addField(new Field("Telephone", new CheckNumber()));
		form.addField(new Field("City", new CheckValues("Santander", "Oviedo", "Barcelona")));

		// "Product code". Long = 4
		form.addField(new Field("Product code", new CheckLength(4)));

		// "Postal Code". Digits and long = 5
		form.addField(new Field("Postal Code", new CheckAll(new CheckNumber(), new CheckLength(5))));
		form.addField(new Field("Postal Code", new CheckPostalCode()));

		// "Age". Digit and greater than 18
		form.addField(new Field("Age",
				new CheckAll(new CheckNumber(), new CheckGreater(18))));

		// "Salary". Digits greater than 800 and less than 1200
		form.addField(new Field("Salary",
				new CheckAll(new CheckNumber(), new CheckGreater(800), new CheckLess(1200))));

		// "Location". Santander..Barcelona or postal code
		form.addField(new Field("Location",
				new CheckAny(new CheckValues("Santander", "Oviedo", "Barcelona"), new CheckPostalCode())));

		// "Promotion Code". Text or (a three-digit number)
		form.addField(new Field("Promotion",
				new CheckAny(
						new CheckText(),
						new CheckAll(new CheckNumber(), new CheckLength(3)))));

		form.ask4Data();
		form.writeForm();
	}

}
