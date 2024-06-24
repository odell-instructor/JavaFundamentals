package com.fundamentals;

import com.fundamentals.lessons.Lesson5;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello Java");
        lesson5Example();
    }

    public static void lesson5Example() {
        Lesson5 myLesson = new Lesson5();
        myLesson.everywhere();
        double myFirstResult = Lesson5.celsiusToFahrenheit(87);
        System.out.println(myFirstResult);
        double mySecondResult = Lesson5.fahrenheitToCelsius(188.6);
        System.out.println(mySecondResult);
        
        System.out.println(myLesson.celsiusToKelvin(87));
        System.out.println(myLesson.kelvinToCelsius(320));
        System.out.println(myLesson.fahrenheitToKevin(196.8));
        System.out.println(myLesson.kelvinToFahrenheit(497.34));
    }

    public static void houseExample() {
        House yourHouse = new House();
        yourHouse.entranceDoorColor = "Green";
        yourHouse.roofStyle = "Cedar";
        yourHouse.foundationType = "Cinder Block";
        yourHouse.totalWindows = 32;
        yourHouse.doorFunction();
        System.out.println(yourHouse.roofStyle);
    }

}
