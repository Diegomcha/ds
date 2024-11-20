package instructions;

import vm.State;

public class Div extends AbstractInstruction {

	@Override
	protected void doExecute(State state) {
		int b = state.pop();
		int a = state.pop();
		state.push((int)(a / b));
	}

}
