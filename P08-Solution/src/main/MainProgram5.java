package main;

import java.io.IOException;

import observers.Activator;
import observers.Backup;
import observers.BarGraph;
import observers.PieChart;
import observers.Repeater;
import observers.StatusBar;
import survey.Question;
import survey.TextUserInterface;

public class MainProgram5 {

	public static void main(String[] args) throws IOException {
		Question survey = new Question("Are you in favor of nuclear energy?");

		BarGraph bg = new BarGraph();
		PieChart pc = new PieChart();
		Backup bu = new Backup();
		StatusBar sb = new StatusBar();
		Activator a3vpc = new Activator(3, pc);
		Repeater r3vbg = new Repeater(3, bg);

		// New design
		survey.addObserver(bg);
		survey.addObserver(pc);
		survey.addObserver(bu);

		// Program 1
		survey.addObserver(sb);

		// Program 2
		survey.removeObserver(bg);

		// Program 3
		survey.addObserver(a3vpc);

		// Program 4
		survey.addObserver(r3vbg);

		/*
		 * Program 5, the status bar is to start printing from the fourth vote and from
		 * then on it will only be displayed every two votes (it will be printed on the
		 * fourth, sixth, eighth, etc. vote). The other graphics will continue to be
		 * drawn as indicated in the previous point.
		 */
		survey.addObserver(new Activator(4, new Repeater(2, sb)));

		// -------------------------------------------------------
		// Starting the survey
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(survey);
	}

}
