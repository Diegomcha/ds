package validations;

import form.*;

public class CheckGreater implements Validation {

	private int limit;

	public CheckGreater(int limit) {
		this.limit = limit;
	}

	public boolean isValid(String text) {
		return Integer.parseInt(text) > limit;
	}

}
