package com.fundamentals.lessons;

/* Lesson - Methods, variables & Scope */
public class Lesson5 {

    static final int FREEZING = 32;
    private static final double KELVIN_UNIT = 273.15;
    static String temp = "temp";
    String message = "This message is from an instance method";

    /* static methods and local variables */
    public static double celsiusToFahrenheit(double celsius) {
        double total = (celsius * 9 / 5) + FREEZING;
        return total;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double total = (fahrenheit - FREEZING) * 5 / 9;
        return total;
    }

    /* public instance methods */
    public double celsiusToKelvin(double celsius) {
        return celsius + KELVIN_UNIT;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - KELVIN_UNIT;
    }

    public double fahrenheitToKevin(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return celsiusToKelvin(celsius);
    }

    public double kelvinToFahrenheit(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        return celsiusToFahrenheit(celsius);
    }

    // private method
    private void onlyHere(String value) {
        System.out.println("The value passed in is " + value);
    }

    // default method
    int onlyPackage(int num1, int num2) {
        return num1 + num2;
    }

    // protected method
    protected String subOrPackage() {
        return "This method returns from package" +
                "and subclasses";
    }

    // public method
    public void everywhere() {
        //onlyHere("private");
        System.out.println("All classes can see this.");
    }

}
