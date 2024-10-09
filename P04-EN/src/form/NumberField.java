package form;

import java.io.*;

public class NumberField implements Field {

	private String label;

	public NumberField(String label) {
		this.label = label;
	}

	@Override
	public void ask4Data() {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		boolean valid;
		do {
			valid = true;
			try {
				System.out.print(label + ": ");
				text = console.readLine();

				for (char ch : text.toCharArray()) {
					if (!Character.isDigit(ch)) {
						valid = false;
						break;
					}
				}
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valid);
	}

	@Override
	public String getData() {
		return text;
	}

	@Override
	public String getLabel() {
		return label;
	}
	
	private String text;
}
