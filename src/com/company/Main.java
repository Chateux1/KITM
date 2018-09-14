package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Initialise objects
        Multiplicator multiplicator = new Multiplicator();
        Scanner readInput = new Scanner(System.in);

        //Get input
        int input = readInput.nextInt();

        //Set input to class variable for further use
        multiplicator.setInputNumber(input);

        //Print the input number stored in class to check if working
        System.out.println(multiplicator.getInputNumber());
    }
}
