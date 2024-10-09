package figures.triangle;

import java.awt.*;

import editor.core.Figure;

public class Triangle implements Figure {

    private Point v1;
    private Point v2;
    private Point v3;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public void draw() {
        System.out.println("  - Triangle: v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3);
    }

    public boolean contains(int x, int y) {

        Point position = new Point(x, y);
        return position.equals(v1) || position.equals(v2) || position.equals(v3);
    }

    public void move(int dx, int dy) {
        v1.translate(dx, dy);
        v2.translate(dx, dy);
        v3.translate(dx, dy);
    }

    @Override
    public String toString() {
    	return "Triangle: v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3;
    }
}
