package adapters;

import google.maps.*;
import model.*;


public class RestaurantBookamrkAdapter implements BookMark {

	private Restaurant restaurant;
	private Navigator navigator = new Navigator();

	public RestaurantBookamrkAdapter(Restaurant restaurante) {
		this.restaurant = restaurante;
	}

	@Override
	public Coordinates getCoordinates() {
		return navigator.getCoordinates(restaurant.getAddress());
	}

	@Override
	public String getTooltipInfo() {
		return "Restaurant '" + restaurant.getName() + "'. Tel. " + restaurant.getPhone();
	}

	@Override
	public void open() {
		restaurant.call();
	}

}
