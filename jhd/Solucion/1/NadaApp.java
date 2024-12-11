/*
 * @(#)NothingApp.java 5.1
 *
 */

package CH.ifa.draw.samples.nada;

import java.awt.*;
import java.util.*;
import java.io.*;
import CH.ifa.draw.framework.*;
import CH.ifa.draw.standard.*;
import CH.ifa.draw.figures.*;
import CH.ifa.draw.contrib.*;
import CH.ifa.draw.util.*;
import CH.ifa.draw.application.*;

public class NadaApp extends DrawApplication {

    NadaApp() {
        super("Diseño de Sofware");
    }

    public static void main(String[] args) {
        DrawApplication window = new NadaApp();
        window.open();
    }

    protected void createTools(Panel palette) {

        super.createTools(palette);

        // Solución 1. Template Method. Esta solución requiere hacer una clase ('EjemploTool').

        // Tool herramienta = new EjemploTool(view());

        // Solución 2. Patrón Prototype. Esta solución evita tener que hacer la la clase
        // 'EjemploTool' al usar directamente CreationTool. Para ello, le pasa una instancia de la
        // figura a clonar (el prototipo).
        Tool herramienta = new CreationTool(view(), new EjemploFigure());

        palette.add(createToolButton(IMAGES + "RECT", "Ejemplo Tool", herramienta));

    }

}
