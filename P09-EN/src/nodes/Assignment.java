package nodes;

public class Assignment implements Statement {
	public Variable variable;
	public Expression expr;

	public Assignment(Variable variable, Expression expr) {
		this.variable = variable;
		this.expr = expr;
	}

}
