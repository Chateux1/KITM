package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Sukuriamas naujas objektas ir išsaugomas į duomenų bazę.
        Knyga knyga1 = new Knyga("Antanas", "Petrauskas", 1999, 3, "Pavadinimas");
        KnygaDAO.insert(knyga1);

        //Atliekama įrašų paieška pagal knygos pavadinimą.
        ArrayList<Knyga> knygosList = new ArrayList<>();
        knygosList = KnygaDAO.searchByBookTitle("Mein Kampf");
        for (int i = 0; i < knygosList.size(); i++ ) {
            System.out.println(knygosList.get(i).toString());
        }

        //Atliekamas įrašo redagavimas
        Knyga knyga3 = knygosList.get(0);
        Knyga knyga2 = KnygaDAO.searchById(32).get(0);
        knyga3.setIsleidimo_metai(2001);
        KnygaDAO.edit(knyga3);

        //Išvedama kiek knygų buvo atspausdinta nurodytais metais:
        int isleidimo_metai = 1999;
        System.out.print(KnygaDAO.knyguIsleidimoMetai(isleidimo_metai));
        System.out.print(" - tiek knygų buvo atspausdinta " + isleidimo_metai + " metais.");
        System.out.println("");

        //Trinamas įrašas pagal id numerį.
        KnygaDAO.delete(11);

    }
}
