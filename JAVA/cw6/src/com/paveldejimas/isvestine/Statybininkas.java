package com.paveldejimas.isvestine;
import com.paveldejimas.bazine.Zmogus;

public class Statybininkas extends Zmogus implements StatybininkasInterface {

    private int atlyginimas;
    private String issilavinimas, specializacija;
    private double stazas;

    public Statybininkas(
            int atlyginimas,
            String issilavinimas,
            String specializacija,
            double stazas,
            String lytis,
            String asmensKodas,
            String vardas,
            String pavarde,
            int amzius,
            int svoris,
            int ugis,
            String plaukuSpalva) {

        super(
                lytis,
                asmensKodas,
                vardas,
                pavarde,
                amzius,
                svoris,
                ugis,
                plaukuSpalva);
        this.atlyginimas = atlyginimas;
        this.issilavinimas = issilavinimas;
        this.specializacija = specializacija;
        this.stazas = stazas;
    }

    public double getStazas() {
        return this.stazas;
    }

    public int getAtlyginimas() {
        return this.atlyginimas;
    }

    public String getIssilavinimas() {
        return this.issilavinimas;
    }

    public String getSpecializacija() {
        return this.specializacija;
    }

    public void setStazas(int stazas) {
        this.stazas = stazas;
    }

    public void setAtlyginimas(int atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    public void setIssilavinimas(String issilavinimas) {
        this.issilavinimas = issilavinimas;
    }

    public void setSpecializacija(String specializacija) {
        this.specializacija = specializacija;
    }
}
