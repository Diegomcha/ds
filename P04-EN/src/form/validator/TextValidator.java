package form.validator;

public class TextValidator implements Validator {

	@Override
	public boolean validate(String input) {
		for (char ch : input.toCharArray())
			if (!Character.isLetter(ch))
				return false;

		return true;
	}

}
