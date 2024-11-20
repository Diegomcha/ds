package visitor;

import java.util.HashMap;
import java.util.Map;

import nodes.*;

public class GenCodeVisitor implements Visitor {
	public Object visit(Program programa, Object param) {
		for (Statement sentencia : programa.statements)
			sentencia.accept(this, null);
		return null;
	}

	public Object visit(Read read, Object param) {
		read.var.accept(this, "Izq");
		System.out.println("input\nstore");
		return null;
	}

	public Object visit(Assignment asigna, Object param) {
		asigna.variable.accept(this, "Izq");
		asigna.expr.accept(this, null);
		System.out.println("store");
		return null;
	}

	public Object visit(Print print, Object param) {
		print.expr.accept(this, null);
		System.out.println("output");
		return null;
	}

	public Object visit(IntConstant cte, Object param) {
		System.out.println("push " + cte.value);
		return null;
	}

	public Object visit(Variable refVar, Object param) {
		// To test if the variable already exists in the TS. 
		// Otherwise insert it in the TS
		if (!ts.containsKey(refVar.name)) {
			ts.put(refVar.name, address++);
		}
		System.out.println("push " + ts.get(refVar.name));
		if (param != "Izq")
			System.out.println("load");
		return null;
	}

	public Object visit(Addition suma, Object param) {
		suma.left.accept(this, null);
		suma.right.accept(this, null);
		System.out.println("add");
		return null;
	}

	public Object visit(Product prod, Object param) {
		prod.left.accept(this, null);
		prod.right.accept(this, null);
		System.out.println("mul");
		return null;
	}

	public Object visit(Division div, Object param) {
		div.left.accept(this, null);
		div.right.accept(this, null);
		System.out.println("div");
		return null;
	}
	
	private Map<String, Integer> ts = new HashMap<>();
	private int address = 0;
}
