package validations.composite;

import java.util.Arrays;
import java.util.List;

import form.Validation;

public class CheckAll implements Validation {

	private List<Validation> validations;

	public CheckAll(Validation... validations) {
		this.validations = Arrays.asList(validations);
	}

	public boolean isValid(String text) {
		for (Validation validation : validations)
			if (!validation.isValid(text))
				return false;
		return true;
	}
}
