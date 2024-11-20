package validations;

import form.Validation;

public class CheckValues implements Validation {

	public CheckValues(String... values) {
		this.values = values;
	}

	public boolean isValid(String text) {
		for (String value : values)
			if (text.toLowerCase().equals(value.toLowerCase()))
				return true;
		return false;
	}

	private String[] values;
}
