package validations;

import validations.composite.CheckAll;

public class CheckPostalCode extends CheckAll {

	public CheckPostalCode() {
		super(new CheckNumber(), new CheckLength(5));
	}
}
