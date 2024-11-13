package nodes.expression;

import visitor.Visitor;

public class Addition implements Expression {
	public Expression left, right;

	public Addition(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
