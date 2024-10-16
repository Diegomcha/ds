package validations;

import form.*;

public class CheckLess implements Validation {

	private int limit;

	public CheckLess(int limit) {
		this.limit = limit;
	}

	public boolean isValid(String text) {
		return Integer.parseInt(text) < limit;
	}

}
