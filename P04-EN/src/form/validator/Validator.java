package form.validator;

public interface Validator {

	/**
	 * Validates the provided input.
	 * 
	 * @param input Input to validate.
	 * @return Whether the input is valid or not.
	 */
	boolean validate(String input);

}
