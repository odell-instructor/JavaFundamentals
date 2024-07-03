package com.fundamentals.lessons;

import java.util.*;

/* Lesson - The Collections Framework*/
public class Lesson10 {

    /* ArrayList */
    public void stringArrayList() {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Happy");
        myList.add("Tuesday");
        myList.add("Not Monday");
        myList.add("Where's Friday");

        System.out.println(myList.get(1));
        System.out.println(myList.contains("Not Monday"));
        System.out.println(myList.size());

        for(String day : myList) {
            //System.out.println(day);
            if(day.contains("day")) {
                System.out.println(day);
            }
        }
    }

    /* HashSet */
    public void myFireworks() {
        HashSet<String> fireworks = new HashSet<>();
        fireworks.add("Firecrackers");
        fireworks.add("Sparklers");
        fireworks.add("Fountains");
        fireworks.add("Quarter Stick");
        fireworks.add("Smoke Bombs");
        fireworks.add("Mortars");

        Iterator<String> init = fireworks.iterator();
        while(init.hasNext()) {
            System.out.println(init.next());
        }
    }

    /* HashSet dynamic list */
    public HashSet<Integer> myThreeList(int count) {
        HashSet<Integer> myList = new HashSet<>();
        for(int i = 0; i <= count; i++) {
            if(i % 3 == 0) {
                myList.add(i);
            }
        }
        return myList;
    }

    public void getThreeList() {
        HashSet<Integer> list = myThreeList(45);
        for(int number : list) {
            System.out.println(number);
        }
    }

    /* HashMap */
    public void exampleHashMap() {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(10, "Happy");
        myMap.put(15, "Days");
        myMap.put(20, "Are Here");
        myMap.put(25, "Happy");

        for(Map.Entry<Integer, String> beta : myMap.entrySet()) {
            System.out.println(beta.getKey() + " - " +
                    beta.getValue());
        }
    }

    /* LinkedList - using the Queue Interface */
    public void exampleLinkedList() {
        Queue<String> myLinked = new LinkedList<>();
        myLinked.add("Pasta");
        myLinked.add("Alfredo");
        myLinked.add("Spaghetti");
        myLinked.add("Macaroni");
        myLinked.add("Linguini");
        myLinked.add("Egg Noodles");

        String something = myLinked.peek();
        String other = myLinked.poll();
        System.out.println("This keeps " + something +
                " and this removes " + other);

        for(String food : myLinked) {
            System.out.println(food);
        }
    }

    public static void main(String[] args) {
        Lesson10 myLesson = new Lesson10();
        myLesson.stringArrayList();
        myLesson.myFireworks();
        myLesson.getThreeList();
        myLesson.exampleHashMap();
        myLesson.exampleLinkedList();
    }

}
