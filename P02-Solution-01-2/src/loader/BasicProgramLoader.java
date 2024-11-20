package loader;

import instructions.*;

import java.io.*;
import java.util.*;

import vm.Instruction;

public class BasicProgramLoader {
	public List<Instruction> loadProgram(Reader reader) throws IOException {

		BufferedReader file = new BufferedReader(reader);
		List<Instruction> program = new ArrayList<Instruction>();

		String line;
		while ((line = file.readLine()) != null) {
			if (line.trim().length() > 0)
				program.add(createInstruction(line));
		}
		file.close();
		return program;
	}

	private Instruction createInstruction(String line) {
		String[] word = line.split(" ");

		if (word[0].equals("add"))
			return new Add();
		if (word[0].equals("sub"))
			return new Sub();
		if (word[0].equals("mul"))
			return new Mul();
		if (word[0].equals("div"))
			return new Div();
		if (word[0].equals("load"))
			return new Load();
		if (word[0].equals("store"))
			return new Store();
		if (word[0].equals("input"))
			return new Input();
		if (word[0].equals("output"))
			return new Output();

		int operand = Integer.parseInt(word[1]);

		if (word[0].equals("push"))
			return new Push(operand);
		if (word[0].equals("jmp"))
			return new Jump(operand);
		if (word[0].equals("jmpg"))
			return new JumpGreater(operand);

		throw new IllegalArgumentException();
	}
}
