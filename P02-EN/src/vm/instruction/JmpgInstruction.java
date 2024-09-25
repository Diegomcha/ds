package vm.instruction;

import vm.VirtualMachine;
import vm.stack.Stack;

public class JmpgInstruction implements Instruction {

	@Override
	public void execute(VirtualMachine vm, String[] rawInstruction) {
		Stack stack = vm.getStack();
		int b = stack.pop();
		int a = stack.pop();
		if (a > b)
			vm.setIP(Integer.parseInt(rawInstruction[1]));
		else
			vm.setIP(vm.getIP() + 1);
	}

}
