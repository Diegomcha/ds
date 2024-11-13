package observers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import survey.*;

public class BarGraph implements VoteObserver {

	@Override
	public void receivedVote(Question survey) {
		Iterator<String> ops = survey.getOpciones();
		
		StringBuilder graph = new StringBuilder();
		graph.append("Drawing the Bar Graph\n");
		
		while (ops.hasNext()) {
			String o = ops.next();
			int nv = survey.getVotes(o);
			graph.append("\t" + o + ": ");
			for (int i = 0; i < nv; i++)
				graph.append("X");
			graph.append("\n");
		}
		
		graph.append("\nEnd of Bar Graph.");
		System.out.println(graph);
	}

}
