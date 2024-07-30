package com.fundamentals.lessons;

import com.fundamentals.House;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Lesson - Exception Handling */
public class Lesson17 {
    House ranch;

    public void exampleThrows() throws
            NullPointerException {
        System.out.println(ranch.getTotalWindows());
    }

    public void barEntry(int age) {
        if(age < 21) {
            throw new ArithmeticException(
                    "Access denied - You must" +
                    "be at least 21 to enter");
        } else {
            System.out.println("You may enter");
        }
    } // end method scope

    // try/catch
    public void exampleException() {
        try {
            System.out.println(ranch.getTotalWindows());
        } catch(NullPointerException npe) {
            System.out.println("Null point called" +
                    npe.getMessage());
        }
    } // end method scope

    public void myArrayException() {
        String[] values = {"24", "42", "54"};
        String[] names = {"Dave", "Matt", "Jody"};
        try {
            byte value = Byte.parseByte(values[1]);
            System.out.println(value);
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("Please provide" +
                    " a proper index value");
        } catch(NumberFormatException nfe) {
            System.out.println("That is not a" +
                    " correct number");
        } catch(StackOverflowError soe) {
            System.out.println("You have " +
                    "given me more than a" +
                    "byte");
        } catch (Exception e) {
            System.out.println("I dunno what" +
                    " you did " + e.getMessage());
        }
    } // end method scope

    // use finally block
    public void addNumbersV2() {
        int num1 = 0, num2 = 0, total;
        System.out.println("Enter two integers " +
                "to calculate their sum.");
        Scanner userInput = new Scanner(System.in);
        try {
            num1 = userInput.nextInt();
            num2 = userInput.nextInt();
        } catch(InputMismatchException nfe) {
            System.out.println("Please provide " +
                    "a correct number value " + nfe.getMessage());
        } finally {
            userInput.close();
        }
        total = num1 + num2;
        System.out.println("The total is "+ total);
    } // end method scope

    public static void main(String[] args) {
        Lesson17 myLesson = new Lesson17();
        //myLesson.exampleThrows();
       //myLesson.barEntry(19);
        //myLesson.exampleException();
        //myLesson.myArrayException();
        myLesson.addNumbersV2();
    }

} // end class scope
