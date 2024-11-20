package main;

public class Temperature {
	private double celsius;
	private double fahrenheit;

	public Temperature(double celsiusTemp) {
		this.setCelsius(celsiusTemp);
	}

	public void setCelsius(double temp) {
		this.celsius = temp;
		this.fahrenheit = temp * 1.8 + 32;
	}

	public void setFahrenheit(double temp) {
		this.fahrenheit = temp;
		this.celsius = (temp - 32) / 1.8;
	}

	public double getCelsius() {
		return this.celsius;
	}

	public double getFahrenheit() {
		return this.fahrenheit;
	}
}
