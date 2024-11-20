package game;

import java.awt.Point;

import platform.Image2D;
import platform.playstation.Playstation5API;

public class BallGamePlaystation extends BallGame {

	private final Playstation5API api;

	public BallGamePlaystation(Playstation5API api) {
		this.api = api;
	}

	@Override
	protected Image2D loadImage(String file) {
		return this.api.loadGraphics(file);
	}

	@Override
	protected void drawBall(Image2D image, Point point) {
		this.api.render(point.x, point.y, image);
	}

	@Override
	protected Point getPosition() {
		return this.api.getJoystick();
	}

}
