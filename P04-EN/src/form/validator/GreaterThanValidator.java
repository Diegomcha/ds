package form.validator;

public class GreaterThanValidator implements Validator {

	private final int value;

	public GreaterThanValidator(int value) {
		this.value = value;
	}

	@Override
	public boolean validate(String input) {
		try {
			return Integer.parseInt(input) > this.value;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
