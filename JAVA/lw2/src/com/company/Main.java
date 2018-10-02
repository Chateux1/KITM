package com.company;

import java.util.Scanner;

public class Main {

    // This program asks the user to input two numbers and an operator
    // If the inputs are integers and operator is one of (+-*/)
    // then the program returns regular operation output
    // If the operator is # then a special output is given.

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("This is a program that takes two numbers and " +
                "an operator ( + , - , * , / , #) as inputs and returns the result.");
        Scanner scan = new Scanner(System.in);

        // Variables to control two while cycles
        boolean doRepeat = true, letInput = true;

        while (doRepeat) {
            while (letInput) {

                // let user input something and check if it is an integer, if not, break the cycle.
                System.out.println("Enter the first number: ");
                Number input1 = new Number();
                input1.setValue(scan.nextLine(), "first");
                if (input1.isMistake()) break;

                // let user input something and check if it is an integer, if not, break the cycle.
                System.out.println("Enter the second number: ");
                Number input2 = new Number();
                input2.setValue(scan.nextLine(), "second");
                if (input2.isMistake()) break;

                // let user input an operator
                System.out.println("Enter an operator ( + , - , * , / , # )");
                Operator operator = new Operator(scan.nextLine().charAt(0));

                // check if the second number is 0 and block the calculation if so and break the cycle
                if (input2.getValue() == 0 && operator.getOperator() == '/') {
                    System.out.println("Error, cannot divide by 0");
                    break;
                }

                if (operator.getOperator() != '#') {

                    // try to do the operation
                    double result = operator.operateNumbers(input1.getValue(), input2.getValue());

                    // if there is a valid operator then return the result
                    if (operator.isValid()) {

                        System.out.println("Output of the operation: ");
                        System.out.println(input1.getValue() + " " + operator.getOperator() + " " + input2.getValue() + " = " + result);
                    }
                    break;
                }
                // give a special output if the operator is #
                if (operator.getOperator() == '#') {

                    // make first input double for division
                    double in1 = input1.getValue();
                    int in2 = input2.getValue();

                    // check if first input is not zero for normal operation
                    if (in1 == 0) {
                        System.out.println("First number cannot be 0 for proper division!");
                        break;
                    }

                    // Special output for # operator
                    for (int i = 13; i <= 25; i++) {

                        double out = in1 * in2 + (in2 - in1) / in1 * i;
                        if (out < 6) System.out.println(in1 + " * " + in2 + " + ( " + in2 + " - " + in1 + " ) / " + in1 + " * " + i + " = " + out + " < 6");
                        else if (out == 6) System.out.println(in1 + " * " + in2 + " + ( " + in2 + " - " + in1 + " ) / " + in1 + " * " + i + " = " + out + " < 6");
                        else if (out > 6) System.out.println(in1 + " * " + in2 + " + ( " + in2 + " - " + in1 + " ) / " + in1 + " * " + i + " = " + out + " < 6");
                        else System.out.println("Somekind of error");
                    }
                    break;
                }
            }

            // initiate additional functions
            Functions functions = new Functions();

            // #1
            boolean result1 = functions.ReturnNoParameters();
            System.out.println("Return of the function: " + result1);

            // #2
            int input1 = 15;
            int input2 = 20;
            int result2 = functions.ReturnWithParameters(input1, input2);
            System.out.println("Input1: " + input1 + " Input2: " + input2 + " Result: " + result2);

            // #3
            functions.noReturnNoParameters();

            // #4
            int input3 = 33;
            functions.noReturnWithParameters(input3);

            // exam
            int loopCount = 100;
            String[] out = functions.examFunction(15,7, loopCount);
            for (int i = 0; i < loopCount-9; i++) {

                System.out.println(out[i]);
            }

            // allow user to choose if he wants to restart the program
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
