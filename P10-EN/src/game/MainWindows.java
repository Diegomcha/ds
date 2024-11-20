package game;

import api.WindowsPlatform;
import platform.windows.WindowsAPI;

public class MainWindows {
	public static void main(String[] args) {
		BallGame game = new BallGame(new WindowsPlatform(new WindowsAPI()));
		game.play();
	}
}
