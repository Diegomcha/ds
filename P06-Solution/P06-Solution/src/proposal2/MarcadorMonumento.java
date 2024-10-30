package proposal2;

import google.maps.*;
import model.*;

public class MarcadorMonumento extends Monument implements BookMark {

	public MarcadorMonumento(String name, String author, String address) {
		super(name, author, address);
	}

	// ----------------------------------------------------
	// Sólo habría que añadir los métodos de Marcador -----

	public Coordinates getCoordinates() {
		return null; /* Hacerlo */
	}

	public String getTooltipInfo() {
		return null; /* Hacerlo */
	}

	public void open() {
		/* Hacerlo */
	}
}

// ------------------------------------------------------------------
// El main no iría aquí (se incluye solo para poder mostrarlo junto)
class Main {
	public static void main(String[] args) {
		MarcadorMonumento coliseo = new MarcadorMonumento("Coliseo", "Vespasiano", "Avenida del Coliseo 1. Roma");

		Map map = new Map();
		map.add(coliseo); // Ahora sí se puede!!!
	}
}
