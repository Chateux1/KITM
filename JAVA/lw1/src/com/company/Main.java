package com.company;

import java.util.Scanner;

public class Main {

    public static boolean isInteger (String inputString) {

        try {
            Integer.parseInt(inputString);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean isInteger(char inputChar) {

        String inputString = Character.toString(inputChar);
        try {
            Integer.parseInt(inputString);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        char[] mathOperator = {'+', '-', '*', '/'};
        String input1Str = "", input2Str = "", inputSign;
        int input1 = 0, input2 = 0;
        int indexOperator = 0;
        boolean nextIsNumber = true;
        boolean isMistake = false;
        while(nextIsNumber) {
            System.out.println("Hello");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            //System.out.println(input);
            input = input.replaceAll("\\s+", "");

            int i = 0;
            for(i = 0; i < input.length(); i++) {
                if (!isInteger(input.charAt(i))) {
                    break;
                }
            }

            input1Str = input.substring(0,i);

            if (isInteger(input.charAt(i+1))) {
                for(int j = i; j < input.length(); j++) {
                    if (!isInteger(input.charAt(j))) {
                        break;
                    }
                }
            } else {
                System.out.println("Klaidu klaida");
            }



            for (int j = 0; j < mathOperator.length; j++) {
                char operator = input.charAt(i);
                switch (operator) {
                    case '+':
                        indexOperator = 0;
                        break;
                    case '-':
                        indexOperator = 1;
                        break;
                    case '*':
                        indexOperator = 2;
                        break;
                    case '/':
                        indexOperator = 3;
                        break;
                    default:
                        indexOperator = -1;
                        break;



                }
            }

            System.out.println(input1Str);
        }
    }
}
