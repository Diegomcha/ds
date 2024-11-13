package main;

import form.Field;
import form.Form;
import validations.CheckNumber;
import validations.CheckText;
import validations.CheckValues;

public class Main {

	public static void main(String[] args) {
		Form form = new Form();

		form.addField(new Field("Name", new CheckText()));
		form.addField(new Field("Surname", new CheckText()));
		form.addField(new Field("Telephone", new CheckNumber()));
		form.addField(new Field("City", new CheckValues("Santander", "Oviedo", "Barcelona")));

		form.ask4Data();
		form.writeForm();
	}

}
