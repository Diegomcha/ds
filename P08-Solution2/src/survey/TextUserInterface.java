package survey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TextUserInterface {

	public void fillSurvey(Question survey) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Options:");
		List<String> opciones = new ArrayList<>();
		Iterator<String> ops = survey.getOpciones();
		while (ops.hasNext()) {
			opciones.add(ops.next());
		}

		opciones.forEach(s -> System.out.print(s + " "));
		System.out.println("\nexit: to abandon the application.");

		do {
			System.out.println("\nQuestion: " + survey.getSurveyQuestion());
			System.out.print(">");

			String[] line = in.readLine().split(" ");
			// The number of words is not checked to ensure that they are adequate

			if (line[0].equals("exit"))
				return;

			if (opciones.contains(line[0]))
				survey.incrementVote(line[0]);
			else
				System.out.print("Wrong option");

		} while (true);

	}

	// private static BufferedReader in;
}
