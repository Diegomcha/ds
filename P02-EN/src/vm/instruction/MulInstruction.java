package vm.instruction;

import vm.VirtualMachine;
import vm.stack.Stack;

public class MulInstruction extends BaseInstruction {
	
	@Override
	public boolean canExecute(String id) {
		return id.equals("mul");
	}

	@Override
	protected void runInstruction(VirtualMachine vm, String[] rawInstruction) {
		Stack stack = vm.getStack();
		stack.push(stack.pop() * stack.pop());
	}
	
}
