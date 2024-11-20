package visitor;

import java.io.*;
import java.util.*;

import nodes.*;

public class InterpreteVisitor implements Visitor {
	public Object visit(Program programa, Object param) {
		for (Statement sentencia : programa.statements)
			sentencia.accept(this, null);
		return null;
	}

	public Object visit(Read read, Object param) {
		int valor;
		System.out.print("Insert a value for the variable " + read.var.name + ": ");
		try {
			valor = Integer.parseInt(consola.readLine());
		} catch (Exception e) {
			valor = 0;
		}
		memory.put(read.var.name, valor);
		return null;
	}

	public Object visit(Assignment asigna, Object param) {
		String nombreVariable = (String) asigna.variable.accept(this, "izq");
		int valor = (Integer) asigna.expr.accept(this, null);
		memory.put(nombreVariable, valor);
		return null;
	}

	public Object visit(Print print, Object param) {
		System.out.println(print.expr.accept(this, null));
		return null;
	}

	public Object visit(IntConstant cte, Object param) {
		return Integer.parseInt(cte.value);
	}

	public Object visit(Variable variable, Object param) {
		if (param == "izq") {
			return variable.name;
		} else {
			Integer valor = memory.get(variable.name);
			if (valor == null)
				valor = 0;
			return valor;
		}
	}

	public Object visit(Addition suma, Object param) {
		return (Integer) suma.left.accept(this, null) + (Integer) suma.right.accept(this, null);
	}

	public Object visit(Product prod, Object param) {
		return (Integer) prod.left.accept(this, null) * (Integer) prod.right.accept(this, null);
	}

	public Object visit(Division div, Object param) {
		return (Integer) div.left.accept(this, null) / (Integer) div.right.accept(this, null);
	}

	private BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
	private Map<String, Integer> memory = new HashMap<>();

}
