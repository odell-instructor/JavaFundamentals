package com.fundamentals.lessons;

/* Lesson - Polymorphism */
public class Lesson14 extends Lesson13 {

    public Lesson14() {
        super("Lesson14");
    }

    @Override
    public void exampleOverride() {
        super.exampleOverride();
        System.out.println("This is lesson 14");
    }

    public void welcome() {
        System.out.println("Welcome to Lesson 14");
    }

    public void welcome(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Lesson14 myLesson = new Lesson14();
        myLesson.welcome();
        myLesson.welcome("Welcome to class.");
        myLesson.exampleOverride();
    }

} // end class scope
