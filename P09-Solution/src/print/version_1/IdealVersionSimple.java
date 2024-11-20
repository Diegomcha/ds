package print.version_1;

import nodes.*;

/*
 * It is not possible to do it: there is no doble-dispatch in Java
 */

public class IdealVersionSimple extends AbstractVisitorSimple {

	 public Object visit(Program program, Object param) {
		 for (Statement statement:program.statements)
			 visit(statement, param);
		 return null;
	 }
	 
	 public Object visit(Print print, Object param) {
		 System.out.print("print ");
		 visit(print.expr, param);
		 System.out.println(";");
		 return null;
	 }
	 
	 public Object visit(Assignment assign, Object param) {
		 visit(assign.variable, param);
		 System.out.print(" = ");
		 visit(assign.expr, param);
		 System.out.println(";");
		 return null;
	 }
	 
	 public Object visit(Read read, Object param) {
		 System.out.print("read ");
		 visit(read.var, param);
		 System.out.println(";");
		 return null;
	 }
	 
	 public Object visit(Addition addition, Object param) {
		 visit(addition.left, param);
		 System.out.print(" + ");
		 visit(addition.right, param);
		 return null;
	 }
	 
	 public Object visit(Division div, Object param) {
		 visit(div.left, param);
		 System.out.print(" / ");
		 visit(div.right, param);
		 return null;
	 }
	 
	 public Object visit(Product prod, Object param) {
		 visit(prod.left, param);
		 System.out.print(" ");
		 visit(prod.right, param);
		 return null;
	 }
	 
	 public Object visit(Variable var, Object param) {
		 System.out.print(var.name);
		 return null;
	 }
	 
	 public Object visit(IntConstant cte, Object param) {
		 System.out.print(cte.value);
		 return null;
	 }
}
