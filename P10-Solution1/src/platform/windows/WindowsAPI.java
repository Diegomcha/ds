package platform.windows;

import java.awt.Point;

import platform.Image2D;

public class WindowsAPI {

	public Image2D loadFile(String name) {
		System.out.println("(Windows) Image '" + name + "' loaded from the hard disk.");
		return new Image2D(name, 10, 10);
	}

	public void paint(int x, int y, Image2D image) {
		System.out.println("(Windows) Drawing '" + image.getName() + "' in [" + x + "," + y + "]");
	}

	// Position in which the user clicks with the mouse
	public Point getMouseClick() {
		point.translate(10, 10);
		return new Point(point);
	}

	private Point point = new Point(0, 0);

}
