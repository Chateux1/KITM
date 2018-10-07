package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {

    private Scanner scan;
    private ArrayList<Integer> inputArray;

    public Input() {
        inputArray = new ArrayList<Integer>();
        scan = new Scanner(System.in);
    }
    private boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    private void addIntegerInput(String input) {
        int number = Integer.parseInt(input);
        this.inputArray.add(number);
        System.out.println("Number " + number + " added to array");
    }
    public void allowInput() {
        boolean addMore = true, letInput = true;
        String input = "";
        while(addMore) {
            while (letInput) {
                System.out.println("Enter a number: ");
                input = scan.next();
                if (isInteger(input)) addIntegerInput(input);
                else System.out.println("There was a error");
                letInput = false;
            }

            System.out.println("Add more? (y/n):");
            char answer = scan.next().charAt(0);
            switch (answer) {
                case 'y' : letInput = true; break;
                case 'n' : addMore = false; break;
                default : letInput = false; break;
            }
        }
        System.out.println("Input to the array was stopped.");
        System.out.print("Your array: ");
        System.out.println(this.inputArray);
    }
    public int[] returnInputArray() {
        int[] array = new int[this.inputArray.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = this.inputArray.get(i);
        }
        return array;
    }
}
