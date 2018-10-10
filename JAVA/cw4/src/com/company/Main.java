package com.company;

public class Main {

    public static void main(String[] args) {
        Studentas saulius = new Studentas("Saulius","Petrauskas",15,"J18/1T");
        Studentas petras = new Studentas("Petras");
        Studentas antanas = new Studentas("Antanas", "Petrauskas");
        Studentas edgaras = new Studentas("Edgaras", 25);
        Studentas paulius = new Studentas("Paulius","Antanavicius","17R-18T");
        Table table = new Table(saulius, petras, antanas,edgaras, paulius);

        petras.setPavarde("Aleksandravicius");
        table = new Table(saulius, petras, antanas,edgaras, paulius);

        edgaras.setGrupe("AAABBBCCCDDD");
        table = new Table(saulius, petras, antanas,edgaras, paulius);
    }
}
