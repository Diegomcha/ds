package main;

import adapters.*;
import database.Database;
import google.maps.*;
import model.*;

public class Main {

	public static void main(String[] args) {

		Database db = new Database();
		Map map = new Map();

		// 1. Put the items into the map
		System.out.println("\n 1. Putting bookmaks on the map");

		for (Monument monumento : db.selectMonuments()) {
			map.add(new MonumentBookmarkAdapter(monumento));
		}

		for (Photo foto : db.selectPhotos()) {
			map.add(new PhotoBookmarkAdapter(foto));
		}

		for (Restaurant restaurante : db.selectRestaurants()) {
			map.add(new RestaurantBookamrkAdapter(restaurante));
		}

		// 2. BookMarks for items added to the map are drawn on the map.
		System.out.println("\n 2. Drawing the map with the bookmarkrs");
		map.draw();

		// 3. The user briefly presses on the screen to receive information about each item
		System.out.println("\n 3. Short press on each item: information on tooltip");
		map.shortClick(31, 31); // Click on Monument: Name and author of the monument (Coliseum)
		map.shortClick(21, 21); // Click on Photo: Description of the photo and user who uploaded it
		map.shortClick(91, 91); // Click on Restaurant: Name and phone number of the restaurant

		// 4. El usuario deja pulsado un marcador para abrir un elemento
		System.out.println("\n 4. Long press on each item: open the item");
		map.longClick(31, 31); // Click on Monument: Navigate to the monument with GPS
		map.longClick(21, 21); // Click on Photo: Download photo
		map.longClick(91, 91); // Pressed on Restaurant: Call the restaurant
	}

}
