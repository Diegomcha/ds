package nodes;

public class Print implements Statement {
	public Expression expr;

	public Print(Expression expr) {
		this.expr = expr;
	}

}
