package survey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import survey.out.Output;

public class Question {

	private final String surveyQuestion;
	private final List<Output> outs = new ArrayList<>();
	private final Map<String, Integer> choices = new HashMap<>();

	public Question(String surveyQuestion, Set<String> choices) {
		this.surveyQuestion = surveyQuestion;
		this.setChoices(choices);
	}

	private void setChoices(Set<String> choices) {
		for (String choice : choices)
			this.choices.put(choice, 0);
	}

	public String getSurveyQuestion() {
		return surveyQuestion;
	}

	public Set<String> getChoices() {
		return choices.keySet();
	}

	public void incrementVote(String key) {
		choices.put(key, choices.get(key) + 1);
		updateData();
	}

	public int getVote(String key) {
		return choices.get(key);
	}

	public void addOutput(Output out) {
		this.outs.add(out);
	}

	public void removeOutput(Output out) {
		this.outs.remove(out);
	}

	private void updateData() {
		for (Output out : outs)
			out.update(this);
	}

}
