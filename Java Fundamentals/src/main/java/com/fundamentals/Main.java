package com.fundamentals;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        House yourHouse = new House();
        yourHouse.entranceDoorColor = "Green";
        yourHouse.roofStyle = "Cedar";
        yourHouse.foundationType = "Cinder Block";
        yourHouse.totalWindows = 32;
        yourHouse.doorFunction();
        System.out.println(yourHouse.roofStyle);
    }

}
