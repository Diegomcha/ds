package google.maps;

public class Navigator {

	// Given an address, returns its coordinates
	public Coordinates getCoordinates(String address) {
		// Simulated implementation
		double number = (address.toLowerCase().charAt(10) - 'a') * 10.0 + 10.0;
		return new Coordinates(number, number);
	}

	// Given some coordinates, returns the address to which it corresponds.
	public String gatAddress(Coordinates coordinates) {
		// Simulated implementation
		return coordinates.toString();
	}

	// Method that, given an address, initiates the process of navigating to it
	public void navigateTo(String address) {
		// Simulated implementation
		System.out.println("GPS: Turn right. You have arrived to '" + address + "'");
	}
}
