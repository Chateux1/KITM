package com.company;

public class Operator {

    private char operator;
    private boolean isValid;

    public Operator(char operator) {

        this.operator = operator;
        this.isValid = false;
    }

    public char getOperator() {

        return this.operator;
    }

    public void setValid() {

        this.isValid = true;
    }

    public boolean isValid() {

        return this.isValid;
    }

    public double operateNumbers(int number1, int number2) {

        double doubleNumber1 = number1;
        double output = 0;
        switch(this.getOperator()) {

            case '+' : this.setValid(); output = doubleNumber1 + number2; break;
            case '-' : this.setValid(); output = doubleNumber1 - number2; break;
            case '*' : this.setValid(); output = doubleNumber1 * number2; break;
            case '/' : this.setValid(); output = doubleNumber1 / number2; break;
            case '#' : break;
            default :
                System.out.println("Error while entering an operator");
                output = 0;
                break;
        }
        return output;
    }
}
