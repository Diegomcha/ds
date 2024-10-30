package main;

import java.io.IOException;

import fileSystem.FileSystem;
import outputs.BluetoothOutput;
import outputs.FileOutput;
import outputs.InternetOutput;
import transformers.Counter;
import transformers.DedupeSpacesTransformer;
import transformers.EncryptTransformer;
import transformers.Multiplexer;
import transformers.NormalizeTransformer;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem fs = new FileSystem();
		Counter c, cRaw;

		// Reference changes
		fs.copy("private.txt", new NormalizeTransformer(c = new Counter(new FileOutput("copy.txt"))));
		showNumCopiedChars(c);
		fs.copy("private.txt", new EncryptTransformer(c = new Counter(new InternetOutput("1.1.1.1"))));
		showNumCopiedChars(c);
		fs.copy("private.txt",
				new DedupeSpacesTransformer(new EncryptTransformer(c = new Counter(new BluetoothOutput("iPhone")))));
		showNumCopiedChars(c);

		// Mod. 1
		fs.copy("private.txt",
				new NormalizeTransformer(new EncryptTransformer(c = new Counter(new FileOutput("enc_copy.txt")))));
		showNumCopiedChars(c);

		// Mod. 2
		fs.copy("private.txt",
				new NormalizeTransformer(new EncryptTransformer(c = new Counter(new InternetOutput("1.1.1.1")))));
		showNumCopiedChars(c);
		fs.copy("private.txt",
				new DedupeSpacesTransformer(new EncryptTransformer(c = new Counter(new InternetOutput("1.1.1.1")))));
		showNumCopiedChars(c);
		fs.copy("private.txt", cRaw = new Counter(new NormalizeTransformer(
				new DedupeSpacesTransformer(new EncryptTransformer(c = new Counter(new InternetOutput("1.1.1.1")))))));
		showNumCopiedChars(c);
		System.out.println(cRaw.getCount() + " characters were originally");

		// Mod. 5
		fs.copy("private.txt",
				new EncryptTransformer(new Multiplexer(new BluetoothOutput("iPhone"), new InternetOutput("1.1.1.1"))));

	}

	private static void showNumCopiedChars(Counter counter) {
		System.out.println(counter.getCount() + " characters were copied");
	}

}
