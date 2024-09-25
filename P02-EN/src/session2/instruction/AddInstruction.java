package session2.instruction;

import session2.vm.State;

import java.util.Stack;

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
