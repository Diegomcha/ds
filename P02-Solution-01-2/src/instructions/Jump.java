package instructions;

import vm.*;

public class Jump implements Instruction {
	public Jump(int address) {
		this.address = address;
	}

	@Override
	public void execute(State state) {
		state.setIP(address);
	}

	private int address;
}
