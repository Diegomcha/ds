package nodes;

import visitor.*;

public class Division implements Expression {
	public Expression left, right;

	public Division(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
