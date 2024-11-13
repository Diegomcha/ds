package nodes;

import java.util.*;

import nodes.statement.Statement;
import visitor.Visitor;

public class Program implements Node {
    public List<Statement> statements;

    public Program(List<Statement> statements) {
        this.statements = statements;
    }

    @Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
