package survey;

import java.io.*;

public class TextUserInterface {

	public void rellena(Question encuesta) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Comands:");
		System.out.println("yes");
		System.out.println("no");
		System.out.println("exit: to abandon the application.");

		do {
			System.out.println("\nQuestion: " + encuesta.getSurveyQuestion());
			System.out.print(">");

			String[] line = in.readLine().split(" ");
			// The number of words is not checked to ensure that they are adequate

			if (line[0].equals("exit"))
				return;

			if (line[0].equals("yes"))
				encuesta.incrementYes();

			if (line[0].equals("no"))
				encuesta.incrementNo();
		} while (true);

	}

	// private static BufferedReader in;
}
