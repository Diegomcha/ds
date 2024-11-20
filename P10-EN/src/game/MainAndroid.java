package game;

import api.AndroidPlatform;
import platform.android.AndroidAPI;

public class MainAndroid {
	public static void main(String[] args) {
		BallGame game = new BallGame(new AndroidPlatform(new AndroidAPI()));
		game.play();
	}
}
