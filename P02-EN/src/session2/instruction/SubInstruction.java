package session2.instruction;

import session2.vm.State;

import java.util.Stack;

public class SubInstruction extends AbstractInstruction {

    @Override
    protected void executeAndAdvance(State state) {
        Stack<Integer> stack = state.getStack();
        int b = stack.pop();
        int a = stack.pop();
        stack.push(a - b);
    }

    @Override
    public String getId() {
        return "sub";
    }
}
