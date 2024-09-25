package session2.instruction;

import session2.vm.State;

import java.util.Stack;

public class StoreInstruction extends AbstractInstruction {

    @Override
    protected void executeAndAdvance(State state) {
        Stack<Integer> stack = state.getStack();
        int value = stack.pop();
        int address = stack.pop();
        state.getMemory()[address] = value;
    }

    @Override
    public String getId() {
        return "store";
    }
}
