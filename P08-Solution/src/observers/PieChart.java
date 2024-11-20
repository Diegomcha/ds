package observers;

import survey.Question;
import survey.VoteObserver;

public class PieChart implements VoteObserver {

	@Override
	public void receivedVote(Question survey) {
		double gyv = survey.getYesVotes();
		double gnv = survey.getNoVotes();
		double vydegree = (gyv / (gyv + gnv)) * 360;
		double vndegree = (gnv / (gyv + gnv)) * 360;

		StringBuilder graph = new StringBuilder();
		graph.append("Drawing a Pie Chart-->");
		graph.append(" Yes: " + vydegree);
		graph.append(" No: " + vndegree);
		System.out.println(graph);
	}

}
