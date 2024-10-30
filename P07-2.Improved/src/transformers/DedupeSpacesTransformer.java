package transformers;

import java.io.IOException;

import fileSystem.Output;

public class DedupeSpacesTransformer extends BaseTransformer {

	private boolean lastWasWhitespace = false;

	public DedupeSpacesTransformer(Output out) {
		super(out);
	}

	@Override
	public void send(char c) throws IOException {
		if (Character.isWhitespace(c)) {
			// Deduplicate whitespaces
			if (!lastWasWhitespace)
				out.send(c);
			lastWasWhitespace = true;
		} else {
			out.send(c);
			lastWasWhitespace = false;
		}
	}

}
