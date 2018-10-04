package com.company;

public class Table {

    private int[] widths;
    private static final String[] antrastes = {"Vardas", "Pavarde", "ID", "Grupe"};
    private int tableWidth;

    public Table(Studentas... args) {
        widths = new int[4];
        this.calculateHeaderWidth(antrastes);
        this.calculateWidths(args);
        this.setTableWidth();
        this.printLine(this.getTableWidth());
        this.printHeaders();
        this.printLine(this.getTableWidth());
        this.printData(args);
        this.printLine(this.getTableWidth());
    }
    public int getTableWidth() {
        return this.tableWidth;
    }
    public void setTableWidth() {
        this.tableWidth = 0;
        for (int i = 0; i < this.getWidths().length; i++) {
            this.tableWidth += this.getWidths()[i] + 2;

        }
        this.tableWidth += this.getWidths().length + 1;
    }
    public void printLine(int count) {
        System.out.println("");
        for (int i = 0; i < count; i++) {
            System.out.print("-");
        }
    }
    public void setWidths(int index, int value) {
        this.widths[index] = value;
    }
    public int[] getWidths () {
        return this.widths;
    }
    public void calculateHeaderWidth(String[] antrastes) {
        for (int i = 0; i < antrastes.length; i++) {
            this.setWidths(i, antrastes[i].length());
        }
    }
    public void calculateWidths(Studentas... args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].getInfo().length; j++)
                if (args[i].getInfo()[j].length() > this.getWidths()[j]) {
                    this.setWidths(j, args[i].getInfo()[j].length());
                }
        }
    }
    public void printHeaders() {
        System.out.println("");
        for (int i = 0; i < antrastes.length; i++) {
            System.out.print("| " + antrastes[i]);
            for (int j = antrastes[i].length(); j < this.getWidths()[i] + 1; j++) {
                System.out.print(" ");
            }
        }
        System.out.print("|");

    }
    public void printData(Studentas... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("");
            for (int j = 0; j < args[i].getInfo().length; j++) {
                System.out.print("| " + args[i].getInfo()[j]);
                for (int k = args[i].getInfo()[j].length(); k < this.getWidths()[j] + 1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.print("|");
        }
    }
}
