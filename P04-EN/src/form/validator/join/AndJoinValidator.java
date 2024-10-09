package form.validator.join;

import form.validator.Validator;

public class AndJoinValidator implements Validator {

	private final Validator[]validators;
	
	public AndJoinValidator(Validator...validators) {
		this.validators = validators;
	}
	
	@Override
	public boolean validate(String input) {
		for (Validator validator: this.validators)
			if (!validator.validate(input))
				return false;
		
		return true;
	}

}
