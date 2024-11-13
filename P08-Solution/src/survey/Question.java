package survey;

import java.util.*;

public class Question {

	public Question(String question) {
		this.surveyQuestion = question;
	}

	public String getSurveyQuestion() {
		return surveyQuestion;
	}

	public int getYesVotes() {
		return yes;
	}

	public int getNoVotes() {
		return no;
	}

	public void addObserver(VoteObserver observer) {
		observers.add(observer);
	}

	public void removeObserver(VoteObserver observer) {
		observers.remove(observer);
	}

	public void incrementYes() {
		yes++;
		notifyObservers();
	}

	public void incrementNo() {
		no++;
		notifyObservers();
	}

	private void notifyObservers() {
		for (VoteObserver voteObserver : observers)
			voteObserver.receivedVote(this);
	}

	private int yes;
	private int no;
	private String surveyQuestion;
	private List<VoteObserver> observers = new ArrayList<>();
}
