package main;

import java.io.IOException;

import observers.Backup;
import observers.BarGraph;
import observers.PieChart;
import observers.StatusBar;
import survey.Question;
import survey.TextUserInterface;

public class MainProgram1 {

	public static void main(String[] args) throws IOException {
		Question survey = new Question("Are you in favor of nuclear energy?", "yes", "no");

		BarGraph bg = new BarGraph();
		PieChart pc = new PieChart();
		Backup bu = new Backup();
		StatusBar sb = new StatusBar();

		// New design
		survey.addObserver(bg);
		survey.addObserver(pc);
		survey.addObserver(bu);

		/*
		 * Program 1, when a vote is received, a status bar is also to be drawn. A
		 * status bar is a line of text that indicates the number of votes for each
		 * option (“Number of YES votes = <x>. Number of NO votes = <y>”).
		 */
		survey.addObserver(sb);

		// -------------------------------------------------------
		// Starting the survey
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.fillSurvey(survey);
	}

}
