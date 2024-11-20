package main;

import game.BallGame;
import game.BallGameWindows;
import platform.windows.WindowsAPI;

public class MainWindows {
	public static void main(String[] args) {
		BallGame game = new BallGameWindows(new WindowsAPI());
		game.play();
	}
}
