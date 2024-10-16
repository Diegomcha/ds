package form;

import java.io.*;

public class Field {

	public Field(String label, Validation validation) {
		this.label = label;
		this.validation = validation;
	}

	public void ask4Data() {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		do {
			try {
				System.out.print(label + ": ");
				text = console.readLine();
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!validation.isValid(text));
	}

	public String getData() {
		return text;
	}
	
	public String getLabel() {
		return label;
	}

	private String text;
	private String label;
	private Validation validation;
}
