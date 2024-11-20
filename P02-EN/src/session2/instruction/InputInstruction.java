package session2.instruction;

import java.util.Scanner;

import session2.vm.State;

public class InputInstruction extends AbstractInstruction {

	private final Scanner terminal = new Scanner(System.in);

	@Override
	protected void executeAndAdvance(State state) {
		System.out.println("Write a number:");
		state.getStack().push(terminal.nextInt());
	}

	@Override
	public String getId() {
		return "input";
	}
}
