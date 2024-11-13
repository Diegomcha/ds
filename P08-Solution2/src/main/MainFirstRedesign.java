package main;

import java.io.IOException;

import observers.Backup;
import observers.BarGraph;
import observers.PieChart;
import survey.Question;
import survey.TextUserInterface;

public class MainFirstRedesign {

	public static void main(String[] args) throws IOException {
		Question survey = new Question("Are you in favor of nuclear energy?", "yes", "no");

		BarGraph bg = new BarGraph();
		PieChart pc = new PieChart();
		Backup bu = new Backup();

		/*
		 * New design
		 */
		survey.addObserver(bg);
		survey.addObserver(pc);
		survey.addObserver(bu);

		// -------------------------------------------------------
		// Starting the survey
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.fillSurvey(survey);
	}

}
