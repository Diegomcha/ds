package transformers;

import java.io.IOException;
import java.util.Objects;

import fileSystem.Output;

public class Multiplexer implements Output {

	private final Output[] outs;
	
	public Multiplexer(Output... outputs ) {
		this.outs = Objects.requireNonNull(outputs);
	}
	
	@Override
	public void send(char c) throws IOException {
		for (Output out: outs)
			out.send(c);
	}

	@Override
	public void close() throws IOException {
		for (Output out: outs)
			out.close();
	}

}
