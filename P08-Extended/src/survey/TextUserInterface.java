package survey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class TextUserInterface {

	public void fill(Question encuesta) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		Set<String> choices = encuesta.getChoices();

		System.out.println("Comands:");
		for (String choice : choices)
			System.out.println(choice);
		System.out.println("exit: to abandon the application.");

		do {
			System.out.println("\nQuestion: " + encuesta.getSurveyQuestion());
			System.out.print(">");

			String cmd = in.readLine().split(" ")[0].trim().toLowerCase();
			// The number of words is not checked to ensure that they are adequate

			if (cmd.equals("exit"))
				return;

			if (choices.contains(cmd))
				encuesta.incrementVote(cmd);
		} while (true);

	}

	// private static BufferedReader in;
}
