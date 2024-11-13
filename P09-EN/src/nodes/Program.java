package nodes;

import java.util.*;

public class Program implements Node {
    public List<Statement> statements;

    public Program(List<Statement> statements) {
        this.statements = statements;
    }
}
