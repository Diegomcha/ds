package observers;

import survey.Question;
import survey.VoteObserver;

public class Repeater implements VoteObserver {

	public Repeater(int frecuency, VoteObserver otherObserver) {
		this.otherObserver = otherObserver;
		this.counter = this.frecuency = frecuency;
	}

	@Override
	public void receivedVote(Question survey) {
		if (counter == frecuency) {
			otherObserver.receivedVote(survey);
			counter = 1;
		} else
			counter++;
		// System.out.println("Repeater: " + counter + " of " + frequency);
	}

	private int counter;
	private int frecuency;
	private VoteObserver otherObserver;
}

// What design pattern is this?