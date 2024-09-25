package vm.stack;

public class Stack {
	
	private final int[] stack;
	private int sp = 0;
	
	public Stack(int size) {
		this.stack = new int[size];
	}
	
	public void push(int value) {
		this.stack[sp] = value;
		sp++;
	}

	public int pop() {
		sp--;
		return stack[sp];
	}
}
