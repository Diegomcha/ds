package nodes.statement;

import nodes.expression.Expression;
import visitor.Visitor;

public class Print implements Statement {
	public Expression expr;

	public Print(Expression expr) {
		this.expr = expr;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
