package com.fundamentals;

public class House {
    String entranceDoorColor;
    String foundationType;
    String roofStyle;
    int totalWindows;

    public void doorFunction() {
        System.out.println("This door opens");
    }

    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.doorFunction();
        myHouse.entranceDoorColor = "Red";
        myHouse.foundationType = "Concrete";
        myHouse.roofStyle = "Shingle";
        myHouse.totalWindows = 30;
        System.out.println(myHouse.foundationType);
    }

}
