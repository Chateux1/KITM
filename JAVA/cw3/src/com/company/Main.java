package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Darbuotojas saulius = new Darbuotojas();
        Scanner ivedimas = new Scanner(System.in);
        int bazinisAtlyginimas = 0;
        int pagamintaDetaliu = 0;

        System.out.println("Si programa skaiciuoja moketina atlyginima pagal " +
                "ivesta bazini atlyginima ir realiai pagamintu detaliu skaiciu");

        while (true) {

            System.out.println("Iveskite pagamintu detaliu skaicius: ");
            if (ivedimas.hasNextInt()) {
                saulius.setPagamintaDetaliu(ivedimas.nextInt());
                System.out.println("Ivedete detaliu skaiciu: " + saulius.getPagamintaDetaliu());
            } else {
                System.out.println("Klaida ivedant detaliu skaiciu");
                break;
            }

            System.out.println("Iveskite bazini atlyginimo dydi: ");
            if (ivedimas.hasNextInt()) {
                saulius.setBazinisAtlyginimas(ivedimas.nextInt());
                System.out.println("Ivedete bazini atlyginima: " + saulius.getBazinisAtlyginimas());
            } else {
                System.out.println("Klaida ivedant bazini atlyginima");
                break;
            }

            saulius.setMoketinasAtlyginimas();
            System.out.println("Apskaiciuotas atlyginimas: " + saulius.getPagamintaDetaliu() + " * " +
                                saulius.getAtlyginimoKoeficientas() + " = " +
                                saulius.getMoketinasAtlyginimas());

        }

    }
}
