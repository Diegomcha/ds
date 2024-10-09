package form;

import java.io.*;

public class PredefinedField implements Field {

	private String label;
	private String[] values;

	public PredefinedField(String label, String... values) {
		this.label = label;
		this.values = values;
	}

	@Override
	public void ask4Data() {
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		boolean valid;
		do {
			valid = false;
			try {
				System.out.print(label + ": ");
				text = console.readLine();

				for (String value : values) {
					if (text.toLowerCase().equals(value.toLowerCase())) {
						valid = true;
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
