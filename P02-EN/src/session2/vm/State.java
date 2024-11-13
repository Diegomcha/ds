package session2.vm;

import java.util.Stack;

public class State {
	private final int[] memory = new int[1024];
	private final Stack<Integer> stack = new Stack<>();

	private int ip = 0;

	State() {
	}

	/**
	 * Set the value of the IP
	 *
	 * @param ip The address to set the IP at
	 */
	public void setIP(int ip) {
		this.ip = ip;
	}

	/**
	 * Get the value of the IP
	 *
	 * @return Value of the IP
	 */
	public int getIP() {
		return this.ip;
	}

	/**
	 * Gets a reference to the stack
	 *
	 * @return Reference to the stack
	 */
	public Stack<Integer> getStack() {
		return this.stack;
	}

	/**
	 * Gets a reference to the memory
	 *
	 * @return Reference to the memory
	 */
	public int[] getMemory() {
		return this.memory;
	}
}
