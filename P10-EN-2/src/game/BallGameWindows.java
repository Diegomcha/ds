package game;

import java.awt.Point;

import platform.Image2D;
import platform.windows.WindowsAPI;

public class BallGameWindows extends BallGame {

	private final WindowsAPI api;

	public BallGameWindows(WindowsAPI api) {
		this.api = api;
	}

	@Override
	protected Image2D loadImage(String file) {
		return this.api.loadFile(file);
	}

	@Override
	protected void drawBall(Image2D image, Point point) {
		this.api.paint(point.x, point.y, image);
	}

	@Override
	protected Point getPosition() {
		return this.api.getMouseClick();
	}

}
