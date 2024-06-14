package com.fundamentals.lessons;

// Lesson - All about String
/* String objects are immutable. This means
* once the value is set, it cannot be changed
* Instead, it creates a new string object.*/
public class Lesson3 {
    // field or instance variable
    String note = "Welcome to Lesson 3";

    // Assign a new reference to the above field
    String secondNote = note;

    /* This method returns a joined String to
     * where it was called from. The empty
     * parenthesis is to ensure a space between them.*/
    public String joinWelcome(String message) {
        return note + " " + message;
    }

    /* charAt returns a single character based
    * on the specified index of the string.
    * Each character of the string is represented
    * by a numeric index value starting at 0. */
    public void indexNote(int index) {
        System.out.println(note.charAt(index));
    }

    /* concat joins two strings together as
    * concatenation. The same as the joinWelcome
    * method above.*/
    public void anotherJoin(String msg) {
        System.out.println(note.concat(msg));
    }

    /* equals compares the string to a specified
    * object */
    public void areWeAlike(String value1, String value2) {
        System.out.println(value1.equals(value2));
    }

    /* toLowerCase & toUpperCase will change all
     characters. */
    public void differentCase() {
        String lower = note.toLowerCase();
        String upper = note.toUpperCase();
        System.out.println(lower);
        System.out.println(upper);
    }

    /* length will return the number of characters
    * including empty spaces */
    public void howLongAmI(String value) {
        System.out.println("We are " + value.length());
    }

    /* replace will replace all instances
     of from with to*/
    public String changeMyMessage(String word) {
        return note.replace("to", word);
    }

    /* String builder allow  you to join objects
    * or primitives together into a variable
    * type array or list. */
    public void favoriteThings(String color, String food) {
        StringBuilder builder = new StringBuilder();
        builder.append("My favorite food is ");
        builder.append(food);

        StringBuilder builder2 = new StringBuilder();
        builder2.append("My favorite color is ").append(color);

        builder.append(" & ").append(builder2);
        System.out.println(builder.toString());
    }
    

    public static void main(String[] args) {
        Lesson3 myLesson = new Lesson3();
        String value = myLesson.joinWelcome("learning String");
        System.out.println(value);
        myLesson.indexNote(2);
        myLesson.anotherJoin(" All about String");
        myLesson.areWeAlike("Hello", "Hello");
        //myLesson.differentCase();
        myLesson.howLongAmI("Welcome");
        String message = myLesson.changeMyMessage("two");
        System.out.println(message);
    }

}
