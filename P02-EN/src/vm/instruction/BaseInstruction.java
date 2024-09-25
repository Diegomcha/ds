package vm.instruction;

import vm.VirtualMachine;

public abstract class BaseInstruction implements Instruction {

	@Override
	public void execute(VirtualMachine vm, String[] rawInstruction) {
		this.runInstruction(vm, rawInstruction);
		vm.setIP(vm.getIP()+1);
	}
	
	protected abstract void runInstruction(VirtualMachine vm, String[] rawInstruction);
}
