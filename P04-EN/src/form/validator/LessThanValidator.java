package form.validator;

public class LessThanValidator implements Validator {

	private final int value;
	
	public LessThanValidator(int value) {
		this.value = value;
	}
	
	@Override
	public boolean validate(String input) {
		try {
			return Integer.parseInt(input) < this.value;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
