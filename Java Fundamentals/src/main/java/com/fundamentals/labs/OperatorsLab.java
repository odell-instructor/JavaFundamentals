package com.fundamentals.labs;

public class OperatorsLab {

    public void mathProblem(){
        int total = (10 + 32) * 12 / 3;
        int altTotal = 10 + 32 * 12 / 3;
        System.out.println("Total " + total);
        System.out.println("Alt Total "+ altTotal);
    }

    public static void main(String[] args) {
        OperatorsLab myLab = new OperatorsLab();
        myLab.mathProblem();
    }
}
