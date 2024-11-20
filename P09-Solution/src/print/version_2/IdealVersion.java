package print.version_2;

import nodes.*;

/*
 * It is not possible to do it: there is no doble-dispatch in Java
 */

public class IdealVersion extends AbstractVisitor {

	 public Object visit(Program program, Object param) throws Exception {
		 for (Statement statement:program.statements)
			 visit(statement, param);
		 return null;
	 }
	 
	 public Object visit(Print print, Object param) throws Exception {
		 System.out.print("print ");
		 visit(print.expr, param);
		 System.out.println(";");
		 return null;
	 }
	 
	 public Object visit(Assignment assign, Object param) throws Exception {
		 visit(assign.variable, param);
		 System.out.print(" = ");
		 visit(assign.expr, param);
		 System.out.println(";");
		 return null;
	 }
	 
	 public Object visit(Read read, Object param) throws Exception {
		 System.out.print("read ");
		 visit(read.var, param);
		 System.out.println(";");
		 return null;
	 }
	 
	 public Object visit(Addition addition, Object param) throws Exception {
		 visit(addition.left, param);
		 System.out.print(" + ");
		 visit(addition.right, param);
		 return null;
	 }
	 
	 public Object visit(Division div, Object param) throws Exception {
		 visit(div.left, param);
		 System.out.print(" / ");
		 visit(div.right, param);
		 return null;
	 }
	 
	 public Object visit(Product prod, Object param) throws Exception {
		 visit(prod.left, param);
		 System.out.print(" ");
		 visit(prod.right, param);
		 return null;
	 }
	 
	 public Object visit(Variable var, Object param) throws Exception {
		 System.out.print(var.name);
		 return null;
	 }
	 
	 public Object visit(IntConstant cte, Object param) throws Exception {
		 System.out.print(cte.value);
		 return null;
	 }
}
