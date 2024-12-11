package CH.ifa.draw.samples.nada;

import CH.ifa.draw.framework.DrawingView;
import CH.ifa.draw.framework.Figure;
import CH.ifa.draw.framework.HJDError;
import CH.ifa.draw.standard.CreationTool;

public class EjemploTool extends CreationTool {

    // Implementación con el patrón prototype
    public EjemploTool(DrawingView view) {
        super(view, new EjemploFigure());
    }

}
