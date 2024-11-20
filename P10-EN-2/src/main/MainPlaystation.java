package main;

import game.BallGame;
import game.BallGamePlaystation;
import platform.playstation.Playstation5API;

public class MainPlaystation {
	public static void main(String[] args) {
		BallGame game = new BallGamePlaystation(new Playstation5API());
		game.play();
	}
}
