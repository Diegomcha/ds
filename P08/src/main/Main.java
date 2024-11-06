package main;

import java.io.*;

import survey.TextUserInterface;
import survey.Question;

public class Main {

	public static void main(String[] args) throws IOException {
		Question survey = new Question("Are you in favor of nuclear energy?");

		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(survey);
	}

}
