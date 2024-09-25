package vm.instruction;

import vm.VirtualMachine;

public class JmpInstruction implements Instruction {

	@Override
	public void execute(VirtualMachine vm, String[] rawInstruction) {
		vm.setIP(Integer.parseInt(rawInstruction[1]));
	}
	
}
