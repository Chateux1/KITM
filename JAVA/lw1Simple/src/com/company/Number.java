package com.company;

public class Number {

    private int value;
    private boolean mistake;

    public Number() {

        this.mistake = false;
        this.value = 0;
    }

    public void setNumber() {

        this.mistake = false;
        this.value = 0;
    }

    public boolean isMistake() {

        return this.mistake;
    }

    public int getValue() {

        return this.value;
    }

    public void setValue(String input, String position) {

        try {
            this.value = Integer.parseInt(input);
        } catch (Exception e) {

            System.out.println("Error while entering the " + position + " number");
            this.mistake = true;
        }
    }


}
