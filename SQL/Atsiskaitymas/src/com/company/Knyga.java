package com.company;

public class Knyga {

    private int id;
    private String vardas;
    private String pavarde;
    private int isleidimo_metai;
    private int leidimas;
    private String pavadinimas;

    public Knyga() {

    }

    public Knyga(String vardas, String pavarde, int isleidimo_metai, int leidimas, String pavadinimas) {

        this.vardas = vardas;
        this.pavarde = pavarde;
        this.isleidimo_metai = isleidimo_metai;
        this.leidimas = leidimas;
        this.pavadinimas = pavadinimas;
    }

    public Knyga(int id, String vardas, String pavarde, int isleidimo_metai, int leidimas, String pavadinimas) {

        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.isleidimo_metai = isleidimo_metai;
        this.leidimas = leidimas;
        this.pavadinimas = pavadinimas;
    }

    @Override
    public String toString() {
        return "Knyga{" +
                "id=" + id +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", isleidimo_metai=" + isleidimo_metai +
                ", leidimas=" + leidimas +
                ", pavadinimas='" + pavadinimas + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public void setIsleidimo_metai(int isleidimo_metai) {
        this.isleidimo_metai = isleidimo_metai;
    }

    public void setLeidimas(int leidimas) {
        this.leidimas = leidimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getId() {
        return this.id;
    }

    public String getVardas() {
        return this.vardas;
    }

    public String getPavarde() {
        return this.pavarde;
    }

    public int getIsleidimo_metai() {
        return this.isleidimo_metai;
    }

    public int getLeidimas() {
        return this.leidimas;
    }

    public String getPavadinimas() {
        return this.pavadinimas;
    }
}
