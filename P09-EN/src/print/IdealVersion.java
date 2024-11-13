package print;

/*
 * It does not work: there is not multiple-dispatch in Java
 */

public class IdealVersion {
	/*
	 * public void visit(Program program) {
	 * for (Statement statement:program.statements)
	 * visit(statement);
	 * }
	 * 
	 * public void visit(Print print) {
	 * System.out.print("print ");
	 * visit(print.expr);
	 * System.out.println(";");
	 * }
	 * 
	 * public void visit(Assignment assign) {
	 * visit(assign.variable);
	 * System.out.print(" = ");
	 * visit(assign.expr);
	 * System.out.println(";");
	 * }
	 * 
	 * public void visit(Read read) {
	 * System.out.print("read ");
	 * visit(read.var);
	 * System.out.println(";");
	 * }
	 * 
	 * public void visit(Addition addition) {
	 * visit(addition.left);
	 * System.out.print(" + ");
	 * visit(addition.right);
	 * }
	 * 
	 * public void visit(Division div) {
	 * visit(div.left);
	 * System.out.print(" / ");
	 * visit(div.right);
	 * }
	 * 
	 * public void visit(Product prod) {
	 * visit(prod.left);
	 * System.out.print(" * ");
	 * visit(prod.right);
	 * }
	 * 
	 * public void visit(Variable var) {
	 * System.out.print(var.name);
	 * }
	 * 
	 * public void visit(IntConstant cte) {
	 * System.out.print(cte.value);
	 * }
	 */
}
