import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GestioneDipendenti
 */
public class GestioneDipendenti {

    List<Dipendenti> list;

    public GestioneDipendenti() {
        list = new ArrayList<>();
    }

    public void CaricaCSV(String nomeFile) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(nomeFile));

        String leggi;
        while ((leggi = br.readLine()) != null) {
            String[] splittata = leggi.split(";");

            // controllo di avere letto un dato giusto
            if (splittata.length == 8) {
                Dipendenti d = new Dipendenti(Integer.parseInt(splittata[0]), splittata[1], splittata[2], splittata[3] +
                        splittata[4], splittata[5], splittata[6], splittata[7]);

                list.add(d);

            } else {
                System.out.println("ERRORE");
            }
        }
    }

    public String Serializza() {
        String ris = "a:" + list.size() + ":{";
        for (int i = 0; i < list.size(); i++) {
            ris += list.get(i).Serializza();
        }

        ris += "}";

        return ris;
    }
}