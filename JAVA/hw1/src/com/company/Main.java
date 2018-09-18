package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declare and initialise variables with the necessary default values
        String input;
        String apibudinimas;
        boolean testiDarba = true, klaida;
        Scanner reader = new Scanner(System.in);

        //while condition for grade evaluation to text
        while (testiDarba) {

            System.out.println("Įveskite pažymį (1-10): ");

            //read input
            input = reader.next();

            //set text according to the input
            if ("1".equals(input)) {
                apibudinimas = "Netenkinami minimalūs reikalavimai";
            } else if ("2".equals(input)) {
                apibudinimas = "Netenkinami minimalūs reikalavimai";
            } else if ("3".equals(input)) {
                apibudinimas = "Netenkinami minimalūs reikalavimai";
            } else if ("4".equals(input)) {
                apibudinimas = "Netenkinami minimalūs reikalavimai";
            } else if ("5".equals(input)) {
                apibudinimas = "Žinios ir gebėjimai (įgūdžiai) tenkina minimalius reikalavimus";
            } else if ("6".equals(input)) {
                apibudinimas = "Žinios ir gebėjimai (įgūdžiai) žemesni nei vidutiniai, yra klaidų";
            } else if ("7".equals(input)) {
                apibudinimas = "Vidutinės žinios ir gebėjimai, yra neesminių klaidų";
            } else if ("8".equals(input)) {
                apibudinimas = "Geresnės nei vidutinės žinios ir gebėjimai";
            } else if ("10".equals(input)) {
                apibudinimas = "Tvirtos, geros žinios ir gebėjimai";
            } else if ("10".equals(input)) {
                apibudinimas = "Puikios, išskirtinės žinios ir gebėjimai";
            } else {
                apibudinimas = "Klaida";
            }

            //print out the grade evaluation or "Klaida" for error
            System.out.println(apibudinimas);

            //set the value to true so that the cycle would run at least once
            klaida = true;

            //cycle to check whether to restart
            while (klaida == true) {

                System.out.println("Tęsti darbą? (y/n): ");

                //read input
                input = reader.next();

                //condition to check the input and set variable to restart or terminate the program
                if ("n".equals(input)) {
                    testiDarba = false;
                    klaida = false;
                    System.out.println("Programa išjungiama");
                } else if ("y".equals(input)) {
                    testiDarba = true;
                    klaida = false;
                } else {
                    System.out.println("Klaida");
                    klaida = true;
                }
            }
        }
    }
}
