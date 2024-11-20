package platform.playstation;

import java.awt.Point;

import platform.*;

public class Playstation5API {

	public Image2D loadGraphics(String name) {
		System.out.println("(PS5) Image '" + name + "' loaded from the DVD.");
		return new Image2D(name, 10, 10);
	}

	public void render(int x, int y, Image2D image) {
		System.out.println("(PS5) Drawing '" + image.getName() + "' in [" + x + "," + y + "]");
	}

	// Stick position in which the user presses the X button
	public Point getJoystick() {
		point.translate(10, 10);
		return new Point(point);
	}

	private Point point = new Point(0, 0);

}
