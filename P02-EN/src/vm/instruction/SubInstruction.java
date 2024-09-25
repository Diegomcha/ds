package vm.instruction;

import vm.VirtualMachine;
import vm.stack.Stack;

public class SubInstruction extends BaseInstruction {
	
	@Override
	public boolean canExecute(String id) {
		return id.equals("sub");
	}

	@Override
	protected void runInstruction(VirtualMachine vm, String[] rawInstruction) {
		Stack stack = vm.getStack();
		int b = stack.pop();
		int a = stack.pop();
		stack.push(a - b);
	}
	
}
