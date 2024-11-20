package game;

import java.awt.Point;

import api.Platform;
import platform.Image2D;

/*
 * This class/package will be the code of the video game, 
 * which we want to reuse on the different platforms
 */
public class BallGame {
	private final Platform platform;

	public BallGame(Platform platform) {
		this.platform = platform;
	}

	public void play() {
		Image2D image = this.platform.loadImage("Ball.jpg");

		// Main game logic
		for (int i = 0; i < 10; i++) {
			Point point = this.platform.getPosition();
			// Check collisions...
			// Print scoreboard...
			// Another logic of the game...
			this.platform.drawBall(image, point);
		}
	}
}
