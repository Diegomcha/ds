package main;

import java.io.*;

import observers.*;
import survey.*;

public class MainProgram4 {

	public static void main(String[] args) throws IOException {
		Question survey = new Question("Are you in favor of nuclear energy?", "yes", "no");

		BarGraph bg = new BarGraph();
		PieChart pc = new PieChart();
		Backup bu = new Backup();
		StatusBar sb = new StatusBar();
		Activator a3vpc = new Activator(3, pc);
		Repeater r3vbg = new Repeater(3, bg);
		
		//New design
		survey.addObserver(bg);
		survey.addObserver(pc);
		survey.addObserver(bu);

		// Program 1
		survey.addObserver(sb);

		// Program 2
		survey.removeObserver(bg);

		// Program 3
		survey.addObserver(a3vpc);

		/*
		 * Program 4, the bar graph is to be displayed again, but now it will
		 * only be drawn every 3 votes (i.e. with the first, fourth, seventh, etc.
		 * votes). The other graphs will continue to be drawn as indicated in the
		 * previous point.
		 */
		survey.addObserver(r3vbg);

		// -------------------------------------------------------
		// Starting the survey
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.fillSurvey(survey);
	}

}
