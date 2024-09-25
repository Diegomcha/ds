package session2.instruction;

import session2.vm.Instruction;
import session2.vm.State;

import java.util.List;

public abstract class AbstractInstruction implements Instruction {

    protected List<String> args;

    @Override
    public Instruction setArgs(List<String> args) {
        this.args = args;
        return this;
    }

    @Override
    public void execute(State state) {
        executeAndAdvance(state);
        state.setIP(state.getIP() + 1);
    }

    protected abstract void executeAndAdvance(State state);
}
