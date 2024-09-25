package vm.instruction;

import vm.VirtualMachine;

public class PushInstruction extends BaseInstruction {

	@Override
	protected void executeRegularInstruction(VirtualMachine vm, String[] rawInstruction) {
		vm.getStack().push(Integer.parseInt(rawInstruction[1]));
	}
	
}
