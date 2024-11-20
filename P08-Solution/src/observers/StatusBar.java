package observers;

import survey.Question;
import survey.VoteObserver;

public class StatusBar implements VoteObserver {

	@Override
	public void receivedVote(Question survey) {
		StringBuilder graph = new StringBuilder();
		graph.append("STATUS BAR: Votes: ");
		graph.append("[Yes = " + survey.getYesVotes() + "]");
		graph.append(" [No = " + survey.getNoVotes() + "]");
		System.out.println(graph);
	}

}
