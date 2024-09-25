package vm.instruction;

import vm.VirtualMachine;
import vm.stack.Stack;

public class StoreInstruction extends BaseInstruction {

	@Override
	protected void executeRegularInstruction(VirtualMachine vm, String[] rawInstruction) {
		Stack stack = vm.getStack();
		int value = stack.pop();
		int address = stack.pop();
		vm.getMemory()[address] = value;
	}
	
}
