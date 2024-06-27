package com.fundamentals.lessons;

/* Lesson - Conditional Statements */
public class Lesson7 {

    /* Basic if statement */
    public void amIGreater(int value1, int value2) {
        System.out.println("Before if");
        if(value1 >= value2) {
            System.out.println("Value1 is greater");
        }
        System.out.println("After if");
    }

    public void singleIfStatement(int num1, int num2) {
        System.out.println("Before if");
        if(num1 > num2)
            System.out.println("Num1 is greater");

        System.out.println("After if");
    }

    /* Basic if else statement */
    public void amIEqual(String msg1, String msg2) {
        if(msg1.equals(msg2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }

    public void singleIfElseExample(int value1, int value2) {
        if(value1 >= value2) System.out.println("Greater");
        else System.out.println("Not Greater");
    }

    /* if else chain */
    public String checkScores(int score) {
        if(score < 20) {
            return "Score is less than 20";
        } else if(score < 30) {
            return "Score is less than 30";
        } else if(score < 40) {
            return "Score is less than 40";
        } else {
            return "Score is greater than 39";
        }
    }

    /* And && OR || Logical Statements */
    public void oneOrTheAnd(int value) {
        // The ||
        if(value > 100 || value < 50) {
            System.out.println("Value is not" +
                    " between 100 and 50");
        }

        // The &&
        if(value % 2 == 0 && value < 30) {
            System.out.println("Value is less" +
                    " than 30 and an even number");
        }
    }

    /* Switch Statement */
    public void checkScoresCase(int score) {
        switch(score) {
            case 20:
                System.out.println("Score is 20");
                break;
            case 30:
                System.out.println("Score is 30");
                break;
            case 40:
                System.out.println("Score is 40");
                break;
            default:
                System.out.println("The score is " + score);
        }
    }


    public static void main(String[] args) {
        Lesson7 myLesson = new Lesson7();
        myLesson.amIGreater(10, 60);
        myLesson.singleIfStatement(23, 17);
        myLesson.amIEqual("Hello", "hello");
        myLesson.singleIfElseExample(21, 9);
        System.out.println(myLesson.checkScores(13));
        myLesson.oneOrTheAnd(20);
        myLesson.checkScoresCase(35);
    }

}
