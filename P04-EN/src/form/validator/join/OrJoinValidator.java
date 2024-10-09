package form.validator.join;

import form.validator.Validator;

public class OrJoinValidator implements Validator {

	private final Validator[] validators;

	public OrJoinValidator(Validator... validators) {
		this.validators = validators;
	}

	@Override
	public boolean validate(String input) {
		for (Validator validator : this.validators)
			if (validator.validate(input))
				return true;

		return false;
	}

}
