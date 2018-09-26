package com.company;

public class Darbuotojas {

    private int bazineNorma;
    private int bazinisAtlyginimas;
    private int pagamintaDetaliu;
    private double moketinasAtlyginimas;
    private double atlyginimoKoeficientas;

    Darbuotojas() {
        this.bazineNorma = 2000;
    }

    public void setBazineNorma(int bazineNorma) {
        this.bazineNorma = bazineNorma;
    }

    public int getBazineNorma() {
        return this.bazineNorma;
    }

    public int getBazinisAtlyginimas() {
        return this.bazinisAtlyginimas;
    }

    public void setBazinisAtlyginimas(int bazinisAtlyginimas) {
        this.bazinisAtlyginimas = bazinisAtlyginimas;
    }

    public int getPagamintaDetaliu() {
        return this.pagamintaDetaliu;
    }

    public void setPagamintaDetaliu(int pagamintaDetaliu) {
        this.pagamintaDetaliu = pagamintaDetaliu;
    }

    public double getAtlyginimoKoeficientas() {
        return this.atlyginimoKoeficientas;
    }

    public void setAtlyginimoKoeficientas(double atlyginimoKoeficientas) {
        this.atlyginimoKoeficientas = atlyginimoKoeficientas;
    }

    public void setMoketinasAtlyginimas() {

        int detales = this.getPagamintaDetaliu();
        int norma = this.getBazineNorma();

        if (detales < norma) {
            this.setAtlyginimoKoeficientas(0.5);
        }
        else if (norma <= detales && detales < norma + 500 ) {
            this.setAtlyginimoKoeficientas(1.0);
        }
        else if (detales >= norma + 500) {
            this.setAtlyginimoKoeficientas(1.5);
        }
        this.moketinasAtlyginimas = this.getPagamintaDetaliu() * this.getAtlyginimoKoeficientas();
    }

    public double getMoketinasAtlyginimas() {

        return this.moketinasAtlyginimas;
    }
}
