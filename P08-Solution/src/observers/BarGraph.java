package observers;

import survey.Question;
import survey.VoteObserver;

public class BarGraph implements VoteObserver {

	@Override
	public void receivedVote(Question survey) {
		int gyv = survey.getYesVotes();
		int gnv = survey.getNoVotes();

		StringBuilder graph = new StringBuilder();
		graph.append("Drawing the Bar Graph\n");

		graph.append("YES: ");
		while (gyv > 0) {
			graph.append("X");
			gyv--;
		}
		graph.append("\nNO : ");
		while (gnv > 0) {
			graph.append("X");
			gnv--;
		}
		graph.append("\nEnd of Bar Graph.");
		System.out.println(graph);
	}

}
