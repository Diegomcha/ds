package main;

public class Main {

	public static void main(String[] args) {
		Temperature[] temperatures = new Temperature[100];

		// Data reading
		for (int i = 0; i < temperatures.length; i++)
			temperatures[i] = new Temperature(readCelciusSensor());

		Temperature avg = computeTempAverage(temperatures);
		// Celsius calculation
		System.out.println(avg.getCelsius());
		// Fahrenheit calculation
		System.out.println(avg.getFahrenheit());

		// Another calculation using Fahrenheit
		double variance = computeTempFahrenheitVariance(temperatures, avg.getFahrenheit());
		System.out.println(variance);
	}

	public static double readCelciusSensor() {
		return Math.random() * 30;
	}
	
	private static Temperature computeTempAverage(Temperature[] temps) {
		double avg = 0;
		
		for (int i = 0; i < temps.length; i++)
			avg += temps[i].getCelsius();
		
		return new Temperature(avg / temps.length);
	}
	
	private static double computeTempFahrenheitVariance(Temperature[] temps, double farenheitAvg) {
		double variance = 0;
		for (int i = 0; i < temps.length; i++)
			variance += Math.pow(temps[i].getFahrenheit() - farenheitAvg, 2);
		return variance / temps.length;
	}
}
