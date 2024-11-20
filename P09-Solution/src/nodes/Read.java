package nodes;

import visitor.*;

public class Read implements Statement {
    public Variable var;

    public Read(Variable var) {
        this.var = var;
    }

    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }
}
