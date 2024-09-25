package session2.instruction;

import session2.vm.State;

import java.util.Stack;

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
