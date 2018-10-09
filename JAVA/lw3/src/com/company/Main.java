package com.company;

public class Main {

    public static void main(String[] args) {
        //Input input = new Input();
        //input.allowInput();
        //Number masyvas = new Number(input.returnInputArray());
        int[] array = {5,-6,1,3,11,-13,2,-8,16,5};
        Number masyvas = new Number(array);
        masyvas.returnParameters();
        masyvas.returnArrays();
        masyvas.getMaxOdd();

    }
}
