package vm.instruction;

import vm.VirtualMachine;
import vm.stack.Stack;

public class StoreInstruction extends BaseInstruction {
	
	@Override
	public boolean canExecute(String id) {
		return id.equals("store");
	}

	@Override
	protected void runInstruction(VirtualMachine vm, String[] rawInstruction) {
		Stack stack = vm.getStack();
		int value = stack.pop();
		int address = stack.pop();
		vm.getMemory()[address] = value;
	}
	
}
