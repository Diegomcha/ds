package form;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import form.validator.Validator;

public class Field {

	private final String label;
	private final Validator validator;
	private String text;

	public Field(String label, Validator validator) {
		this.label = label;
		this.validator = validator;
	}

	public void ask4Data() {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.print(label + ": ");
				try {
					this.text = console.readLine();					
				} catch (IOException e) {
					System.out.println(e);
				}
			} while (!this.validator.validate(this.text));
	}

	public String getData() {
		return text;
	}

	public String getLabel() {
		return label;
	}
}
