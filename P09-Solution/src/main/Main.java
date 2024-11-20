package main;

import java.util.*;

import nodes.*;
import print.*;
import print.version_1.IdealVersionSimple;
import print.version_2.IdealVersion;
import visitor.*;

public class Main {

	public static void main(String[] args) throws Exception {

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

		// 2. Browse the tree ---------------------------------------------
		System.out.println("\n--- Recursive traversal: all in one method");
		RecursiveBrowser rr = new RecursiveBrowser();
		rr.visit(prog);

		// It does compile
		 System.out.println("\n--- Simple ideal Browse: it does compile");
		 IdealVersionSimple idealSimple = new IdealVersionSimple();
		 idealSimple.visit(prog, null);

			// It does compile
		 System.out.println("\n--- Ideal Browse: it does compile");
		 IdealVersion ideal = new IdealVersion();
		 ideal.visit(prog, null);
		 
		// Make the next work properly:
		System.out.println("\n--- Visitor pattern traversal");
		PrintVisitor print = new PrintVisitor();
		prog.accept(print, null);

		// Execute as an interpreter
		System.out.println("\n--- Execute code from tree");
		InterpreteVisitor interpreter = new InterpreteVisitor();
		prog.accept(interpreter, null);

		// Compile to bytecode
		System.out.println("\n--- Compile to bytecode");
		GenCodeVisitor genCode = new GenCodeVisitor();
		prog.accept(genCode, null);

	}
}
