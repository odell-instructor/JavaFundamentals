package com.fundamentals.lessons;

public enum Week {
    SUN(2), MON(4), TUE(6), WED(8), THU(10), FRI(12), SAT(14);

    private int dayNum;

    private Week(int value) {
        //System.out.println("Constructor called");
        dayNum = value;
    }

    public int getDayNum() {
        return dayNum;
    }

    public void someEnumMethod() {
        System.out.println("Method inside enum");
    }

}
