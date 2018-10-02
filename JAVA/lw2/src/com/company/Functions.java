package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Functions {

    private Scanner input;

    public Functions() {

        input = new Scanner(System.in);
        System.out.println("These are functions for the second laboratory work: ");
    }

    public boolean ReturnNoParameters() {

        System.out.println("Function #1");
        System.out.println("Do you want to retry? (y/n): ");
        char answer = input.nextLine().charAt(0);
        switch (answer) {

            case 'y' : return true;
            case 'n' : return false;
            default : return false;
        }
    }

    public int ReturnWithParameters(int num1, int num2) {

        System.out.println("Function #2");
        return num1 + num2;
    }

    public void noReturnNoParameters() {

        System.out.println("Function #3");
        String output = input.nextLine();
        System.out.println("Your message: " + output);
    }

    public void noReturnWithParameters(int number) {

        System.out.println("Function #4");
        System.out.println("This is your number: " + number + " and a random number: " + Math.random());
    }

    public String[] examFunction(int num1, int num2, int loopCount) {

        String[] output = new String[loopCount];

        for (int i = 0; i < loopCount - 9; i++) {

            int j = i + 9;
            double result = (num1 + num2) / j - (num1 - num2);
            String message = "(" + num1 + " + " + num2 + ") / " + j + " - (" + num1 + " - " + num2 + ") = ";
            if (result > 0.25) {
                output[i] = message + result + " > 0.25";
            } else if (result < 0.25) {
                output[i] = message + result + " < 0.25";
            } else if (result == 0.25) {
                output[i] = message + result + " == 0.25";
            } else {}
        }

        return output;
    }
}
