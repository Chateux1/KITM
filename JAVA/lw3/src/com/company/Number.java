package com.company;

public class Number {

    private int[] values;
    private int[] editedValues;
    private int evenCount;
    private int evenSum;

    public Number(int[] values) {
        this.values = values;
        this.evenCount = 0;
        this.evenSum = 0;
    }
    public int[] getValues() {
        return this.values;
    }
    public int getEvenCount() {
        return this.evenCount;
    }
    public int getEvenSum() {
        return this.evenSum;
    }
    private double calculateEvenAverage() {
        return this.getEvenSum() / this.getEvenCount();
    }
    private void setEvenCount() {
        for (int i = 0; i < this.getValues().length; i++) {
            if (this.getValues()[i] % 2 == 0) {
                this.evenCount++;
            }
        }
    }
    private void setEvenSum() {
        for (int i = 0; i < this.getValues().length; i++) {
            if (this.getValues()[i] % 2 == 0) {
                this.evenSum += this.getValues()[i];
            }
        }
    }
}
