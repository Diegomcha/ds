package main;

import java.io.IOException;

import observers.Backup;
import observers.BarGraph;
import observers.PieChart;
import observers.StatusBar;
import survey.Question;
import survey.TextUserInterface;

public class MainProgram2 {

	public static void main(String[] args) throws IOException {
		Question survey = new Question("Are you in favor of nuclear energy?");

		BarGraph bg = new BarGraph();
		PieChart pc = new PieChart();
		Backup bu = new Backup();
		StatusBar sb = new StatusBar();

		// New design
		survey.addObserver(bg);
		survey.addObserver(pc);
		survey.addObserver(bu);

		// Program 1
		survey.addObserver(sb);

		/*
		 * Program 2, the bar graph is not to be drawn (but the pie chart and status bar
		 * are to be drawn).
		 */
		survey.removeObserver(bg); // removed by Program 2

		// -------------------------------------------------------
		// Starting the survey
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(survey);
	}

}
