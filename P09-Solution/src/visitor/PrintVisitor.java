package visitor;

import nodes.*;

public class PrintVisitor implements Visitor {
	public Object visit(Program programa, Object param) {
		for (Statement sentencia : programa.statements)
			sentencia.accept(this, null);
		return null;
	}

	public Object visit(Read read, Object param) {
		System.out.print("read ");
		read.var.accept(this, null);
		System.out.println(";");
		return null;
	}

	public Object visit(Assignment asigna, Object param) {
		asigna.variable.accept(this, null);
		System.out.print(" = ");
		asigna.expr.accept(this, null);
		System.out.println(";");
		return null;
	}

	public Object visit(Print print, Object param) {
		System.out.print("print ");
		print.expr.accept(this, null);
		System.out.println(";");
		return null;
	}

	public Object visit(IntConstant cte, Object param) {
		System.out.print(cte.value);
		return null;
	}

	public Object visit(Variable refVar, Object param) {
		System.out.print(refVar.name);
		return null;
	}

	public Object visit(Addition suma, Object param) {
		System.out.print("(");
		suma.left.accept(this, null);
		System.out.print(" + ");
		suma.right.accept(this, null);
		System.out.print(")");
		return null;
	}

	public Object visit(Product prod, Object param) {
		System.out.print("(");
		prod.left.accept(this, null);
		System.out.print(" * ");
		prod.right.accept(this, null);
		System.out.print(")");
		return null;
	}

	public Object visit(Division div, Object param) {
		System.out.print("(");
		div.left.accept(this, null);
		System.out.print(" / ");
		div.right.accept(this, null);
		System.out.print(")");
		return null;
	}
}
