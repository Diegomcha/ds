package main;

import java.io.*;
import java.util.*;

import loader.BasicProgramLoader;
import vm.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BasicProgramLoader loader = new BasicProgramLoader();
		// List<Instruction> program = loader.loadProgram(new FileReader("program.txt"));
		List<Instruction> program = loader.loadProgram(new FileReader("ProgFrom9.txt"));

		VirtualMachine vm = new VirtualMachine(program);
		vm.run();
	}
}
