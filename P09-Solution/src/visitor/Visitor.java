package visitor;

import nodes.*;

public interface Visitor {
	Object visit(Program p, Object param);

	Object visit(Read r, Object param);

	Object visit(Assignment r, Object param);

	Object visit(Print p, Object param);

	Object visit(Variable r, Object param);

	Object visit(IntConstant s, Object param);

	Object visit(Addition s, Object param);

	Object visit(Product s, Object param);

	Object visit(Division s, Object param);
}
