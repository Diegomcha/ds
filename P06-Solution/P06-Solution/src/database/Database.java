package database;

import google.maps.Coordinates;

import java.util.*;

import model.*;

// Class that simulates access to the Database
public class Database {

	public Collection<Monument> selectMonuments() {
		List<Monument> monuments = new ArrayList<>();
		monuments.add(new Monument("Coliseo", "Vespasiano", "Viale dei Coliseo 1. Roma"));
		monuments.add(new Monument("Fontana di Trevi", "Niccolo Salvi", "Piazza di Trevi. Roma"));
		return monuments;
	}

	public Collection<Photo> selectPhotos() {
		List<Photo> photos = new ArrayList<>();
		photos.add(new Photo("Raúl", "The Colosseum at night", new Coordinates(20, 20)));
		photos.add(new Photo("Raúl", "A dog biting a tourist", new Coordinates(40, 40)));
		return photos;
	}

	public Collection<Restaurant> selectRestaurants() {
		List<Restaurant> restaurants = new ArrayList<>();
		restaurants.add(new Restaurant("Il Gladiatore", "Via dei Trionfo 2. Roma", "555 123 456"));
		restaurants.add(new Restaurant("Mario", "Via della Dataria. Roma", "555 123 457"));
		return restaurants;
	}
}
