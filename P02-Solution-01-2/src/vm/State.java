package vm;

// Version wihtout errors management

public class State {

	public int getIP() {
		return ip;
	}

	public void setIP(int ip) {
		this.ip = ip;
	}

	public void push(int value) {
		stack[sp++] = value;
	}

	public int pop() {
		return stack[--sp];
	}
	
	public int read(int direccion) {
		return memory[direccion];
	}
	
	public void write(int direccion, int valor) {
		memory[direccion] = valor;
	}

	private int[] memory = new int[1024];
	private int[] stack = new int[32];

	private int ip = 0, sp = 0;
}
