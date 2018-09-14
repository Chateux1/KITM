package com.company;

public class Multiplicator {

    private int inputNumber, multiplication, numberOfIterations;

    public void setInputNumber(int number) {
        inputNumber = number;
    }

    public int getInputNumber() {
        return inputNumber;
    }

    public void printLine(int base, int multiplicator) {

        System.out.println(base + " * " + multiplicator + " = " + base * multiplicator);
    }
    public void calculateFor(int base, int cycleEnd) {

        for(int i = 1; i < cycleEnd; i++) {
            printLine(base, i);
        }
    }

    public Multiplicator() {

    }
}

