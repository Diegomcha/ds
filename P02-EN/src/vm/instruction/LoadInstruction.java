package vm.instruction;

import vm.VirtualMachine;
import vm.stack.Stack;

public class LoadInstruction extends BaseInstruction {
	
	@Override
	public boolean canExecute(String id) {
		return id.equals("load");
	}

	@Override
	protected void runInstruction(VirtualMachine vm, String[] rawInstruction) {
		Stack stack = vm.getStack();
		int address = stack.pop();
		stack.push(vm.getMemory()[address]);
	}
	
}
