package com.fundamentals.lessons;

import com.fundamentals.House;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/* Lesson - Working with Lambda */
public class Lesson16 {

    // Not using Lambda
    public void noLambda() {
        Lesson16Interface my16
                = new Lesson16Interface() {
            @Override
            public void aLesson16Method() {
                System.out.println("Without Lambda");
            }
        };
        my16.aLesson16Method();
    }

    // Using a Lambda expression
    public void withLambda() {
        Lesson16Interface myOther =
        () -> System.out.println("Using lambda");
        myOther.aLesson16Method();
    } // end method scope

    public void multiplesLambda() {
        SimpleAdditionInterface simple =
                (able, beta) -> (able + beta);
        System.out.println(simple.add(20, 30));

        // Using data types
        SimpleAdditionInterface simple2 =
                (int charlie, int delta) -> (charlie + delta);
        System.out.println(simple2.add(10, 15));
    } // end method scope

    // Lambda with collections
    public void listLambda(){
        List<String> list =
                new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.forEach((value) -> System.out.println(value));
    }

    private ArrayList<House> getHouseList() {
        ArrayList<House> houseList =
                new ArrayList<>();
        houseList.add(new House());
        houseList.add(new House("Green",
                "Concrete"));
        houseList.add(new House("Blue",
                "Wood", "Cedar", 30));
        houseList.add(new House("Brown", "Dirt"));
        houseList.add(new House("Green",
                "Concrete", "Shingle", 35));
        houseList.add(new House());
        houseList.add(new House("Gray",
                "Concrete"));
        houseList.add(new House());
        return houseList;
    } // end method scope

    // Using Stream to filter
    public void filterLambda() {
        ArrayList<House> houses = getHouseList();
        Stream<House> filterHouse =
                houses.stream().filter(myChoice ->
                        myChoice.getEntranceDoorColor()
                                .equals("Green"));
        filterHouse.forEach(house ->
                System.out.println("Selections " +
                        house.toString()));
    }

    public static void main(String[] args) {
        Lesson16 myLesson = new Lesson16();
        myLesson.noLambda();
        myLesson.withLambda();
        myLesson.multiplesLambda();
        myLesson.listLambda();
        myLesson.filterLambda();
    }

} // end class scope
