package main;

import java.io.IOException;

import fileSystem.FileSystem;
import outputs.BluetoothOutput;
import outputs.FileOutput;
import outputs.InternetOutput;
import outputs.filters.Counter;
import outputs.filters.Distributor;
import outputs.filters.Encrypter;
import outputs.filters.Normalizer;
import outputs.filters.SpacesDeletion;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem fs = new FileSystem();

		// ------------------------------------------------
		// Initial design
		fs.copy("private.txt", new Normalizer(new FileOutput("private2.txt")));
		fs.copy("private.txt", new Encrypter(new InternetOutput("1.1.1.1")));
		fs.copy("private.txt", new Encrypter(new SpacesDeletion(new BluetoothOutput("iPhone"))));

		// ------------------------------------------------
		// Modification #1: it must be possible to encrypt while writing the file
		// Changes: None
		fs.copy("private.txt", new Normalizer(new FileOutput("a.txt")));
		fs.copy("private.txt", new Normalizer(new Encrypter(new FileOutput("b.txt"))));

		// ------------------------------------------------
		// Modification #2: When sending via the Internet, the text can be normalized
		// and/or remove spaces
		// Changes: None
		fs.copy("private.txt", new Normalizer(new InternetOutput("1.1.1.1")));
		fs.copy("private.txt", new SpacesDeletion(new InternetOutput("1.1.1.1")));
		fs.copy("private.txt", new SpacesDeletion(new Normalizer(new InternetOutput("1.1.1.1"))));

		// ------------------------------------------------
		// Modification #3: Count written characters
		// Changes: Add the class Counter
		Counter counter = new Counter(new InternetOutput("1.1.1.1"));
		fs.copy("private.txt", new Normalizer(counter));
		System.out.println("Modificacion 3a: " + counter.getCounter());

		// Another way to do it:
		fs.copy("private.txt", new Normalizer(counter = new Counter(new InternetOutput("1.1.1.1"))));
		System.out.println("Modificacion 3b: " + counter.getCounter());

		// ------------------------------------------------
		// Modification #4: It should also be possible to count characters before
		// normalizing.
		// Changes: None
		Counter after = new Counter((new InternetOutput("1.1.1.1")));
		Counter before = new Counter(new Normalizer(after));
		fs.copy("private.txt", before);
		System.out.println("Modificacion 4a: " + before.getCounter() + " -> " + after.getCounter());

		// Another way to do it:
		fs.copy("private.txt",
				before = new Counter(new Normalizer(after = new Counter((new InternetOutput("1.1.1.1"))))));
		System.out.println("Modificacion 4b: " + before.getCounter() + " -> " + after.getCounter());

		// ------------------------------------------------
		// Modification #5: We want a file to be encrypted only once and then sent to
		// more than one destination.
		// Changes: Add the class Distributor
		fs.copy("private.txt",
				new Encrypter(new Distributor(new InternetOutput("1.1.1.1"), new BluetoothOutput("iPhone"))));

	}
}
