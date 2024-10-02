package editor.figure;

import editor.util.Point;

public interface Figure {
	
	void translate(Point startPoint, Point endPoint);

	boolean isClickInside(Point p);

	String draw();
}
