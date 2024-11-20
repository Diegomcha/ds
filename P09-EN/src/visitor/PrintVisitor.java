package visitor;

import nodes.Program;
import nodes.expression.Addition;
import nodes.expression.Division;
import nodes.expression.IntConstant;
import nodes.expression.Product;
import nodes.expression.Variable;
import nodes.statement.Assignment;
import nodes.statement.Print;
import nodes.statement.Read;
import nodes.statement.Statement;

public class PrintVisitor implements Visitor {

	@Override
	public Object visit(Program program, Object param) {
		for (Statement statement : program.statements)
			statement.accept(this, null);
		return null;
	}

	@Override
	public Object visit(Print print, Object param) {
		System.out.print("print ");
		print.expr.accept(this, null);
		System.out.println(";");
		return null;
	}

	@Override
	public Object visit(Assignment assign, Object param) {
		assign.variable.accept(this, null);
		System.out.print(" = ");
		assign.expr.accept(this, null);
		System.out.println(";");
		return null;
	}

	@Override
	public Object visit(Read read, Object param) {
		System.out.print("read ");
		read.var.accept(this, null);
		System.out.println(";");
		return null;
	}

	@Override
	public Object visit(Addition addition, Object param) {
		// Parenthesis
		boolean parenthesis = param != null && ((int) param) > 0;

		if (parenthesis)
			System.out.print("(");
		addition.left.accept(this, 0);
		System.out.print(" + ");
		addition.right.accept(this, 0);
		if (parenthesis)
			System.out.print(")");
		return null;
	}

	@Override
	public Object visit(Division div, Object param) {
		// Parenthesis
		boolean parenthesis = param != null && ((int) param) == 1;

		if (parenthesis)
			System.out.print("(");
		div.left.accept(this, 1);
		System.out.print(" / ");
		div.right.accept(this, 1);
		if (parenthesis)
			System.out.print(")");
		return null;
	}

	@Override
	public Object visit(Product prod, Object param) {
		prod.left.accept(this, 1);
		System.out.print(" * ");
		prod.right.accept(this, 1);
		return null;
	}

	@Override
	public Object visit(Variable var, Object param) {
		System.out.print(var.name);
		return null;
	}

	@Override
	public Object visit(IntConstant cte, Object param) {
		System.out.print(cte.value);
		return null;
	}

}
