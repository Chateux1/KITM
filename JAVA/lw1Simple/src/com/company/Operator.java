package com.company;

public class Operator {

    private char operator;

    public Operator(char operator) {

        this.operator = operator;
    }

    public char getOperator() {

        return this.operator;
    }

    public double operateNumbers(int number1, int number2) {

        double doubleNumber1 = number1;
        double output = 0;
        switch(this.getOperator()) {

            case '+' : output = doubleNumber1 + number2; break;
            case '-' : output = doubleNumber1 - number2; break;
            case '*' : output = doubleNumber1 * number2; break;
            case '/' : output = doubleNumber1 / number2; break;
            default :
                System.out.println("Error while entering an operator");
                output = -1;
                break;
        }
        return output;
    }
}
