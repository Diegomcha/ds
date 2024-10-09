package form.validator;

public class OptionsValidator implements Validator {

	private final String[] opts;

	public OptionsValidator(String... opts) {
		this.opts = opts;
	}

	@Override
	public boolean validate(String input) {

		for (String opt : opts)
			if (opt.equals(input))
				return true;

		return false;
	}

}
