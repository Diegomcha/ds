package session2.instruction;

import java.util.List;

import session2.vm.Instruction;
import session2.vm.State;

public class JmpInstruction implements Instruction {

	private List<String> args;

	@Override
	public Instruction setArgs(List<String> args) {
		this.args = args;
		return this;
	}

	@Override
	public void execute(State state) {
		state.setIP(Integer.parseInt(this.args.getFirst()));
	}

	@Override
	public String getId() {
		return "jmp";
	}
}
