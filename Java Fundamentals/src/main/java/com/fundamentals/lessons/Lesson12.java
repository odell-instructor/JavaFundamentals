package com.fundamentals.lessons;

/* Lesson - Encapsulation */
public class Lesson12 {

    private String gameTitle;
    private int hoursPlayed;

    // Constructor 1 parameter
    public Lesson12(String msg) {
        System.out.println(msg);
    } // Constructor Scope

    public Lesson12(String title, int hours) {
        gameTitle = title;
        hoursPlayed = hours;
    } // Constructor scope

    public String getGameTitle() {
        return gameTitle;
    } // method scope

    public int getHoursPlayed() {
        return hoursPlayed;
    } // method scope

    public void setGameTitle(String title) {
        gameTitle = title;
    }

    public void setHoursPlayed(int hours) {
        hoursPlayed = hours;
    }

    public static void main(String[] args) {
        Lesson12 myLesson = new Lesson12("Hello World");
        myLesson.setGameTitle("Battlefield 1");
        myLesson.setHoursPlayed(149);

        Lesson12 gameLesson =
                new Lesson12("Galaga", 2000);

        System.out.println(myLesson.getGameTitle());
        System.out.println(gameLesson.getGameTitle());

    } // main scope

} // class scope
