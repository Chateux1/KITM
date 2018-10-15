package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int knyguSkaicius = 10;
        Knyga[] knygos = new Knyga[knyguSkaicius];
        for (int knyga = 0; knyga < knyguSkaicius; knyga++ ) {
            knygos[knyga] = new Knyga(new SugeneruotiDuomenys());
        }
        Lentele lentele = new Lentele(knygos);
    }


}
