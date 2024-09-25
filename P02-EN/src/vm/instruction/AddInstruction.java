package vm.instruction;

import vm.VirtualMachine;
import vm.stack.Stack;

public class AddInstruction extends BaseInstruction {

	@Override
	protected void executeRegularInstruction(VirtualMachine vm, String[] rawInstruction) {
		Stack stack = vm.getStack();
		stack.push(stack.pop() + stack.pop());
	}
	
}
