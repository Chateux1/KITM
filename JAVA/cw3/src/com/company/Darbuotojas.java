package com.company;

public class Darbuotojas {

    private static int bazineNorma = 2000;
    private int bazinisAtlyginimas;
    private int pagamintaDetaliu;
    private double moketinasAtlyginimas;

    public void setMoketinasAtlyginimas(int pagamintaDetaliu, int bazinisAtlyginimas) {

        double atlyginimoKoeficientas = 0;

        if (pagamintaDetaliu < 2000) atlyginimoKoeficientas = 0.5;
        else if (2000 < pagamintaDetaliu && pagamintaDetaliu < 2500 ) atlyginimoKoeficientas = 1.0;
        else if (pagamintaDetaliu >= 2500) atlyginimoKoeficientas = 1.5;
        else atlyginimoKoeficientas = 1.5;

        this.moketinasAtlyginimas = bazinisAtlyginimas * atlyginimoKoeficientas;
    }

    public double getMoketinasAtlyginimas() {

        return this.moketinasAtlyginimas;
    }
}
