package session2.instruction;

import java.util.List;

import session2.vm.Instruction;
import session2.vm.State;

public abstract class AbstractInstruction implements Instruction {

	protected List<String> args;

	@Override
	public Instruction setArgs(List<String> args) {
		this.args = args;
		return this;
	}

	@Override
	public void execute(State state) {
		executeAndAdvance(state);
		state.setIP(state.getIP() + 1);
	}

	protected abstract void executeAndAdvance(State state);
}
