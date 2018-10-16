package com.company;

public class Automobilis {

    private String marke, spalva;
    private int pagaminimoMetai, duruSkaicius, rida;
    private boolean arElektromobilis;

    public Automobilis(
            String marke,
            String spalva,
            int pagaminimoMetai,
            int duruSkaicius,
            int rida,
            boolean arElektromobilis) {

        this.marke = marke;
        this.spalva = spalva;
        this.pagaminimoMetai = pagaminimoMetai;
        this.duruSkaicius = duruSkaicius;
        this.rida = rida;
        this.arElektromobilis = arElektromobilis;
    }

    public String getMarke() {
        return this.marke;
    }

    public String getSpalva() {
        return this.spalva;
    }

    public int getPagaminimoMetai() {
        return this.pagaminimoMetai;
    }

    public int getDuruSkaicius() {
        return this.duruSkaicius;
    }

    public int getRida() {
        return this.rida;
    }

    public boolean isArElektromobilis() {
        return this.arElektromobilis;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }

    public void setPagaminimoMetai(int pagaminimoMetai) {
        this.pagaminimoMetai = pagaminimoMetai;
    }

    public void setDuruSkaicius(int duruSkaicius) {
        this.duruSkaicius = duruSkaicius;
    }

    public void setRida(int rida) {
        this.rida = rida;
    }

    public void setArElektromobilis(boolean arElektromobilis) {
        this.arElektromobilis = arElektromobilis;
    }
}
