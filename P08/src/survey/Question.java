package survey;

import java.util.ArrayList;
import java.util.List;

import survey.out.Output;

public class Question {

	private int yes = 0;
	private int no = 0;

	private final String surveyQuestion;
	private final List<Output> outs = new ArrayList<>();

	public Question(String surveyQuestion) {
		this.surveyQuestion = surveyQuestion;
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

	public void addOutput(Output out) {
		this.outs.add(out);
	}

	public void removeOutput(Output out) {
		this.outs.remove(out);
	}

	public void incrementYes() {
		yes++;
		updateData();
	}

	public void incrementNo() {
		no++;
		updateData();
	}

	private void updateData() {
		for (Output out : outs)
			out.update(this);
	}

}
