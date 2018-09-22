package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("This is a program that takes two numbers and " +
                "an operator ( + , - , * , / ) as inputs and returns the result.");
        Scanner scan = new Scanner(System.in);
        boolean doRepeat = true, letInput = true;
        while (doRepeat) {
            while (letInput) {

                System.out.println("Enter the first number: ");
                Number input1 = new Number();
                input1.setValue(scan.nextLine(), "first");
                input1.getValue();
                if (input1.isMistake()) break;

                System.out.println("Enter the second number: ");
                Number input2 = new Number();
                input2.setValue(scan.nextLine(), "second");
                if (input2.isMistake()) break;

                System.out.println("Enter an operator ( + , - , * , / )");
                Operator operator = new Operator(scan.nextLine().charAt(0));
                if (operator.operateNumbers(input1.getValue(), input2.getValue()) == -1) break;
                if (input2.getValue() == 0 && operator.getOperator() == '/') {
                    System.out.println("Error, cannot divide by 0");
                    break;
                }
                System.out.println("Output of the operation: ");
                double result = operator.operateNumbers(input1.getValue(), input2.getValue());
                System.out.println(result);

            }
            System.out.println("Do you want to retry? (y/n): ");
            char answer = scan.nextLine().charAt(0);
            switch (answer) {

                case 'y' : letInput = true; break;
                case 'n' : doRepeat = false; break;
                default : letInput = false; break;
            }
        }
        System.out.println("Program terminating");
    }
}
