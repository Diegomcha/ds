package survey.out;

import survey.Question;

public class BackupOut implements Output {

	@Override
	public void update(Question question) {
		System.out.println("Here will be saved the data on disc/BD.");
		
		StringBuilder sb = new StringBuilder("(");
		for (String choice : question.getChoices())
			sb.append(String.format("%s: %d ", choice, question.getVote(choice)));

		System.out.println(sb.append(")").toString());
	}

}
