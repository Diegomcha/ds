package vm.instruction;

import java.util.Scanner;

import vm.VirtualMachine;

public class InputInstruction extends BaseInstruction {
	
	private final Scanner terminal = new Scanner(System.in);
	
	@Override
	public boolean canExecute(String id) {
		return id.equals("input");
	}

	@Override
	protected void runInstruction(VirtualMachine vm, String[] rawInstruction) {
		System.out.println("Write a number:");
		vm.getStack().push(terminal.nextInt());
	}
	
}
