package vm.instruction;

import vm.VirtualMachine;

public interface Instruction {
	void execute(VirtualMachine vm, String[] rawInstruction);
}
