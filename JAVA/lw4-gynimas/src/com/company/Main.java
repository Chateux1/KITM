package com.company;

public class Main {

    public static void main(String[] args) {
Automobilis auto1 = new Automobilis(
                "BMW",
                "Juoda",
                2000,
                4,
                10000,
                true);
        Automobilis auto2 = new Automobilis(
                "Audi",
                "Raudona",
                2010,
                4,
                8000,
                false);
        Automobilis auto3 = new Automobilis(
                "VW",
                "Balta",
                1990,
                4,
                30000,
                false);
        Automobilis auto4 = new Automobilis(
                "Honda",
                "Þalia",
                1980,
                2,
                35000,
                false);
        Automobilis auto5 = new Automobilis(
                "Hyundai",
                "Balta",
                2015,
                2,
                2000,
                true);

        spausdinti(auto1, auto2, auto3, auto4, auto5);
    }
    public static void spausdinti(Automobilis... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("");
            System.out.print(args[i].getMarke() + " ");
            System.out.print(args[i].getSpalva() + " ");
            System.out.print(args[i].getPagaminimoMetai() + " ");
            System.out.print(args[i].getDuruSkaicius() + " ");
            System.out.print(args[i].getRida() + " ");
            System.out.print(args[i].isArElektromobilis() + " ");
        }
    }
}
