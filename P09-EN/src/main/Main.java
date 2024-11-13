package main;

import java.util.*;

import nodes.*;
import print.*;
import visitor.PrintVisitor;

public class Main {

	public static void main(String[] args) {

		// 1. Build the tree ---------------------------------------------

		/*
		 * read width;
		 * read length;
		 * area = length * width / 2;
		 * print area + 10;
		 */

		List<Statement> statements = new ArrayList<>();

		// read width;
		statements.add(new Read(new Variable("width")));

		// read length;
		statements.add(new Read(new Variable("length")));

		// area = length * width / 2;
		Product prod = new Product(new Variable("length"), new Variable("width"));
		statements.add(new Assignment(new Variable("area"), new Division(prod, new IntConstant("2"))));

		// print area + 10;
		statements.add(new Print(new Addition(new Variable("area"), new IntConstant("10"))));

		// create the root node
		Program prog = new Program(statements);

		// 2. Traverse the tree ---------------------------------------------
		System.out.println("\n--- Recursive traversal: all in one method");
		RecursiveTraversal rr = new RecursiveTraversal();
		rr.visit(prog);

		// Do not compile
		System.out.println("\n--- Ideal traversal: it does not compile");
		IdealVersion ideal = new IdealVersion();
		// ideal.visit(prog);

		// Nake the next work properly:
		System.out.println("\n--- Visitor pattern traversal: not made");
		PrintVisitor print = new PrintVisitor();
		// prog.accept(print, null);

	}
}
