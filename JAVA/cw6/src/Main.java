import com.paveldejimas.bazine.Zmogus;
import com.paveldejimas.isvestine.Statybininkas;

public class Main {

    public static void main(String[] args) {

        Statybininkas Petras = new Statybininkas(

                1000,
                "aukštasis",
                "tinkuotojas",
                15,
                "vyras",
                "38804112233",
                "Petras",
                "Petrauskas",
                25,
                78,
                194,
                "ruda"
        );
        Zmogus nerka = new Zmogus("vyras",
                "38804112233",
                "Petras",
                "Petrauskas",
                25,
                78,
                194,
                "ruda");
        arra
        System.out.println(Petras.getAsmensKodas());
    }
}
