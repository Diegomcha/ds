package validations.composite;

import java.util.*;

import form.*;

public class CheckAny implements Validation {

	private List<Validation> validations;

	public CheckAny(Validation... validations) {
		this.validations = Arrays.asList(validations);
	}

	public boolean isValid(String text) {
		for (Validation validation : validations)
			if (validation.isValid(text))
				return true;
		return false;
	}
}
