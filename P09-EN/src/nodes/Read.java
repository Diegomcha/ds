package nodes;

public class Read implements Statement {
	public Variable var;

	public Read(Variable var) {
		this.var = var;
	}
}
