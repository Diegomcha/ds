package vm.instruction;

import vm.VirtualMachine;

public interface Instruction {
	public boolean canExecute(String id);
	public void execute(VirtualMachine vm, String[] rawInstruction);
}
