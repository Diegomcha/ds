package print.version_1;

import nodes.*;

public abstract class AbstractVisitorSimple implements IdealVisitorSimple {


	public Object visit (Statement s, Object param) {
		if (s instanceof Read)
			return visit ((Read) s, param);
		else if (s instanceof Print)
			return visit ((Print) s, param);
		else if (s instanceof Assignment)
			return visit ((Assignment) s, param);
		else
			System.out.println("The statement " + s.getClass().getName() + " is not visited in AbstractVisitorSimple");
		return null;
		
	}
	
	public Object visit (Expression e, Object param) {
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
			System.out.println("The expression " + e.getClass().getName() + " is not visited in AbstractVisitorSimple");
		return null;
	}

}
