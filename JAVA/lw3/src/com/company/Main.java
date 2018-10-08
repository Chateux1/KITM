package com.company;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        input.allowInput();
        Number masyvas = new Number(input.returnInputArray());
        masyvas.returnParameters();
        masyvas.returnArrays();
    }
}
