package vm.instruction;

import vm.VirtualMachine;

public class OutputInstruction extends BaseInstruction {
	
	@Override
	public boolean canExecute(String id) {
		return id.equals("output");
	}

	@Override
	protected void runInstruction(VirtualMachine vm, String[] rawInstruction) {
		System.out.println(vm.getStack().pop());
	}
	
}
