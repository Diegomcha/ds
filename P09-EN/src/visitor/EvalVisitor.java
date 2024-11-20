package visitor;

import java.util.HashMap;
import java.util.Map;

import nodes.Program;
import nodes.expression.Addition;
import nodes.expression.Division;
import nodes.expression.Expression;
import nodes.expression.IntConstant;
import nodes.expression.Product;
import nodes.expression.Variable;
import nodes.statement.Assignment;
import nodes.statement.Print;
import nodes.statement.Read;
import nodes.statement.Statement;

public class EvalVisitor implements Visitor {

	private final Map<String, Expression> variableMap = new HashMap<>();

	@Override
	public Object visit(Program program, Object param) {
		for (Statement statement : program.statements)
			statement.accept(this, null);
		return null;
	}

	@Override
	public Object visit(Print print, Object param) {
		System.out.println(print.expr.accept(this, null));
		return null;
	}

	@Override
	public Object visit(Assignment assign, Object param) {
		variableMap.put(assign.variable.name, assign.expr);
		return null;
	}

	@Override
	public Object visit(Read read, Object param) {
		// Emulate reading from memory
		// - Dynamic
		// String value = Integer.toString(new Random().nextInt());
		// System.err.println(String.format("(Memory: %s = %s)", read.var.name,
		// value));
		// - Static
		String value = "10";

		variableMap.put(read.var.name, new IntConstant(value));
		return null;
	}

	@Override
	public Object visit(Addition addition, Object param) {
		return (int) addition.left.accept(this, null) + (int) addition.right.accept(this, 0);
	}

	@Override
	public Object visit(Division div, Object param) {
		return (int) div.left.accept(this, null) / (int) div.right.accept(this, null);
	}

	@Override
	public Object visit(Product prod, Object param) {
		return (int) prod.left.accept(this, null) * (int) prod.right.accept(this, null);
	}

	@Override
	public Object visit(Variable var, Object param) {
		return variableMap.get(var.name).accept(this, null);
	}

	@Override
	public Object visit(IntConstant cte, Object param) {
		return Integer.parseInt(cte.value);
	}

}
