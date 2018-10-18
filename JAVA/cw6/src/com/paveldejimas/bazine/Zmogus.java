package com.paveldejimas.bazine;

public class Zmogus implements ZmogusInterface {

    String lytis, asmensKodas, vardas, pavarde, plaukuSpalva;
    int amzius, svoris, ugis;

    public Zmogus(
            String lytis,
            String asmensKodas,
            String vardas,
            String pavarde,
            int amzius,
            int svoris,
            int ugis,
            String plaukuSpalva) {

        this.lytis = lytis;
        this.asmensKodas = asmensKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.svoris = svoris;
        this.ugis = ugis;
        this.plaukuSpalva = plaukuSpalva;
    }

    public String[] getInfo() {
        String[] string = {
                this.getLytis(),
                this.getAsmensKodas(),
                this.getVardas(),
                this.getPavarde(),
                "" + this.getAmzius(),
                "" + this.getSvoris(),
                "" + this.getUgis(),
                this.getPlaukuSpalva()};
        return string;
    }

    public String getLytis() {
        return this.lytis;
    }

    public String getAsmensKodas() {
        return this.asmensKodas;
    }

    public String getVardas() {
        return this.vardas;
    }

    public String getPavarde() {
        return this.pavarde;
    }

    public String getPlaukuSpalva() {
        return this.plaukuSpalva;
    }

    public int getAmzius() {
        return this.amzius;
    }

    public int getSvoris() {
        return this.svoris;
    }

    public int getUgis() {
        return this.ugis;
    }

    public void setLytis(String lytis) {
        this.lytis = lytis;
    }

    public void setAsmensKodas(String asmensKodas) {
        this.asmensKodas = asmensKodas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public void setSvoris(int svoris) {
        this.svoris = svoris;
    }

    public void setUgis(int ugis) {
        this.ugis = ugis;
    }
}
