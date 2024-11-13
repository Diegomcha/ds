package survey.out;

import survey.Question;

public class BarGraphOut implements Output {

	@Override
	public void update(Question question) {
		System.out.println("Here will be drown the Bar Graph.");
		
		StringBuilder sb = new StringBuilder("(");
		for (String choice : question.getChoices())
			sb.append(String.format("%s: %d ", choice, question.getVote(choice)));

		System.out.println(sb.append(")").toString());
	}

}
