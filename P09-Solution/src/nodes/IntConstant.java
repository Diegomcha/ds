package nodes;

import visitor.*;

public class IntConstant implements Expression {
	public String value;

	public IntConstant(String value) {
		this.value = value;
	}

	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
