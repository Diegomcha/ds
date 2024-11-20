package game;

import java.awt.Point;

import platform.Image2D;
import platform.android.AndroidAPI;

public class BallGameAndroid extends BallGame {

	private final AndroidAPI api;

	public BallGameAndroid(AndroidAPI api) {
		this.api = api;
	}

	@Override
	protected Image2D loadImage(String file) {
		return this.api.loadResource(file);
	}

	@Override
	protected void drawBall(Image2D image, Point point) {
		this.api.draw(point.x, point.y, image);
	}

	@Override
	protected Point getPosition() {
		return this.api.getTouch();
	}

}
