package game;

import java.awt.Point;

import platform.Image2D;

/*
 * This class/package will be the code of the video game, 
 * which we want to reuse on the different platforms
 */
public abstract class BallGame {
	public void play() {
		Image2D image = loadImage("Ball.jpg");

		// Main game logic
		for (int i = 0; i < 10; i++) {
			Point point = getPosition();
			// Check collisions...
			// Print scoreboard...
			// Another logic of the game...
			drawBall(image, point);
		}
	}

	protected abstract Image2D loadImage(String file);

	protected abstract void drawBall(Image2D image, Point point);

	protected abstract Point getPosition();
}
