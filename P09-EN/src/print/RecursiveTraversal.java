package print;

import nodes.*;
import nodes.expression.Addition;
import nodes.expression.Division;
import nodes.expression.IntConstant;
import nodes.expression.Product;
import nodes.expression.Variable;
import nodes.statement.Assignment;
import nodes.statement.Print;
import nodes.statement.Read;
import nodes.statement.Statement;

/*
 * Inconveniences: All the code for all the Nodes is in one anly method
 */

public class RecursiveTraversal {

	public void visit(Node nodo) {
		if (nodo instanceof Program) {
			for (Statement sent : ((Program) nodo).statements)
				visit(sent);
		} else if (nodo instanceof Print) {
			System.out.print("print ");
			visit(((Print) nodo).expr);
			System.out.println(";");
		} else if (nodo instanceof Read) {
			System.out.print("read ");
			visit(((Read) nodo).var);
			System.out.println(";");
		} else if (nodo instanceof Assignment) {
			visit(((Assignment) nodo).variable);
			System.out.print(" = ");
			visit(((Assignment) nodo).expr);
			System.out.println(";");
		} else if (nodo instanceof IntConstant) {
			System.out.print(((IntConstant) nodo).value);
		} else if (nodo instanceof Product) {
			visit(((Product) nodo).left);
			System.out.print(" * ");
			visit(((Product) nodo).right);
		} else if (nodo instanceof Division) {
			visit(((Division) nodo).left);
			System.out.print(" / ");
			visit(((Division) nodo).right);
		} else if (nodo instanceof Addition) {
			visit(((Addition) nodo).left);
			System.out.print(" + ");
			visit(((Addition) nodo).right);
		} else if (nodo instanceof Variable) {
			System.out.print(((Variable) nodo).name);
		}
	}
}
