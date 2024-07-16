package com.fundamentals.lessons;

/* Lesson - Inheritance */
public class Lesson13 extends Lesson12 {

    public Lesson13(String msg) {
        super(msg);
    }

    public Lesson13(String title, int hours) {
        super(title, hours);
    }

    public void exampleOverride() {
        System.out.println("This is lesson 13.");
    }

    public static void main(String[] args) {
        Lesson13 myLesson =
                new Lesson13("Hello There");
        Lesson13 my13 =
                new Lesson13("Rising Storm 2", 350);
        System.out.println(my13.getGameTitle());
    }
}
