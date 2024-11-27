package game;

import java.awt.Point;

import platform.*;

/*
 * This class/package will be the code of the video game, 
 * which we want to reuse on the different platforms
 */

public class BallGame {
	public BallGame(PlatformAdapter platform) {
		this.platform = platform;
	}

	public void play() {
		Image2D image = platform.load("Ball.jpg");
		// Main game logic
		for (int i = 0; i < 10; i++) {
			Point point = platform.getPosition();
			// Check collisions...
			// Print scoreboard...
			// Another logic of the game...
			platform.show(point.x, point.y, image);
		}
	}

	private PlatformAdapter platform;
}
