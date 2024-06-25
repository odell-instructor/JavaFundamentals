package com.fundamentals.lessons;
import java.util.Scanner;

/* Lesson - Working with Operators */
public class Lesson6 {
    int num1 = 23, num2 = 45;

    /* Arithmetic Operators*/
    public void basicMath() {
        System.out.println(num1 + num2);
        System.out.println(num2 - num1);
        System.out.println(num1 * num2);
        System.out.println(num2 / num1);
    }

    public void justTheRemainder(int num){
        int total = num2 % num;
        System.out.println(total);
    }

    /* PEMDAS */
    public void mathOrder() {
        double total = (20 - 42) / 3.7 + 8.2 * 19 - 32;
        double altTotal = 20 - 42 / 3.7 + 8.2 * 19 - 32;
        System.out.println("Total " + total);
        System.out.println("Alt Total "+ altTotal);
    }

    /* Increment Operator */
    public void demoIncrement() {
        int able = 10, baker, car;

        /* Post Increment - Value is computed
        * then increment by 1. */
        baker = able++;
        System.out.println(able); // 11
        System.out.println(baker); // 10

        /* Pre Increment - Value is incremented
        * by 1 then computed. */
        car = ++able;
        System.out.println(able); // 12
        System.out.println(car); // 12
    }

    /* Decrement Operator */
    public void demoDecrement() {
        int tom = 10, joe, jerry;

        /* Post Decrement - Value is computed
        * then decremented by 1 */
        joe = tom--;
        System.out.println(tom); // 9
        System.out.println(joe); // 10

        /* Pre Decrement - Value is decremented
        * by 1 then computed */
        jerry = --tom;
        System.out.println(tom); // 8;
        System.out.println(jerry); // 8
    }

    /* Method returns the positive value
    * of an argument */
    public double imPositive(double num1) {
        return Math.abs(num1);
    }

    /* Returns the smallest value greater
    * than or equal to the argument */
    public double imTop(double value) {
        return Math.ceil(value);
    }

    /* Returns the largest value less
    * than or equal to the argument */
    public double imBottom(double value) {
        return Math.floor(value);
    }

    /* Rounds the value with positive up */
    public void justRound(double num1, float num2) {
        long bravo = Math.round(num1);
        int able = Math.round(num2);
        System.out.println("Round for long " + bravo);
        System.out.println("Round for int " + able);
    }

    /* Using Scanner to get user input */
    public void addSomeNumbers() {
        int num1, num2, total;
        System.out.println("Enter two integers to" +
                " calculate their sum.");
        Scanner userInput = new Scanner(System.in);
        num1 = userInput.nextInt();
        num2 = userInput.nextInt();
        total = num1 + num2;
        System.out.println("The sum of the problem is " + total);
        userInput.close();
    }

    /* Assignment Operator */
    public void onlyCombo(int able, int may) {
        able += may;
        System.out.println("+= operator " + able);
        may -= able;
        System.out.println("-= operator " + may);
        able *= may;
        System.out.println("*= operator " + able);
        able /= may;
        System.out.println("/= operator " + able);
        able %= may;
        System.out.println("%= operator " + able);
    }

    /* Relational Operators */
    public void justEqual(int echo, int foxtrot) {
        boolean isEqual = echo == foxtrot; // = =
        boolean isNot = echo != foxtrot; // ! =
        System.out.println("isEqual " + isEqual);
        System.out.println("isNot " + isNot);
    }

    public void justRelational(int golf, int hotel) {
        boolean isGreater = golf > hotel;
        System.out.println(isGreater);
        boolean isLess = hotel <= golf; // < =
        System.out.println(isLess);
    }

    /* Logical Operators */
    /* The && operator means that both conditions
    * must be true for the result to be true */
    public void bothShouldBeRight(int alpha, int beta, int charlie) {
        boolean logicAnswer = (alpha != beta) && (charlie > beta);
        System.out.println("Logical And " + logicAnswer);
    }

    /* The || operator means that only 1 condition
    * needs to be true for the result to be true */
    public void oneCouldBeRight(int delta, int echo, int fox) {
        boolean logicalAnswer = (delta != echo) || (fox > echo);
        System.out.println("Logical Or " + logicalAnswer);
    }



    public static void main(String[] args) {
        Lesson6 myLesson = new Lesson6();
        myLesson.basicMath();
        myLesson.justTheRemainder(3);
        myLesson.mathOrder();
        myLesson.demoIncrement();
        myLesson.demoDecrement();
        System.out.println(myLesson.imPositive(-89.32));
        System.out.println(myLesson.imTop(12.36));
        System.out.println(myLesson.imBottom(34.59));
        myLesson.justRound(98.63, 65.43F);
        //myLesson.addSomeNumbers();
        myLesson.onlyCombo(10, 15);
        myLesson.justEqual(42, 24);
        myLesson.justRelational(144, 17);
        myLesson.bothShouldBeRight(10, 14, 16);
        myLesson.oneCouldBeRight(12, 12, 13);
    }


}
