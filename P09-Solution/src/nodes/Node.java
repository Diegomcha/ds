package nodes;

import visitor.*;

public interface Node {
	Object accept(Visitor v, Object param);
}
