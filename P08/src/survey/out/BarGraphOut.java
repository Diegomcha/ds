package survey.out;

import survey.Question;

public class BarGraphOut implements Output {

	@Override
	public void update(Question question) {
		System.out.println("Here will be drown the Bar Graph.");
		System.out.println(String.format("(Yes: %d, No: %d)", question.getYesVotes(), question.getNoVotes()));
	}

}
