package session2;

import session2.loader.ProgramLoader;
import session2.vm.VirtualMachine;

public class Main {

	public static void main(String[] args) {
		new VirtualMachine(ProgramLoader.loadProgram("program.txt")).executeProgram();
	}

}
