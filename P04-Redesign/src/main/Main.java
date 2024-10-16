package main;

import form.*;
import validations.*;

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
