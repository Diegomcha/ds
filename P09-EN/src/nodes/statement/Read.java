package nodes.statement;

import nodes.expression.Variable;
import visitor.Visitor;

public class Read implements Statement {
	public Variable var;

	public Read(Variable var) {
		this.var = var;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
