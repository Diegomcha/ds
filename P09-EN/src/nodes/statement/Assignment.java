package nodes.statement;

import nodes.expression.Expression;
import nodes.expression.Variable;
import visitor.Visitor;

public class Assignment implements Statement {
	public Variable variable;
	public Expression expr;

	public Assignment(Variable variable, Expression expr) {
		this.variable = variable;
		this.expr = expr;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
