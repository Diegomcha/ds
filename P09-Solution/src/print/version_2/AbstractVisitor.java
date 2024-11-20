package print.version_2;

import nodes.*;

public abstract class AbstractVisitor implements IdealVisitor {
	@Override
	public Object visit (Statement s, Object param) throws Exception  {
		if (s instanceof Read)
			return visit ((Read) s, param);
		else if (s instanceof Print)
			return visit ((Print) s, param);
		else if (s instanceof Assignment)
			return visit ((Assignment) s, param);
		else
			throw new Exception();
		
	}
	
	@Override
	public Object visit (Expression e, Object param) throws Exception {
		if (e instanceof Addition)
			return visit ((Addition) e, param);
		else if (e instanceof Product)
			return visit ((Product) e, param);
		else if (e instanceof Division)
			return visit ((Division) e, param);
		else if (e instanceof Variable)
			return visit ((Variable) e, param);
		else if (e instanceof IntConstant)
			return visit ((IntConstant) e, param);
		else
			throw new Exception();
	}

	@Override
	public Object visit(Program program, Object param) throws Exception{
		throw new Exception();
	}
	
	@Override
	public Object visit(Print print, Object param) throws Exception{
		throw new Exception();
	}

	@Override
	public Object visit(Assignment asignment, Object param) throws Exception{
		throw new Exception();
	}

	@Override
	public Object visit(Read read, Object param) throws Exception{
		throw new Exception();
	}

	@Override
	public Object visit(Addition addition, Object param) throws Exception{
		throw new Exception();
	}

	@Override
	public Object visit(Division div, Object param) throws Exception{
		throw new Exception();
	}

	@Override
	public Object visit(Product prod, Object param) throws Exception{
		throw new Exception();
	}

	@Override
	public Object visit(Variable var, Object param) throws Exception{
		throw new Exception();
	}

	@Override
	public Object visit(IntConstant cte, Object param) throws Exception{
		throw new Exception();
	}

}
