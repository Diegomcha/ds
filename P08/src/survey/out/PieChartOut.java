package survey.out;

import survey.Question;

public class PieChartOut implements Output {

	@Override
	public void update(Question question) {
		System.out.println("Here will be drown the Pie Chart.");
		System.out.println(String.format("(Yes: %d, No: %d)", question.getYesVotes(), question.getNoVotes()));
	}

}
