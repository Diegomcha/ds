package session2.instruction;

import session2.vm.State;

public class PushInstruction extends AbstractInstruction {

	@Override
	protected void executeAndAdvance(State state) {
		state.getStack().push(Integer.parseInt(args.getFirst()));
	}

	@Override
	public String getId() {
		return "push";
	}
}
