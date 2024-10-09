package form.validator;

public class LengthValidator implements Validator {

	private final int length;
	
	public LengthValidator(int length) {
		this.length = length;
	}
	
	@Override
	public boolean validate(String input) {
		return input.length() == this.length;
	}

}
