package main;

import java.io.IOException;
import java.util.Set;

import survey.Question;
import survey.TextUserInterface;
import survey.out.BackupOut;
import survey.out.BarGraphOut;
import survey.out.Output;
import survey.out.PieChartOut;
import survey.out.StatusBarOut;
import survey.out.filter.DelayFilter;
import survey.out.filter.PeriodicFilter;

public class Main {

	private static final Output pieChart = new PieChartOut();
	private static final Output barGraph = new BarGraphOut();
	private static final Output backup = new BackupOut();
	private static final Output statusBar = new StatusBarOut();
	private static final Output delayPieChart = new DelayFilter(3, pieChart);
	private static final Output periodicBarGraph = new PeriodicFilter(3, barGraph);
	private static final Output periodicDelayedStatusBar = new DelayFilter(4, new PeriodicFilter(2, statusBar));

	public static void main(String[] args) throws IOException {
		Question survey = new Question("Are you in favor of nuclear energy?", Set.of("psoe", "pp"));

		// Set configuration
		configure0(survey);
//		configure1(survey);
//		configure2(survey);
//		configure3(survey);
//		configure4(survey);
//		configure5(survey);

		TextUserInterface userInterface = new TextUserInterface();
		userInterface.fill(survey);
	}

	private static void configure0(Question q) {
		q.addOutput(pieChart);
		q.addOutput(barGraph);
		q.addOutput(backup);
	}

	private static void configure1(Question q) {
		q.addOutput(statusBar);
	}

	private static void configure2(Question q) {
		q.removeOutput(barGraph);
	}

	private static void configure3(Question q) {
		q.removeOutput(pieChart);
		q.addOutput(delayPieChart);
	}

	private static void configure4(Question q) {
		q.addOutput(periodicBarGraph);
	}

	private static void configure5(Question q) {
		q.removeOutput(statusBar);
		q.addOutput(periodicDelayedStatusBar);
	}
}
