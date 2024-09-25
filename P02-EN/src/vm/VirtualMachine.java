package vm;

import java.util.List;
import java.util.Map;

import vm.instruction.Instruction;
import vm.stack.Stack;

public class VirtualMachine {

	private final Map<String, Instruction> supportedInstructions;
	private final int[] memory = new int[1024];
	private final Stack stack = new Stack(32);

	private final List<String[]> program;
	private int ip = 0;

	public VirtualMachine(List<String[]> program, Map<String, Instruction> supportedInstruction) {
		this.program = program;
		this.supportedInstructions = supportedInstruction;
	}

	public void executeProgram() {
		while (ip < program.size()) {
			String[] rawInstruction = this.program.get(ip);
			this.supportedInstructions.get(rawInstruction[0]).execute(this, rawInstruction);
		}
	}
	
	public int[] getMemory() {
		return this.memory;
	}
	
	public Stack getStack() {
		return this.stack;
	}
	
	public void setIP(int ip) {
		this.ip = ip;
	}
	
	public int getIP() {
		return this.ip;
	}
}
