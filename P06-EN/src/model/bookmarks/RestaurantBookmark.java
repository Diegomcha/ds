package model.bookmarks;

import google.maps.Coordinates;
import model.Restaurant;

public class RestaurantBookmark extends BaseBookmark<Restaurant> {

	public RestaurantBookmark(Restaurant restaurant) {
		super(restaurant);
	}

	@Override
	public Coordinates getCoordinates() {
		return this.nav.getCoordinates(this.item.getAddress());
	}

	@Override
	public String getTooltipInfo() {
		// Click on Restaurant: Name and phone number of the restaurant
		return String.format("Name: %s\nPhone: %s", this.item.getName(), this.item.getPhone());
	}

	@Override
	public void open() {
		// Pressed on Restaurant: Call the restaurant
		this.item.call();
	}
}
