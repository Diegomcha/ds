package survey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Question {

	public Question(String question, String... strings) {
		this.surveyQuestion = question;
		for (String s : strings)
			votes.put(s, 0);
	}

	public String getSurveyQuestion() {
		return surveyQuestion;
	}

	public int getVotes(String s) {
		if (votes.containsKey(s))
			return votes.get(s);
		return -1;
	}

	public void incrementVote(String s) {
		if (votes.containsKey(s))
			votes.put(s, votes.get(s) + 1);
		totVotes++;
		notifyObservers();
	}

	public int getTotVotes() {
		return totVotes;
	}

	public void addObserver(VoteObserver observer) {
		observers.add(observer);
	}

	public void removeObserver(VoteObserver observer) {
		observers.remove(observer);
	}

	public Iterator<String> getOpciones() {
		return votes.keySet().iterator();
	}

	private void notifyObservers() {
		for (VoteObserver voteObserver : observers)
			voteObserver.receivedVote(this);
	}

	private int totVotes = 0;
	private Map<String, Integer> votes = new HashMap<>();
	private String surveyQuestion;
	private List<VoteObserver> observers = new ArrayList<>();
}
