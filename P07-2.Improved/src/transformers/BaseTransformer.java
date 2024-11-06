package transformers;

import java.io.IOException;
import java.util.Objects;

import fileSystem.Output;

/**
 * THIS IS A DECORATOR BECAUSE THE INTERFACE IS THE SAME, it would be ADAPTER if the interfaces were different...
 */

public abstract class BaseTransformer implements Output {

	protected final Output out;
	
	protected BaseTransformer(Output out) {
		this.out = Objects.requireNonNull(out);
	}
	
	@Override
	public final void close() throws IOException {
		out.close();
	}

}
