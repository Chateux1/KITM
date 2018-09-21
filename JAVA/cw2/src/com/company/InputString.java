package com.company;

public class InputString {

    private char[] charOperators;
    private char currentOperator;
    private int intOperatorPosition, inputLeft, inputRight;
    private String strInput;

    public InputString(String input, char[] operators) {

        this.strInput = input;
        this.charOperators = operators;
        this.intOperatorPosition = -1;
    }

    public void setInputLeft(int input) {

        this.inputLeft = input;
    }

    public void setInputRight(int input) {

        this.inputRight = input;
    }

    public int getInputLeft() {

        return this.inputLeft;
    }

    public int getInputRight() {

        return this.inputRight;
    }

    public char getCurrentOperator() {

        return this.currentOperator;
    }

    public void setCurrentOperator(char operator) {

        this.currentOperator = operator;
    }

    public void setOperatorPosition(int index) {

        this.intOperatorPosition = index;
    }

    public String getString() {

        return this.strInput;
    }

    public char[] getOperatorArray() {

        return this.charOperators;
    }

    public int getInputLength() {

        return this.strInput.length();
    }

    public int getOperatorCount() {

        return this.charOperators.length;
    }

    public int getOperatorPosition() {

        return this.intOperatorPosition;
    }

    public int countOperatorOccurrences() {

        int count = 0;
        for (int stringItem = 0; stringItem < getInputLength(); stringItem++) {

            for (int charItem = 0; charItem < getOperatorCount(); charItem++) {

                if (getString().charAt(stringItem) == getOperatorArray()[charItem]) {
                    this.setOperatorPosition(stringItem);
                    this.setCurrentOperator(getOperatorArray()[charItem]);
                    count++;
                }
            }
        }
        return count;
    }

    public boolean checkStringToInteger(String testStr) {

        try {
            int testInt = Integer.parseInt(testStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}