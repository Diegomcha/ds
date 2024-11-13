package nodes.expression;

import visitor.Visitor;

public class IntConstant implements Expression {
	public String value;

	public IntConstant(String value) {
		this.value = value;
	}
	
	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
