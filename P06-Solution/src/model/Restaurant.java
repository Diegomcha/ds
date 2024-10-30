package model;

public class Restaurant {

	private String name;
	private String address;
	private String phone;

	public Restaurant(String name, String address, String phone) {
		setName(name);
		setAddress(address);
		setPhone(phone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// Call the restaurant's phone number to make a reservation
	public void call() {
		System.out.println("calling the phone " + phone);
	}
}
