package validations;

import form.*;

public class CheckLength implements Validation {

	public CheckLength(int length) {
		this.length = length;
	}

	public boolean isValid(String text) {
		return text.length() == length;
	}

	private int length;
}
