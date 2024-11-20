package transformers;

import java.io.IOException;

import fileSystem.Output;

public class EncryptTransformer extends BaseTransformer {

	public EncryptTransformer(Output out) {
		super(out);
	}

	@Override
	public void send(char c) throws IOException {
		out.send(++c);
	}

}
