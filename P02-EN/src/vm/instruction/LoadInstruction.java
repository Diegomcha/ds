package vm.instruction;

import vm.VirtualMachine;
import vm.stack.Stack;

public class LoadInstruction extends BaseInstruction {

	@Override
	protected void executeRegularInstruction(VirtualMachine vm, String[] rawInstruction) {
		Stack stack = vm.getStack();
		int address = stack.pop();
		stack.push(vm.getMemory()[address]);
	}
	
}
