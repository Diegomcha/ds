package survey;

public class Question {

	private int yes;
	private int no;
	private String surveyQuestion;

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

	public void incrementYes() {
		yes++;
		updatePieChart();
		updateBarGraph();
		makeBackup();
	}

	public void incrementNo() {
		no++;
		updatePieChart();
		updateBarGraph();
		makeBackup();
	}

	// Simulation of data presentation
	private void updatePieChart() {
		System.out.println("Here will be drown the Pie Chart.");
	}

	private void updateBarGraph() {
		System.out.println("Here will be drown the Bar Graph.");
	}

	private void makeBackup() {
		System.out.println("Here will be saved the data on disc/BD.");
	}

}
