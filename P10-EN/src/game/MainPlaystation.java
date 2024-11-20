package game;

import api.PlaystationPlatform;
import platform.playstation.Playstation5API;

public class MainPlaystation {
	public static void main(String[] args) {
		BallGame game = new BallGame(new PlaystationPlatform(new Playstation5API()));
		game.play();
	}
}
