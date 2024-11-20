package api;

import java.awt.Point;

import platform.Image2D;
import platform.android.AndroidAPI;

public class AndroidPlatform implements Platform {

	private final AndroidAPI api;

	public AndroidPlatform(AndroidAPI api) {
		this.api = api;
	}

	@Override
	public Image2D loadImage(String name) {
		return this.api.loadResource(name);
	}

	@Override
	public Point getPosition() {
		return this.api.getTouch();
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		this.api.draw(point.x, point.y, image);
	}

}
