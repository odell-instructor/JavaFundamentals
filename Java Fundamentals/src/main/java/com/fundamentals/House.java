package com.fundamentals;

public class House {
    private String entranceDoorColor;
    private String foundationType;
    private String roofStyle;
    private int totalWindows;

    public House() {
        this("Red", "Cinder Block",
                "Cedar Shingle", 42);
    } // constructor scope

    public House(String entranceDoorColor,
                 String foundationType) {
        this(entranceDoorColor,foundationType
                , "Shingle", 34);
    } // constructor scope

    public House(String entranceDoorColor,
                 String foundationType,
                 String roofStyle, int totalWindows) {
        this.entranceDoorColor = entranceDoorColor;
        this.foundationType = foundationType;
        this.roofStyle = roofStyle;
        this.totalWindows = totalWindows;
    } // constructor scope

    public String getEntranceDoorColor() {
        return entranceDoorColor;
    } // get method scope

    public String getFoundationType() {
        return foundationType;
    } // get method scope

    public String getRoofStyle() {
        return roofStyle;
    } // get method scope

    public int getTotalWindows() {
        return totalWindows;
    } // get method scope

    public void doorFunction() {
        System.out.println("This door opens");
    }

    public void doorFunction(String color) {
        System.out.println("This " +
                color + " door opens");
    }

    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.doorFunction();
        myHouse.entranceDoorColor = "Red";
        myHouse.foundationType = "Concrete";
        myHouse.roofStyle = "Shingle";
        myHouse.totalWindows = 30;
        System.out.println(myHouse.foundationType);

        House house1 = new House();
        house1.roofStyle = "Cedar";

        System.out.println(myHouse.roofStyle);
        System.out.println(house1.roofStyle);

    }

}
