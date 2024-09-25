package vm.instruction;

import vm.VirtualMachine;

import java.util.Scanner;

public class InputInstruction extends BaseInstruction {
	
	private final Scanner terminal = new Scanner(System.in);

	@Override
	protected void executeRegularInstruction(VirtualMachine vm, String[] rawInstruction) {
		System.out.println("Write a number:");
		vm.getStack().push(terminal.nextInt());
	}
	
}
