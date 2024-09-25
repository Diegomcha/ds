package vm.instruction;

import vm.VirtualMachine;

public abstract class BaseInstruction implements Instruction {

	@Override
	public void execute(VirtualMachine vm, String[] rawInstruction) {
		this.executeRegularInstruction(vm, rawInstruction);
		vm.setIP(vm.getIP()+1);
	}

	protected abstract void executeRegularInstruction(VirtualMachine vm, String[] rawInstruction);
}
