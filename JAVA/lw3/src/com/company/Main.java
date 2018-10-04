package com.company;

public class Main {

    public static void main(String[] args) {
        int[] values = {5,4,3,-1,-5};
        Number masyvas = new Number(values);
        System.out.println(masyvas.getEvenCount());
        System.out.println(masyvas.getEvenSum());
    }
}
