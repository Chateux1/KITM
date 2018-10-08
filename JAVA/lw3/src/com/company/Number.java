package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Number {

    private int[] values, originalValues;
    private int evenCount, evenSum, minIndex, maxIndex;
    private ArrayList<Integer> evenValues;

    public Number(int[] values) {
        this.originalValues = values.clone();
        this.values = values.clone();
        this.evenCount =0;
        this.evenSum = 0;
        this.setParameters();
        this.swapMinMax();
    }
    public void returnParameters() {
        System.out.println();
        System.out.print("Sum of even array numbers  :    ");
        System.out.print(this.getEvenSum());
        System.out.print("    (Array of even values: ");
        System.out.println(this.getEvenValueArray() + ")");
        System.out.print("Count of even array numbers:    ");
        System.out.println(this.getEvenCount());
        System.out.print("Average of even array numbers:  ");
        System.out.println(this.returnEvenAverage());
    }
    private int getEvenSum() {
        return this.evenSum;
    }
    private int getEvenCount() {
        return this.evenCount;
    }

    private double returnEvenAverage() {
        double sum = this.getEvenSum();
        return sum / this.getEvenCount();
    }
    public void returnArrays() {
        System.out.println();
        System.out.print("Original array: ");
        System.out.println(Arrays.toString(this.getOriginalArray()));
        System.out.print("Modified array: ");
        System.out.println(Arrays.toString(this.getModifiedArray()));
    }
    private int[] getOriginalArray() {
        return this.originalValues;
    }
    private int[] getModifiedArray() {
        return this.values;
    }
    private ArrayList<Integer> getEvenValueArray() {
        return this.evenValues;
    }
    private void setValue(int index, int value) {
        this.values[index] = value;
    }
    private void setParameters() {
        this.setEvenSum();
        this.setEvenCount();
    }
    private void setEvenSum() {
        this.evenValues = new ArrayList<>();
        for (int i = 0; i < this.getModifiedArray().length; i++) {
            if (this.getModifiedArray()[i] % 2 == 0) {
                this.evenSum += this.getModifiedArray()[i];
                this.evenValues.add(this.getModifiedArray()[i]);
            }
        }
    }
    private void setEvenCount() {
        for (int i = 0; i < this.getModifiedArray().length; i++) {
            if (this.getModifiedArray()[i] % 2 == 0) {
                this.evenCount++;
            }
        }
    }
    private void swapMinMax() {
        this.setMinIndex();
        this.setMaxIndex();
        int minValue = this.getModifiedArray()[this.minIndex];
        this.setValue(this.minIndex,this.getModifiedArray()[this.maxIndex]);
        this.setValue(this.maxIndex, minValue);
    }
    private void setMinIndex() {
        int minValue = 0;
        for (int i = 0; i < this.getModifiedArray().length; i++) {
            if (this.getModifiedArray()[i] < minValue) {
                minValue = this.getModifiedArray()[i];
                this.minIndex = i;
            }
        }
    }
    private void setMaxIndex() {
        int maxValue = 0;
        for (int i = 0; i < this.getModifiedArray().length; i++) {
            if (this.getModifiedArray()[i] > maxValue) {
                maxValue = this.getModifiedArray()[i];
                this.maxIndex = i;
            }
        }
    }
}
