package validations;

import validations.composite.*;

public class CheckPostalCode extends CheckAll {

	public CheckPostalCode() {
		super(new CheckNumber(), new CheckLength(5));
	}
}
