package outputs.filters;

import java.io.IOException;

import fileSystem.Output;

public class Normalizer implements Output {

	private Output output;

	public Normalizer(Output output) {
		this.output = output;
	}

	public void send(char c) throws IOException {
		if (c != '\r')
			output.send(c);
	}

	public void close() throws IOException {
		output.close();
	}
}
