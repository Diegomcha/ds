package vm.instruction;

import vm.VirtualMachine;

public class OutputInstruction extends BaseInstruction {

	@Override
	protected void executeRegularInstruction(VirtualMachine vm, String[] rawInstruction) {
		System.out.println(vm.getStack().pop());
	}
	
}
