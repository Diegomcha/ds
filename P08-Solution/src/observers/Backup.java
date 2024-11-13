package observers;

import survey.*;

public class Backup implements VoteObserver {

	@Override
	public void receivedVote(Question survey) {

		int gyv=survey.getYesVotes();
		int gnv=survey.getNoVotes();
		
		StringBuilder graph = new StringBuilder();
		graph.append("BACKUP: Storing data:\n");
		graph.append("\tYes = " + gyv +  "\n");
		graph.append("\tNo = " + gnv +  "\n");
		graph.append("END BACKUP");
		System.out.println(graph);
	}

}
