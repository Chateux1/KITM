package com.duomenys.spausdinimas;

import java.lang.reflect.Method;

public class LenteleZmogus {

    public String infoMetodoPavadinimas = "getInfo";
    private static final String[] antrastes = {
            "Lytis",
            "Asmens kodas",
            "Vardas",
            "Pavardė",
            "Amžius",
            "Svoris",
            "Ūgis",
            "Plaukų spalva"};
    private int[] plociai;
    private int lentelesPlotis;

    public LenteleZmogus(Object[]... args) {
        plociai = new int[8];
        this.skaiciuotiAntrasciuPlocius(antrastes);
        this.skaiciuotiPlocius(args);
        this.setLentelesPlotis();
        this.spausdintiJuosta(this.getLentelesPlotis());
        this.spausdintiAntrastes();
        this.spausdintiJuosta(this.getLentelesPlotis());
        this.spausdintiDuomenis(args);
        this.spausdintiJuosta(this.getLentelesPlotis());
    }

    public Class getObjectClass(Object obj) {
        Class cls = obj.getClass();
        return cls;
    }

    public int getLentelesPlotis() {
        return this.lentelesPlotis;
    }

    public void setLentelesPlotis() {
        this.lentelesPlotis = 0;
        for (int i = 0; i < this.getPlociai().length; i++) {
            this.lentelesPlotis += this.getPlociai()[i] + 2;
        }
        this.lentelesPlotis += this.getPlociai().length + 1;
    }

    public void spausdintiJuosta(int count) {
        System.out.println("");
        for (int i = 0; i < count; i++) {
            System.out.print("-");
        }
    }

    public void setPlociai(int index, int value) {
        this.plociai[index] = value;
    }

    public int[] getPlociai() {
        return this.plociai;
    }

    public void skaiciuotiAntrasciuPlocius(String[] antrastes) {
        for (int i = 0; i < antrastes.length; i++) {
            this.setPlociai(i, antrastes[i].length());
        }
    }

    public void skaiciuotiPlocius(Object... args) {
//        Class cls = args.getClass();
//        Method getLabel = cls.getMethod("getInfo",null);
//        String label = (String)getLabel.invoke(args, null);
//        args.getClass().getMethod("getInfo", null).invoke(args);
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].getMethod("getInfo", null).length; j++)
                if (args[i].getInfo()[j].length() > this.getPlociai()[j]) {
                    this.setPlociai(j, args[i].getInfo()[j].length());
                }
        }
    }

    public void spausdintiAntrastes() {
        System.out.println("");
        for (int i = 0; i < antrastes.length; i++) {
            System.out.print("| " + antrastes[i]);
            for (int j = antrastes[i].length(); j < this.getPlociai()[i] + 1; j++) {
                System.out.print(" ");
            }
        }
        System.out.print("|");

    }

    public void spausdintiDuomenis(Object... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("");
            for (int j = 0; j < args[i].getInfo().length; j++) {
                System.out.print("| " + args[i].getInfo()[j]);
                for (int k = args[i].getInfo()[j].length(); k < this.getPlociai()[j] + 1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.print("|");
        }
    }
}

