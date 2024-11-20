package nodes;

import visitor.*;

public class Addition implements Expression {
	public Expression left, right;

	public Addition(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
