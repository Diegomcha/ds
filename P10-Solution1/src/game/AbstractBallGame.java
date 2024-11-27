package game;

import java.awt.Point;

import platform.Image2D;

// Code of the game that you want to be able to run in different platforms without having to modify it

public abstract class AbstractBallGame {

	// Fixed part of the algorithm.
	public void play() {

		Image2D image = loadImage("Bola.jpg");

		// Main game logic
		for (int i = 0; i < 10; i++) {
			Point point = getPosition();
			// Check collisions...
			// Print scoreboard...
			// Another logic of the game...
			drawBall(image, point);
		}
	}

	// Variable parts of the algorithm.
	protected abstract Image2D loadImage(String file);

	protected abstract void drawBall(Image2D image, Point point);

	protected abstract Point getPosition();

}