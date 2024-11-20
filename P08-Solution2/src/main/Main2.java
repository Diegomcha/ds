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

public class Main2 {
	static BarGraph bg = new BarGraph();
	static PieChart pc = new PieChart();
	static Backup bu = new Backup();
	static StatusBar sb = new StatusBar();
	static Activator a3vpc = new Activator(3, pc); // The pie chart will be drawn from the third vote
	static Repeater r3vbg = new Repeater(3, bg); // The bar graph is displayed again, but now it will only be drawn
													// every 3 votes (i.e. with the first, fourth, seventh, etc. votes)

	public static void main(String[] args) throws IOException {
		Question survey = new Question("Whay party are you going to vote in the next elections?", "pp", "psoe", "vox",
				"sumar");

		Program0(survey);
		Program1(survey);
		Program2(survey);
		Program3(survey);
		Program4(survey);
		Program5(survey);

		// -------------------------------------------------------
		// Starting the survey
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.fillSurvey(survey);
	}

	/**
	 *
	 * Program 1, when a vote is received, a status bar is also to be drawn. A
	 * status bar is a line of text that indicates the number of votes for each
	 * option (“Number of YES votes = <x>. Number of NO votes = <y>”).
	 * 
	 * @param survey It is the question
	 */
	private static void Program0(Question survey) {
		survey.addObserver(bg);
		survey.addObserver(pc);
		survey.addObserver(bu);
	}

	/**
	 * Programa 1. Hacer una nueva versión del programa que al recibir un voto
	 * también se dibuje una línea de estado. Una línea de estado es una línea de
	 * texto que indica el estado actual de la votación (nº de votos SI = <x>. nº de
	 * votos NO = <y>).
	 * 
	 * @param survey It is the question
	 */
	private static void Program1(Question survey) {

//		survey.addObserver(bg);
//		survey.addObserver(pc);
//		survey.addObserver(bu);
		survey.addObserver(sb); // Added to the previous case
	}

	/**
	 * Program 2, the bar graph is not to be drawn (but the pie chart and status bar
	 * are to be drawn).
	 * 
	 * @param survey It is the question
	 */
	private static void Program2(Question survey) {
// 		survey.addObserver(bg); // It is only necessary to remove this observer
		survey.removeObserver(bg);
//		survey.addObserver(pc);
//		survey.addObserver(bu);
//		survey.addObserver(sb);
	}

	/**
	 * Program 3, instead of drawing the pie chart with each vote, it is only drawn
	 * from the third vote onwards (and then drawn with each vote). The status bar
	 * will continue to be shown with each vote.
	 * 
	 * @param survey It is the question
	 */
	private static void Program3(Question survey) {
		survey.removeObserver(pc);
		survey.addObserver(a3vpc);
//		survey.addObserver(bu);
//		survey.addObserver(sb);
	}

	/**
	 * Program 4, the bar graph is to be displayed again, but now it will only be
	 * drawn every 3 votes (i.e. with the first, fourth, seventh, etc. votes). The
	 * other graphs will continue to be drawn as indicated in the previous point.
	 * 
	 * @param survey It is the question
	 */
	private static void Program4(Question survey) {
//		survey.addObserver(a3vpc);
//		survey.addObserver(bu);
//		survey.addObserver(sb);
		survey.addObserver(r3vbg);
	}

	/**
	 * Program 5, the status bar is to start printing from the fourth vote and from
	 * then on it will only be displayed every two votes (it will be printed on the
	 * fourth, sixth, eighth, etc. vote). The other graphics will continue to be
	 * drawn as indicated in the previous point.
	 * 
	 * @param survey It is the question
	 */
	private static void Program5(Question survey) {
//		survey.addObserver(r3vbg);
//		survey.addObserver(a3vpc);
//		survey.addObserver(bu);
		survey.removeObserver(sb);
		survey.addObserver(new Activator(4, new Repeater(2, sb)));
	}

}
