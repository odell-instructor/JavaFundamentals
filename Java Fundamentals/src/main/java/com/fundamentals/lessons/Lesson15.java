package com.fundamentals.lessons;

/* Lesson - Abstraction */
public class Lesson15 extends Lesson15Abstract
implements Lesson15Interface {

    @Override
    protected void tryOn(String hat) {
        System.out.println("I tried on a " +
                hat + " hat");
    }

    @Override
    protected void shapeHat() {
        String shape = "Using steam " +
                "will allow you to shape a hat";
        System.out.println(shape);
    }

    public static void main(String[] args) {
        Lesson15 myLesson = new Lesson15();
        // from Lesson 15
        myLesson.tryOn("Fedora");
        myLesson.shapeHat();
        // from Abstract class
        myLesson.hatStyle("Formal");
        myLesson.hatSize(8);
        myLesson.hatColor("Dark Brown");
    }

    @Override
    public void hatSize(int size) {
        System.out.println("My hat size is " + size);
    }

    @Override
    public void hatColor(String color) {
        System.out.println("My hat is " + color);
    }

} // end class scope
