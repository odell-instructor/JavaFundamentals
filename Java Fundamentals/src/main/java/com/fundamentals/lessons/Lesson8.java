package com.fundamentals.lessons;

/* Lesson - Looping Statements */
/* 3 Key Factors; Initialized variable
 * , Condition, Increment / Decrement */
public class Lesson8 {

    /* While Loop */
    public void aLittleWhileLoop(int total) {
        int able = 0; // initialized variable
        while (able <= total) { // condition
            System.out.println(able);
            able++; // increment
        }
    }

    public void countdown() {
        int count = 10;
        while(count >= 0) {
            System.out.print(count + ", ");
            count--;
        }
        System.out.println();
    }

    /* Do while loop */
    public void aDoWhileLoop() {
        int charlie = 0;
        do {
            if(charlie % 2 == 0) {
                System.out.print(charlie + " ");
            }
            charlie++;
        } while(charlie <= 20);
        System.out.println();
    }

    /* For Loop */
    public void aForLoop() {
        for(int i = 0; i < 10; i++) {
            System.out.print(i +  " ");
        }
        System.out.println();
    }

    public void multiLoop(int first, int second) {
        for(int i = 0; i < first; i++) {
            for(int k = 0; k < second; k++) {
                System.out.print("(" + i + "," + k + ")");
            }
            System.out.println();
        }
    }

    /* Branching */
    public void branching() {
        for(int i = 0; i < 6; i++) {
            if(i == 2) {
                continue;
            }
            if(i == 4) {
                System.out.println("Loop Breaks");
                break;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Lesson8 myLesson = new Lesson8();
        myLesson.aLittleWhileLoop(5);
        myLesson.countdown();
        myLesson.aDoWhileLoop();
        myLesson.aForLoop();
        myLesson.multiLoop(3, 4);
        myLesson.branching();
    }

}
