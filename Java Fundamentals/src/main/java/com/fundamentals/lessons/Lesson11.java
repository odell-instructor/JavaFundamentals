package com.fundamentals.lessons;

/* Lesson - Enumerations */
public class Lesson11 {
    public enum IceCreamFlavors { VANILLA, CHOCOLATE,
        STRAWBERRY, ROCKY_ROAD }

    public void showEnum() {
        Week day = Week.WED;
        System.out.println(day);
        System.out.println(Week.THU);
        System.out.println(IceCreamFlavors.STRAWBERRY);
    }

    public void myFavoriteFlavor(IceCreamFlavors flavor) {
        String msg = "My favorite ice cream is ";
        switch(flavor) {
            case VANILLA:
                msg += "Vanilla";
                break;
            case CHOCOLATE:
                msg += "Chocolate";
                break;
            case STRAWBERRY:
                msg += "Strawberry";
                break;
            default:
                msg += "Rock Road";
                break;
        }
        System.out.println(msg);
    }

    public void valueOrdinal() {
        Week[] week = Week.values();
        for(Week day : week) {
            System.out.println(day + " at index " +
                    day.ordinal());
        }
        System.out.println(Week.valueOf("WED"));
    }

    public void showEnumValues() {
        Week[] days = Week.values();
        for(Week day : days) {
            System.out.println("Week name: " + day.name() +
                    " Week #: " + day.getDayNum());
        }
    }

    public static void main(String[] args) {
        Lesson11 myLesson = new Lesson11();
        myLesson.showEnum();
        myLesson.myFavoriteFlavor(IceCreamFlavors.ROCKY_ROAD);
        myLesson.valueOrdinal();
        Week day = Week.SAT;
        day.someEnumMethod();
        myLesson.showEnumValues();
    }

}
