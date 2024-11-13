package session2.vm;

import java.util.List;

public interface Instruction {
	String getId();

	Instruction setArgs(List<String> args);

	void execute(State state);
}
