package nodes;

import java.util.*;

import visitor.*;

public class Program implements Node {
    public List<Statement> statements;

    public Program(List<Statement> statements) {
        this.statements = statements;
    }

    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }
}
