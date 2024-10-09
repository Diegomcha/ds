package main;

import form.Field;
import form.Form;
import form.validator.DigitsValidator;
import form.validator.GreaterThanValidator;
import form.validator.LengthValidator;
import form.validator.LessThanValidator;
import form.validator.OptionsValidator;
import form.validator.TextValidator;
import form.validator.Validator;
import form.validator.join.AndJoinValidator;
import form.validator.join.OrJoinValidator;

public class Main {

	public static void main(String[] args) {
		Form form = new Form();

		String[] cities = new String[] { "Santander", "Oviedo", "Barcelona" };

		Validator postalCodeValidator = new AndJoinValidator(new DigitsValidator(), new LengthValidator(5));

		form.addField(new Field("Name", new TextValidator()));
		form.addField(new Field("Surname", new TextValidator()));
		form.addField(new Field("Telephone", new DigitsValidator()));
		form.addField(new Field("City", new OptionsValidator(cities)));
		form.addField(new Field("Product code", new LengthValidator(4)));
		form.addField(new Field("Postal code", postalCodeValidator));
		form.addField(new Field("Age", new AndJoinValidator(new DigitsValidator(), new GreaterThanValidator(18))));
		form.addField(new Field("Salary", new AndJoinValidator(new DigitsValidator(), new GreaterThanValidator(800),
				new LessThanValidator(1200))));
		form.addField(new Field("Location", new OrJoinValidator(new OptionsValidator(cities), postalCodeValidator)));
		form.addField(new Field("Promotion code", new OrJoinValidator(new TextValidator(),
				new AndJoinValidator(new LengthValidator(3), new DigitsValidator()))));

		form.ask4Data();
		form.writeForm();
	}
}
