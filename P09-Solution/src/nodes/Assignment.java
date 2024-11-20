package nodes;

import visitor.*;

public class Assignment implements Statement {
	public Variable variable;
	public Expression expr;

	public Assignment(Variable variable, Expression expr) {
		this.variable = variable;
		this.expr = expr;
	}

	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
