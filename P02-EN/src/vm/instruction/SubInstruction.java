package vm.instruction;

import vm.VirtualMachine;
import vm.stack.Stack;

public class SubInstruction extends BaseInstruction {

	@Override
	protected void executeRegularInstruction(VirtualMachine vm, String[] rawInstruction) {
		Stack stack = vm.getStack();
		int b = stack.pop();
		int a = stack.pop();
		stack.push(a - b);
	}
	
}
