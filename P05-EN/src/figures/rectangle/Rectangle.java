package figures.rectangle;

import java.awt.Point;

import editor.core.Figure;

public class Rectangle implements Figure {

    private Point corner;
    private int width;
    private int height;

    public Rectangle(Point esquina, int width, int height) {
        this.corner = new Point(esquina);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point begin, Point end) {
        this(begin, end.x - begin.x, end.y - begin.y);
    }

    public void draw() {
        System.out.println(
                "  - Rectangle: x = " + corner.x + ", y = " + corner.y + ", width = " + width + ", height = " + height);
    }

    public boolean contains(int x, int y) {
        return (corner.x <= x && x <= corner.x + width) && (corner.y <= y && y <= corner.y + height);
    }

    public void move(int dx, int dy) {
        corner.translate(dx, dy);
    }

    
    @Override
    public String toString() {
    	return "Rectangle: x = " + corner.x + ", y = " + corner.y + ", width = " + width + ", height = " + height;
    }
}
