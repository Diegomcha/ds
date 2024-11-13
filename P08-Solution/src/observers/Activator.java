package observers;

import survey.*;

public class Activator implements VoteObserver {

	public Activator(int countDown, VoteObserver otherObserver) {
		this.otherObserver = otherObserver;
		this.countDown = countDown;
	}

	@Override
	public void receivedVote(Question survey) {
		if (countDown == 1) {
			otherObserver.receivedVote(survey);
		} else
			countDown--;
	}

	private int countDown;
	private VoteObserver otherObserver;
	// System.out.println("Activator: " + countDown);
}

// What design pattern is this?