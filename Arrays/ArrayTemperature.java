// Array: Problem 1: One-Dimensional Array (Daily Temperature Tracker)

public class ArrayTemperature {
    public static void main(String[] args) {

    // Gumawa ako ng double array para sa temperature at nakalagay ang kanilang mga decimal values
    double[] temperature = new double[]{32.5, 34.0, 31.8, 33.2, 35.1};

    // Isa-isang i p-print ang laman ng ating double array temperature
    for ( int i = 0; i < temperature.length; i++ ) {
        System.out.println(temperature[i]);
    }

    // Nag assign ng bagong decimal value para sa index [2] o third element
    temperature[2] = 32.0;

    // Print out ang updated temperature para sa third day from 31.8 to 32.0
    System.out.println("\nUpdated temperature of third day: " + temperature[2]);

    }
}