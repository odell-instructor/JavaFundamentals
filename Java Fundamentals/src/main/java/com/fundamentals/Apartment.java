package com.fundamentals;

/* child/subclass of House */
public class Apartment extends House {

    private String balcony;

    public Apartment() {
        this("Tan","Cinder Block",
                "Flat",2, "Wood Railed");
    }

    public Apartment(String entranceDoorColor,
                     String foundationType,
                     String roofStyle,
                     int totalWindows,
                     String balcony) {
        super(entranceDoorColor, foundationType,
                roofStyle, totalWindows);
        this.balcony = balcony;
    }

    public String getBalcony() {
        return balcony;
    }

    public void maintenance() {
        System.out.println("We will get that scheduled");
    }

    @Override
    public void doorFunction() {
        System.out.println("The door is closed");
    }

    public static void main(String[] args) {
        Apartment myPlace =
                new Apartment();
        myPlace.doorFunction();
        System.out.println(myPlace.getEntranceDoorColor());
        myPlace.maintenance();
        System.out.println(myPlace.getBalcony());
        myPlace.doorFunction("Red");
    }

} // end class scope
