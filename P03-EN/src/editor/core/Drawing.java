package editor.core;

import java.util.ArrayList;
import java.util.List;

import editor.figure.Figure;
import editor.util.Point;

public class Drawing {
	
	private final List<Figure> figures = new ArrayList<>();
	private Figure selectedFigure;
	
	public void addFigure(Figure fig) {
		this.figures.add(fig);
	}
	
	public boolean selectFigure(Point p) {
		for (Figure figure: figures.reversed())
			if (figure.isClickInside(p)) {
				this.selectedFigure = figure;
				return true;
			}
		
		return false;
	}
	
	public Figure getSelectedFigure() {
		return this.selectedFigure;
	}
	
	public void deselectFigure() {
		this.selectedFigure = null;
	}
	

    public String draw() {
    	StringBuilder representation = new StringBuilder();
    	
    	for (Figure figure: figures)
    		representation.append("\t").append(figure.draw());
    	
    	return representation.toString();
    }
}
