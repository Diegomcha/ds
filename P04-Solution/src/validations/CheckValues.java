package validations;

import form.*;

public class CheckValues implements Validation {

	public CheckValues(String... values) {
		this.values = values;
	}

	public boolean isValid(String texto) {
		for (String value : values)
			if (texto.toLowerCase().equals(value.toLowerCase()))
				return true;
		return false;
	}

	private String[] values;
}
