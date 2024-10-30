package transformers;

import java.io.IOException;

import fileSystem.Output;

public class NormalizeTransformer extends BaseTransformer {

	public NormalizeTransformer(Output out) {
		super(out);
	}

	@Override
	public void send(char c) throws IOException {
		if (!String.valueOf(c).equals("\r"))
			out.send(c);
	}

}
