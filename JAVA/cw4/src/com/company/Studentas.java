package com.company;

public class Studentas {

    private int id;
    private String vardas, pavarde, grupe;

    public Studentas(String vardas, String pavarde, int id, String grupe) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.id = id;
        this.grupe = grupe;
    }

    public Studentas(String vardas) {
        this(vardas, "-",0,"-");
    }

    public Studentas(String vardas, String pavarde) {
        this(vardas, pavarde, 0, "-");
    }

    public Studentas(String vardas, String pavarde, int id) {
        this(vardas, pavarde, id, "-");
    }

    public Studentas(String vardas, String pavarde, String grupe) {
        this(vardas, pavarde, 0, grupe);
    }

    public Studentas(String vardas, int id) {
        this(vardas, "-", id, "-");
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

    public void setGrupe(String grupe) {
        this.grupe = grupe;
    }

    public int getId() {
        return this.id;
    }

    public String getGrupe() {
        return this.grupe;
    }

    public String getVardas() {
        return this.vardas;
    }

    public String getPavarde() {
        return this.pavarde;
    }

    public String[] getInfo() {
        String[] string = {this.getVardas(),this.getPavarde(),String.valueOf(this.getId()),this.getGrupe()};
        return string;
    }
}
