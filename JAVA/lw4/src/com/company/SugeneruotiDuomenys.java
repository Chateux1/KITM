package com.company;

import java.util.Random;

public class SugeneruotiDuomenys {

    private String[] budvardziai = {"auksinis", "žaibiškas", "vikrusis",
            "nuožmusis", "amžinasis", "trumpiausias", "paskutinis"};

    private String[] daiktavardziai = {"kunigas", "kalnas", "lobis", "didvyris",
            "inkaras", "demonas", "herojus", "paukštis"};

    private String[] veiksmazodziai = {"bėga", "skrenda", "tirpsta", "tolsta",
            "keliauja", "mėgaujasi", "žudo", "valgo"};

    private String[] randomPabaigos = {"keliu", "tolumoje", "pabaigoje",
            "visatoje", "pergale", "mišku", "priešus", "obuolius",
            "saldainius", "saldainiais", "nuo visko", "į pergalę"};

    private String[] vardai = {"Paulius", "Petras", "Jonas", "Mykolas",
            "Saulius", "Tomas", "Vincas", "Antanas", "Pranas"};

    private String[] pavardes = {"Paulauskas", "Petrauskas", "Jonaitis",
            "Mykolaitis", "Saulėnas", "Tomavičius", "Antanavičius"};

    private String[] zanrai = {"Romanas", "Novelė", "Poezija", "Mokslinė",
            "Fantastika", "Detektyvas", "Mokomoji", "Trileris"};

    private String[] leidimoNumeriai = {"Pirmas", "Antras", "Trečias", "Ketvirtas"};

    private String[] leidimoVietos = {"Kaunas", "Vilnius", "Klaipėda", "Šiauliai"};

    private String isbnNumeris;
    private int puslapiuSkaicius;
    private boolean kietaisVirseliais;
    private Knyga knyga;

    public SugeneruotiDuomenys() {
        Knyga knyga = new Knyga(
                setPavadinimas(),
                setAutoriai(1),
                setZanras(),
                setLeidimoNumeris(),
                setLeidimoVieta(),
                setPuslapiuSkaicius(200, 500),
                setKietaisVirseliais(true),
                setIsbnNumeris());
        this.setKnyga(knyga);
    }

    private Knyga getKnyga() {
        return this.knyga;
    }

    private void setKnyga(Knyga knyga) {
        this.knyga = knyga;
    }

    private int vienasIs(String[] sarasas) {
        return new Random().nextInt(sarasas.length);
    }

    public String setPavadinimas() {
        int numeris = this.vienasIs(this.budvardziai);
        String pirmasZodis = this.getBudvardis(numeris);
        String pavadinimas = pirmasZodis.substring(0, 1).toUpperCase() + pirmasZodis.substring(1) + " ";
        numeris = this.vienasIs(this.daiktavardziai);
        pavadinimas += this.getDaiktavardis(numeris) + " ";
        numeris = this.vienasIs(this.veiksmazodziai);
        pavadinimas += this.getVeiksmazodis(numeris) + " ";
        numeris = this.vienasIs(this.randomPabaigos);
        pavadinimas += this.getRandomPabaiga(numeris);
        return pavadinimas;
    }

    public String[] setAutoriai(int autoriuSkaicius) {
        String[] autoriai = new String[autoriuSkaicius];
        for (int i = 0; i < autoriuSkaicius; i++) {
            int numeris = vienasIs(this.getVardai());
            String vardas = this.getVardas(numeris);
            numeris = vienasIs(this.pavardes);
            String pavarde = this.getPavarde(numeris);
            String autorius = new String(vardas + " " + pavarde);
            autoriai[i] = autorius;
        }
        return autoriai;
    }

    public String setZanras() {
        int numeris = vienasIs(this.zanrai);
        String zanras = getZanras(numeris);
        return zanras;
    }

    public String setLeidimoNumeris() {
        int numeris = vienasIs(this.leidimoNumeriai);
        String leidimoNumeris = getLeidimoNumeris(numeris);
        return leidimoNumeris;
    }

    public String setLeidimoVieta() {
        int numeris = vienasIs(this.leidimoVietos);
        String leidimoVieta = getLeidimoVieta(numeris);
        return leidimoVieta;
    }

    public int setPuslapiuSkaicius(int min, int max) {
        int skaicius = new Random().nextInt((max - min) + 1) + min;
        return skaicius;
    }

    public boolean setKietaisVirseliais(boolean arKieti) {
        return arKieti;
    }

    public String setIsbnNumeris() {
        String isbn = "";
        for (int i = 0; i < 3; i++) {
            isbn += new Random().nextInt((9 - 1) + 1) + 1;
        }
        isbn += "-";
        for (int i = 0; i < 4; i++) {
            isbn += new Random().nextInt((9 - 1) + 1) + 1;
        }
        isbn += "-";
        for (int i = 0; i < 2; i++) {
            isbn += new Random().nextInt((9 - 1) + 1) + 1;
        }
        return isbn;
    }

    private String getBudvardis(int eilesNumeris) {
        return this.budvardziai[eilesNumeris];
    }

    private String getDaiktavardis(int eilesNumeris) {
        return this.daiktavardziai[eilesNumeris];
    }

    private String getVeiksmazodis(int eilesNumeris) {
        return this.veiksmazodziai[eilesNumeris];
    }

    private String getRandomPabaiga(int eilesNumeris) {
        return this.randomPabaigos[eilesNumeris];
    }

    private String[] getVardai() {
        return this.vardai;
    }

    private String getVardas(int eilesNumeris) {
        return this.vardai[eilesNumeris];
    }

    private String getPavarde(int eilesNumeris) {
        return this.pavardes[eilesNumeris];
    }

    private String getZanras(int eilesNumeris) {
        return this.zanrai[eilesNumeris];
    }

    private String getLeidimoNumeris(int eilesNumeris) {
        return this.leidimoNumeriai[eilesNumeris];
    }

    private String getLeidimoVieta(int eilesNumeris) {
        return this.leidimoVietos[eilesNumeris];
    }

    private String getIsbnNumeris() {
        return isbnNumeris;
    }

    private int getPuslapiuSkaicius() {
        return puslapiuSkaicius;
    }

    private boolean isKietaisVirseliais() {
        return kietaisVirseliais;
    }
}
