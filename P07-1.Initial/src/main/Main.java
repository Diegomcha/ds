package main;

import java.io.IOException;

import fileSystem.FileSystem;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem fs = new FileSystem();

		fs.copyFile("private.txt", "copy.txt");
		fs.sendToInternet("private.txt", "156.17.11.196");
		fs.sendWithBluetooth("private.txt", "Galaxy of Raúl");
	}

}
