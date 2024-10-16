package validations;

import form.*;

public class CheckNumber implements Validation {

	public boolean isValid(String text) {
		for (char ch : text.toCharArray())
			if (!Character.isDigit(ch))
				return false;
		return true;
	}
}
