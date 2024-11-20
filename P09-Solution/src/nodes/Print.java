package nodes;

import visitor.*;

public class Print implements Statement {
    public Expression expr;

    public Print(Expression expr) {
        this.expr = expr;
    }

    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }
}
