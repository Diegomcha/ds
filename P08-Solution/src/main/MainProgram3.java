package main;

import java.io.IOException;

import observers.Activator;
import observers.Backup;
import observers.BarGraph;
import observers.PieChart;
import observers.StatusBar;
import survey.Question;
import survey.TextUserInterface;

public class MainProgram3 {

	public static void main(String[] args) throws IOException {
		Question survey = new Question("Are you in favor of nuclear energy?");

		BarGraph bg = new BarGraph();
		PieChart pc = new PieChart();
		Backup bu = new Backup();
		StatusBar sb = new StatusBar();
		Activator a3vpc = new Activator(3, pc);

		// New design
		survey.addObserver(bg);
		survey.addObserver(pc);
		survey.addObserver(bu);

		// Program 1
		survey.addObserver(sb);

		// Program 2
		survey.removeObserver(bg);

		/*
		 * Program 3, instead of drawing the pie chart with each vote, it is only drawn
		 * from the third vote onwards (and then drawn with each vote). The status bar
		 * will continue to be shown with each vote.
		 */
		survey.addObserver(a3vpc);

		// -------------------------------------------------------
		// Starting the survey
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(survey);
	}

}
