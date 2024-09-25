package main;
import java.io.*;
import java.util.*;

public class Main {

	private static List<String[]> instructions = new ArrayList<String[]>();
	private static int ip = 0;

	private static int[] memory = new int[1024];

	private static int[] stack = new int[32];
	private static int sp = 0;

	private static Scanner terminal = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		BufferedReader file = new BufferedReader(new FileReader("program.txt"));

		String line;
		while ((line = file.readLine()) != null)
			instructionsLoader(line);
		file.close();

		executeProgram();
	}

	private static void instructionsLoader(String line) {
		if (line.trim().length() == 0)
			return;

		String[] words = line.split(" ");
		instructions.add(words);
	}

	private static void push(int value) {
		stack[sp] = value;
		sp++;
	}

	private static int pop() {
		sp--;
		return stack[sp];
	}

	private static void executeProgram() {
		while (ip < instructions.size()) {
			String[] instruction = instructions.get(ip);

			if (instruction[0].equals("push")) {
				push(Integer.parseInt(instruction[1]));
				ip++;
			} else if (instruction[0].equals("add")) {
				push(pop() + pop());
				ip++;
			} else if (instruction[0].equals("sub")) {
				int b = pop();
				int a = pop();
				push(a - b);
				ip++;
			} else if (instruction[0].equals("mul")) {
				push(pop() * pop());
				ip++;
			} else if (instruction[0].equals("jmp")) {
				ip = Integer.parseInt(instruction[1]);
			} else if (instruction[0].equals("jmpg")) {
				int b = pop();
				int a = pop();
				if (a > b)
					ip = Integer.parseInt(instruction[1]);
				else
					ip++;
			} else if (instruction[0].equals("load")) {
				int address = pop();
				push(memory[address]);
				ip++;
			} else if (instruction[0].equals("store")) {
				int value = pop();
				int address = pop();
				memory[address] = value;
				ip++;
			} else if (instruction[0].equals("input")) {
				System.out.println("Write a number:");
				push(terminal.nextInt());
				ip++;
			} else if (instruction[0].equals("output")) {
				System.out.println(pop());
				ip++;
			}
		}
	}
}
