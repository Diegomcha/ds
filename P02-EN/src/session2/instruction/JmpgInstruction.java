package session2.instruction;

import session2.vm.Instruction;
import session2.vm.State;

import java.util.List;
import java.util.Stack;

public class JmpgInstruction implements Instruction {

    private List<String> args;

    @Override
    public Instruction setArgs(List<String> args) {
        this.args = args;
        return this;
    }

    @Override
    public void execute(State state) {
        Stack<Integer> stack = state.getStack();
        int b = stack.pop();
        int a = stack.pop();
        if (a > b)
            state.setIP(Integer.parseInt(args.getFirst()));
        else
            state.setIP(state.getIP() + 1);
    }

    @Override
    public String getId() {
        return "jmpg";
    }

}
