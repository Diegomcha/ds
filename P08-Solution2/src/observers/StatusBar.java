package observers;

import java.util.Iterator;

import survey.Question;
import survey.VoteObserver;

public class StatusBar implements VoteObserver {

	@Override
	public void receivedVote(Question survey) {
		Iterator<String> ops = survey.getOpciones();

		StringBuilder graph = new StringBuilder();
		graph.append("STATUS BAR: Votes: ");

		while (ops.hasNext()) {
			String o = ops.next();
			int nv = survey.getVotes(o);
			graph.append("[" + o + " = " + nv + "] ");
		}

		System.out.println(graph);
	}

}
