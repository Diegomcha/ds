package session2.instruction;

import session2.vm.State;

public class OutputInstruction extends AbstractInstruction {

	@Override
	protected void executeAndAdvance(State state) {
		System.out.println(state.getStack().pop());
	}

	@Override
	public String getId() {
		return "output";
	}
}
