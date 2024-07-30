package com.fundamentals.lessons;

import com.fundamentals.House;

/* Lesson - Unit testing */
public class Lesson18 {

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public char[] myCharExample() {
        return new char[]
                {'U','n','i','t','T','e','s','t'};
    }

    public boolean isGreaterExample(int num1, int num2) {
        return num1 > num2;
    }

    public House myHouseExample(House house) {
        return house;
    }

} // end class scope
