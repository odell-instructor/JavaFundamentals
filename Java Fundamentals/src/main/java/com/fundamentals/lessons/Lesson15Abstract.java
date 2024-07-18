package com.fundamentals.lessons;

/* Lesson - Abstraction */
public abstract class Lesson15Abstract {

    // abstract methods
    protected abstract void tryOn(String hat);
    protected abstract void shapeHat();

    // Normal Method
    public void hatStyle(String style) {
        System.out.println(style);
    }

} // end class scope
