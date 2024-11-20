package print.version_2;

import nodes.*;

public interface IdealVisitor {
	Object visit (Statement s, Object param) throws Exception;
	
	Object visit (Expression e, Object param) throws Exception;
	
	Object visit(Program p, Object param) throws Exception;

	Object visit(Read r, Object param) throws Exception;

	Object visit(Assignment r, Object param) throws Exception;

	Object visit(Print p, Object param)throws Exception;

	Object visit(Variable r, Object param) throws Exception;

	Object visit(IntConstant s, Object param) throws Exception;

	Object visit(Addition s, Object param) throws Exception;

	Object visit(Product s, Object param) throws Exception;

	Object visit(Division s, Object param) throws Exception;
}
