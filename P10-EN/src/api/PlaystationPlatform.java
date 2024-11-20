package api;

import java.awt.Point;

import platform.Image2D;
import platform.playstation.Playstation5API;

public class PlaystationPlatform implements Platform {

	private final Playstation5API api;

	public PlaystationPlatform(Playstation5API api) {
		this.api = api;
	}

	@Override
	public Image2D loadImage(String name) {
		return this.api.loadGraphics(name);
	}

	@Override
	public Point getPosition() {
		return this.api.getJoystick();
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		this.api.render(point.x, point.y, image);
	}

}
