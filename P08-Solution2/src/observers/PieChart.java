package observers;

import java.util.Iterator;

import survey.*;

public class PieChart implements VoteObserver {

	@Override
	public void receivedVote(Question survey) {
		Iterator<String> ops = survey.getOpciones();
		
		int totv = survey.getTotVotes();
		
		StringBuilder graph = new StringBuilder();
		graph.append("Drawing a Pie Chart-->");
		
		while (ops.hasNext()) {
			String o;
			double vsdegree=(survey.getVotes(o = ops.next())/((double) totv))*360.0;
			graph.append(" " + o + ": " + vsdegree);
		}
		
		System.out.println(graph);
	}

}
