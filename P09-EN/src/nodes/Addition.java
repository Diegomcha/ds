package nodes;

public class Addition implements Expression {
	public Expression left, right;

	public Addition(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
}
