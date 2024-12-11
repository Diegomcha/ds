package CH.ifa.draw.samples.nada;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.util.Vector;

import CH.ifa.draw.framework.Tool;
import CH.ifa.draw.standard.AbstractFigure;

public class EjemploFigure extends AbstractFigure {

	private Point origin;
	private Dimension dimensions;

	public EjemploFigure() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(java.awt.Color.WHITE);
		g.fillRect(origin.x, origin.y, dimensions.width, dimensions.height);
	}

	@Override
	public Rectangle displayBox() {
		return new Rectangle(origin.x, origin.y, dimensions.width, dimensions.height);
	}

	@Override
	public Vector handles() {
		return new Vector();
	}

	@Override
	protected void basicMoveBy(int dx, int dy) {
		this.origin.x += dx;
		this.origin.y += dy;
	}

	@Override
	public void basicDisplayBox(Point origin, Point corner) {
		this.origin = new Point(Math.min(origin.x, corner.x), Math.min(origin.y, corner.y));
		this.dimensions = new Dimension(Math.abs(origin.x - corner.x), Math.abs(origin.y - corner.y));
	}

}
