package com.fundamentals.lessons;

/* Lesson - Using Arrays */
public class Lesson9 {

    // An array of int values
    public void basicIntArray() {
        int[] intArray = {23, 45, 12, 8, 92, 103, 37};
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    // An array of Strings
    public void basicStringArray() {
        String[] dayArray = new String[4];
        dayArray[0] = "Happy";
        dayArray[1] = "Monday";
        dayArray[2] = "Movie";
        dayArray[3] = "Day";

        for(int i = 0; i < dayArray.length; i++) {
            System.out.println(dayArray[i]);
        }
    }

    // Enhance for loop
    public void enhancedForArray() {
        int[] intArray = {23, 45, 12, 8, 92, 103, 37};
        for(int number : intArray) {
            System.out.print(number + ", ");
        }
    }

    /* Two-dimensional Array */
    public void aTwoDimensionalArray() {
        int[][] myArray = new int[2][2];
        myArray[0][0] = 23;
        myArray[0][1] = 35;
        myArray[1][0] = 45;
        myArray[1][1] = 57;

        for(int i = 0; i < myArray.length; i++) {
            for(int j = 0; j < myArray[i].length; j++) {
                System.out.println("["+i+"]" + "["+j+"] = " +
                        myArray[i][j]);
            }
        }
    }

    public void enhanced2DArray() {
        int[][] myArray = {{23,45} , {35,46}};
        for(int[] values : myArray) {
            for(int number : values) {
                System.out.println(number);
            }
        }
    }

    /* Jagged Array */
    public void jaggedArray() {
        String[][] months = new String[1][3];
        months[0][0] = "June";
        months[0][1] = "July";
        months[0][2] = "August";

        for(String[] summer : months) {
            for(String month : summer) {
                System.out.println(month);
            }
        }
    }

    public static void main(String[] args) {
        Lesson9 myLesson = new Lesson9();
        myLesson.basicIntArray();
        myLesson.basicStringArray();
        myLesson.enhancedForArray();
        System.out.println();
        myLesson.aTwoDimensionalArray();
        myLesson.enhanced2DArray();
        myLesson.jaggedArray();
    }

}
