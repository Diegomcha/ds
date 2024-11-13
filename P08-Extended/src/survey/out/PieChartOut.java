package survey.out;

import survey.Question;

public class PieChartOut implements Output {

	@Override
	public void update(Question question) {
		System.out.println("Here will be drown the Pie Chart.");

		StringBuilder sb = new StringBuilder("(");
		for (String choice : question.getChoices())
			sb.append(String.format("%s: %d ", choice, question.getVote(choice)));

		System.out.println(sb.append(")").toString());
	}

}
