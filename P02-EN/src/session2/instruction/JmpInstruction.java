package session2.instruction;

import session2.vm.Instruction;
import session2.vm.State;

import java.util.List;

public class JmpInstruction implements Instruction {

    private List<String> args;

    @Override
    public Instruction setArgs(List<String> args) {
        this.args = args;
        return this;
    }

    @Override
    public void execute(State state) {
        state.setIP(Integer.parseInt(this.args.getFirst()));
    }

    @Override
    public String getId() {
        return "jmp";
    }
}
