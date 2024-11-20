package nodes;

import visitor.*;

public class Product implements Expression {
	public Expression left, right;

	public Product(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
