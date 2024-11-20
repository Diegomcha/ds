package api;

import java.awt.Point;

import platform.Image2D;
import platform.windows.WindowsAPI;

public class WindowsPlatform implements Platform {

	private final WindowsAPI api;

	public WindowsPlatform(WindowsAPI api) {
		this.api = api;
	}

	@Override
	public Image2D loadImage(String name) {
		return this.api.loadFile(name);
	}

	@Override
	public Point getPosition() {
		return this.api.getMouseClick();
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		this.api.paint(point.x, point.y, image);
	}

}
