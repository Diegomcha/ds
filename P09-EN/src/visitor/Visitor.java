package visitor;

import nodes.Program;
import nodes.expression.Addition;
import nodes.expression.Division;
import nodes.expression.IntConstant;
import nodes.expression.Product;
import nodes.expression.Variable;
import nodes.statement.Assignment;
import nodes.statement.Print;
import nodes.statement.Read;

public interface Visitor {
	// Nodes
	Object visit(Program p, Object param);
	
	// Expressions
	Object visit(Addition a, Object param);
	Object visit(Division d, Object param);
	Object visit(IntConstant i, Object param);
	Object visit(Product p, Object param);
	Object visit(Variable v, Object param);
	
	// Statements
	Object visit(Assignment a, Object param);
	Object visit(Print p, Object param);
	Object visit(Read r, Object param);
}
