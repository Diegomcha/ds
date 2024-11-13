package transformers;

import java.io.IOException;

import fileSystem.Output;

public class Counter extends BaseTransformer {

	private int count = 0;

	public Counter(Output out) {
		super(out);
	}

	@Override
	public void send(char c) throws IOException {
		out.send(c);
		count++;
	}

	public int getCount() {
		return count;
	}
}
