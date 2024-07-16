package com.fundamentals.lessons;
import java.util.Random;

/* Lesson - Primitive Data Types */
/* These data types don't share state like objects */
public class Lesson4 {

    /* This primitive can be 1 of 2 states.
     True or False*/
    boolean isValue = true;

    /* This primitive type has a value range of
    * -128 to 127. The class version is Byte */
    byte myByte = 9;

    /* This primitive type has a value range of
    * -32768 to 32767. The class version is Short */
    short myShort = 235;

    /* This primitive type has a value range of
    * -2,147,483,648 to 2,147,483,647.
    * The class version is Integer */
    int myInt = 2345;

    /* This primitive type has a value range of
    * -9,223,372,036,854,775,808 to
    * 9,223,372,036,854,775,807
    * The class version is Long */
    long myLong = 56864L;

    /*The primitive type has a value range of
    * -3.4E-38 to 3.4+38. The suffix is f or F
    * The class version is Float */
    float myFloat = 34.53F;

    /* The primitive type has a value range of
    * 1.7E-308 to 1.7E+308. The suffix d or D is optional.
    * The clas version is Double */
    double myDouble = 84.98;
    double myOtherDouble = 36.43d;

    // Scientific Notation uses E or e
    double myNotation = 23.65E8;

    /* Numeric Systems - Value of 26 */
    int myDecimal = 26;

    int myHexadecimal = 0x1a;

    int myBinary = 0b11010;

    /* Using underscores to make numbers readable */
    long usingUnderscores = 4_568_987_367L;

    /* Data type conversion is the concept of
    * converting between different primitive data types
    * When going from a floating point number to an int
    * or other whole data type, there is no rounding. */

    /* Implicit or Widening type conversion is done when
    * two data types automatically convert*/
    public void convertDirectly() {
        long converted = myInt;
        float value = usingUnderscores;
        short small = myByte;
        System.out.println("My samples are " + converted +
                " & " + value);
        System.out.format("My short variable is %d", small);
    }

    /* Explicit or Narrowing type conversion is done when
    two data types convert, but require a direct boxing
    affect. This is because a larger data type is converting
    to a smaller one, which will have precision loss.
    * */
    public void convertExplicitly() {
        long sample = (long)myDouble;
        int sample2 = (int)myLong;
        byte sample3 = (byte)myFloat;

        System.out.format("My sample is %d%n", sample);
        System.out.format("My sample2 is %d%n", sample2);
        System.out.format("My sample3 is %d%n", sample3);
    }

    /* The Math class provides methods for Math
    calculations along with a method called random.
     The random method returns a double by default.
     A value greater than 0.0 and less than 1.0. */
    public double getSampleRandom() {
        return Math.random();
    }

    /* Random method with explicit cast to int
    * and multiply the value by 10*/
    public int sampleRandomInt() {
        // Random between 0 and 9
        return (int)(Math.random() * 10);
    }

    /* Random method & round method of the Math
    * class to return a long rounded up. */
    public long sampleRandomLong() {
        return Math.round(Math.random() * 100);
    }

    /* Part of the java.util package. Produces a
    * stream of pseudorandom numbers. */
    public void sampleRandom1() {
        Random ra = new Random();
        int num = ra.nextInt();
        System.out.println(num);

        double beta = ra.nextDouble(23.5);
        System.out.println(beta);
    }

    /* Using the constructor with a value, it becomes
    * a seed. This seed is used as an internal algorithm
    * for calculating the value. */
    public void sampleRandom2() {
        Random random = new Random(8166488888L);
        int val1 = random.nextInt();
        System.out.println(val1);
        int val2 = random.nextInt();
        System.out.println(val2);
    }

    public static void main(String[] args) {
        Lesson4 myLesson = new Lesson4();
        myLesson.convertDirectly();
        myLesson.convertExplicitly();
        System.out.println();
        double myRandom = myLesson.getSampleRandom();
        System.out.println(myRandom);
        System.out.println(myLesson.sampleRandomInt());
        System.out.println(myLesson.sampleRandomLong());
        myLesson.sampleRandom1();
        myLesson.sampleRandom2();
    }

}
