package form;

import java.io.*;

public class TextField implements Field {

	private String label;

	public TextField(String etiqueta) {
		this.label = etiqueta;
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
					if (!Character.isLetter(ch)) {
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

	private String text;

	@Override
	public String getLabel() {
		return label;
	}
}
