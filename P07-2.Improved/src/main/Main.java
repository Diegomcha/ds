package main;

import java.io.*;

import fileSystem.FileSystem;
import outputs.*;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem fs = new FileSystem();

		fs.copy("private.txt", new FileOutput("copy.txt"));
		fs.copy("private.txt", new InternetOutput("1.1.1.1"));
		fs.copy("private.txt", new BluetoothOutput("iPhone"));
	}

}
