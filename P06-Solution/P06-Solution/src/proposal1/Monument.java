package proposal1;

import google.maps.*;

public class Monument implements BookMark {
	// ----------------------------------------------
	// Este código será el mismo... ----------------
	private String name;
	private String author;
	private String address;

	public Monument(String name, String author, String address) {
		this.name = name;
		this.author = author;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getAddress() {
		return address;
	}

	// ----------------------------------------------------
	// ... y habría que añadir los métodos de Marcador ----
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
