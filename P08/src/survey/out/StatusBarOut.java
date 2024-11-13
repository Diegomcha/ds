package survey.out;

import survey.Question;

public class StatusBarOut implements Output {

	@Override
	public void update(Question question) {
		System.out.println(String.format("Number of YES votes = %d. Number of NO votes = %d", question.getYesVotes(),
				question.getNoVotes()));

	}

}
