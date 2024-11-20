package session2.instruction;

import java.util.Stack;

import session2.vm.State;

public class LoadInstruction extends AbstractInstruction {

	@Override
	protected void executeAndAdvance(State state) {
		Stack<Integer> stack = state.getStack();
		int address = stack.pop();
		stack.push(state.getMemory()[address]);
	}

	@Override
	public String getId() {
		return "load";
	}
}
