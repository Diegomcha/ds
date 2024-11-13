package editor.core;

import java.util.ArrayList;
import java.util.List;

public class Drawing {

	private List<Figure> figures = new ArrayList<>();

	public void addFigura(Figure figure) {
		figures.add(figure);
	}

	public void removeFigura(Figure figure) {
		figures.remove(figure);
	}

	public void dibuja() {
		for (Figure figure : figures)
			figure.draw();
	}

	public Figure getFigura(int x, int y) {
		for (Figure figure : figures)
			if (figure.contains(x, y))
				return figure;
		return null;
	}

}
