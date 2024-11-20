package nodes;

import visitor.*;

public class Variable implements Expression {
    public String name;

    public Variable(String name) {
        this.name = name;
    }

    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }
}
