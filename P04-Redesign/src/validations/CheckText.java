package validations;

import form.Validation;

public class CheckText implements Validation {

	public boolean isValid(String text) {
		for (char ch : text.toCharArray())
			if (!Character.isLetter(ch))
				return false;
		return true;
	}
}
