package form;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import form.validator.Validator;

public class Field {

	private final String label;
	private final Validator validator;
	private String text;

	/**
	 * Creates a field with a label and some validation.
	 * 
	 * @param label     Label for the field.
	 * @param validator Validator to validate the input.
	 */
	public Field(String label, Validator validator) {
		this.label = label;
		this.validator = validator;
	}

	/**
	 * Asks for data to the user.
	 */
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

	/**
	 * Gets the input provided by the user.
	 * 
	 * @return Input from the user.
	 */
	public String getData() {
		return text;
	}

	/**
	 * Gets the label of the field.
	 * 
	 * @return Label of the field.
	 */
	public String getLabel() {
		return label;
	}
}
