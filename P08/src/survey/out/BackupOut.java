package survey.out;

import survey.Question;

public class BackupOut implements Output {

	@Override
	public void update(Question question) {
		System.out.println("Here will be saved the data on disc/BD.");
		System.out.println(String.format("(Yes: %d, No: %d)", question.getYesVotes(), question.getNoVotes()));
	}

}
