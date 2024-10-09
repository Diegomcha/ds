package main;

import form.NumberField;
import form.PredefinedField;
import form.TextField;
import form.Form;

public class Main {

	public static void main(String[] args) {
		Form form = new Form();

		form.addField(new TextField("Name"));
		form.addField(new TextField("Surname"));
		form.addField(new NumberField("Telephone"));
		form.addField(new PredefinedField("City", "Santander", "Oviedo", "Barcelona"));

		form.ask4Data();
		form.writeForm();
	}
}
