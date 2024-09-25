package vm.instruction;

import vm.VirtualMachine;

public class PushInstruction extends BaseInstruction {
	
	@Override
	public boolean canExecute(String id) {
		return id.equals("push");
	}

	@Override
	protected void runInstruction(VirtualMachine vm, String[] rawInstruction) {
		vm.getStack().push(Integer.parseInt(rawInstruction[1]));
	}
	
}
