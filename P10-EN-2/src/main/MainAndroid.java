package main;

import game.BallGame;
import game.BallGameAndroid;
import platform.android.AndroidAPI;

public class MainAndroid {
	public static void main(String[] args) {
		BallGame game = new BallGameAndroid(new AndroidAPI());
		game.play();
	}
}
