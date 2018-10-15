package com.company;

public class Knyga {

    String pavadinimas;
    String[] autoriai;
    String zanras;
    String leidimoNumeris;
    String leidimoVieta;
    int puslapiuSkaicius;
    boolean kietiVirseliai;
    String isbnNumeris;

    public Knyga(
            String pavadinimas,
            String[] autoriai,
            String zanras,
            String leidimoNumeris,
            String leidimoVieta,
            int puslapiuSkaicius,
            boolean kietiVirseliai,
            String isbnNumeris) {

        this.pavadinimas = pavadinimas;
        this.autoriai = autoriai;
        this.zanras = zanras;
        this.leidimoVieta = leidimoVieta;
        this.puslapiuSkaicius = puslapiuSkaicius;
        this.kietiVirseliai = kietiVirseliai;
        this.isbnNumeris = isbnNumeris;
    }

    public Knyga(SugeneruotiDuomenys duomenys) {
        this.pavadinimas = duomenys.setPavadinimas();
        this.autoriai = duomenys.setAutoriai(1);
        this.zanras = duomenys.setZanras();
        this.leidimoNumeris = duomenys.setLeidimoNumeris();
        this.leidimoVieta = duomenys.setLeidimoVieta();
        this.puslapiuSkaicius = duomenys.setPuslapiuSkaicius(200, 500);
        this.kietiVirseliai = duomenys.setKietaisVirseliais(true);
        this.isbnNumeris = duomenys.setIsbnNumeris();
    }

    public String getPavadinimas() {
        return this.pavadinimas;
    }

    public String[] getAutoriai() {
        return this.autoriai;
    }

    public String getZanras() {
        return this.zanras;
    }

    public String getLeidimoNumeris() {
        return this.leidimoNumeris;
    }

    public String getLeidimoVieta() {
        return this.leidimoVieta;
    }

    public int getPuslapiuSkaicius() {
        return this.puslapiuSkaicius;
    }

    public boolean isKietiVirseliai() {
        return this.kietiVirseliai;
    }

    public String getIsbnNumeris() {
        return this.isbnNumeris;
    }

    public String[] getInfo() {
        String[] string = {
                this.getPavadinimas(),
                this.getAutoriai()[0],
                this.getZanras(),
                this.getLeidimoNumeris(),
                this.getLeidimoVieta(),
                "" + this.getPuslapiuSkaicius(),
                "" + this.isKietiVirseliai(),
                this.getIsbnNumeris()};
        return string;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public void setAutoriai(String[] autoriai) {
        this.autoriai = autoriai;
    }

    public void setZanras(String zanras) {
        this.zanras = zanras;
    }

    public void setLeidimoNumeris(String leidimoNumeris) {
        this.leidimoNumeris = leidimoNumeris;
    }

    public void setLeidimoVieta(String leidimoVieta) {
        this.leidimoVieta = leidimoVieta;
    }

    public void setPuslapiuSkaicius(int puslapiuSkaicius) {
        this.puslapiuSkaicius = puslapiuSkaicius;
    }

    public void setKietiVirseliai(boolean kietiVirseliai) {
        this.kietiVirseliai = kietiVirseliai;
    }

    public void setIsbnNumeris(String isbnNumeris) {
        this.isbnNumeris = isbnNumeris;
    }
}
