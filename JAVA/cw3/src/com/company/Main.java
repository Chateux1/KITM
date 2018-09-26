package com.company;

public class Main {

    public static void main(String[] args) {
        Darbuotojas saulius = new Darbuotojas();

        saulius.setMoketinasAtlyginimas(2550, 1000);
        System.out.println(saulius.getMoketinasAtlyginimas());
    }
}
