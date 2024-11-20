package survey.out;

import survey.Question;

public class StatusBarOut implements Output {

	@Override
	public void update(Question question) {
		StringBuilder sb = new StringBuilder();
		for (String choice : question.getChoices())
			sb.append(String.format("Number of %s votes: %d ", choice, question.getVote(choice)));

		System.out.println(sb.toString());
	}

}
