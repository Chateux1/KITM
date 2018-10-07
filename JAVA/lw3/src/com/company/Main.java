package com.company;

public class Main {

    public static void main(String[] args) {

        int[] values = {5,4,3,-1,-5,-2,8,5,-22};

        Input input = new Input();
        input.allowInput();
        Number masyvas = new Number(input.returnInputArray());
        masyvas.returnParameters();
        masyvas.returnArrays();
    }
}
