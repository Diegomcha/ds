package platform.android;

import java.awt.Point;

import platform.*;

public class AndroidAPI {

	public Image2D loadResource(String name) {
		System.out.println("(Android) Image '" + name + "' loaded from the flash memory.");
		return new Image2D(name, 10, 10);
	}

	public void draw(int x, int y, Image2D image) {
		System.out.println("(Android) Drawing '" + image.getName() + "' in [" + x + "," + y + "]");
	}

	// Position in which the user touches the screen with their finger
	public Point getTouch() {
		point.translate(10, 10);
		return new Point(point);
	}

	private Point point = new Point(0, 0);
}
