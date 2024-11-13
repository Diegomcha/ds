package observers;

import java.util.Iterator;

import survey.Question;
import survey.VoteObserver;

public class Backup implements VoteObserver {

	@Override
	public void receivedVote(Question survey) {
		Iterator<String> ops = survey.getOpciones();

		StringBuilder graph = new StringBuilder();
		graph.append("BACKUP: Storing data:\n");

		while (ops.hasNext()) {
			String o = ops.next();
			int nv = survey.getVotes(o);
			graph.append("\t" + o + " = " + nv + "\n");
		}
		graph.append("END BACKUP");
		System.out.println(graph);
	}

}
