package session2.vm;

import java.util.List;

public class VirtualMachine {

	private final State state = new State();
	private final List<Instruction> program;

	public VirtualMachine(List<Instruction> program) {
		this.program = program;
	}

	public void executeProgram() {
		while (state.getIP() < program.size()) {
			program.get(state.getIP()).execute(state);
		}
	}
}
