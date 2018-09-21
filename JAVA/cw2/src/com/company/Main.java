package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello there! Please enter two INTEGER numbers and an operator " +
                "(+, -, *, /) between them as so: (2 + 3, 34 / 27, etc)");

        Scanner scan = new Scanner(System.in);

        char[] operators = {'+', '-', '*', '/'};

        InputString input = new InputString(scan.nextLine().replaceAll(" ", ""), operators);

        System.out.println(input.getString());

        String subStringLeft = new String();
        String subStringRight = new String();
        boolean mistake = false;
        switch (input.countOperatorOccurrences()) {

            case 0:
                mistake = true;
                System.out.println("No operator (+, -, *, /) was found in your input");
                break;
            case 1:
                subStringLeft = input.getString().substring(0, input.getOperatorPosition());
                subStringRight = input.getString().substring(input.getOperatorPosition() + 1, input.getInputLength());

                if (input.checkStringToInteger(subStringLeft)) {
                    input.setInputLeft(Integer.parseInt(subStringLeft));
                } else {
                    System.out.println("A mistake was found in the first number");
                    mistake = true;
                }

                if (input.checkStringToInteger(subStringRight)) {
                    input.setInputRight(Integer.parseInt(subStringRight));
                } else {
                    System.out.println("A mistake was found in the second number");
                    mistake = true;
                }
                break;

            default:
                mistake = true;
                System.out.println("More than one operator (+, -, *, /) were found in your input");
                break;
        }

        if (!mistake) {
            OperatorMap inputMap = new OperatorMap();
            inputMap.fillMap();
            double input1 = input.getInputLeft();
            double input2 = input.getInputRight();
            System.out.println(inputMap.operatorMap.get(input.getCurrentOperator()).execute(input1, input2));
        }
    }
}

