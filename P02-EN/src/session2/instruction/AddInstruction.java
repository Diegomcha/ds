package session2.instruction;

import java.util.Stack;

import session2.vm.State;

public class AddInstruction extends AbstractInstruction {

	@Override
	protected void executeAndAdvance(State state) {
		Stack<Integer> stack = state.getStack();
		stack.push(stack.pop() + stack.pop());
	}

	@Override
	public String getId() {
		return "add";
	}
}
