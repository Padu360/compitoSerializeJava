import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GestioneUffici
 */
public class GestioneUffici {

    List<Uffici> list;

    public GestioneUffici() {
        list = new ArrayList<>();
    }

    public void CaricaCSV(String nomeFile) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(nomeFile));

        String leggi;
        while ((leggi = br.readLine()) != null) {
            String[] splittata = leggi.split(";");

            // controllo di avere letto un dato giusto
            if (splittata.length == 6) {
                Uffici u = new Uffici(Integer.parseInt(splittata[0]), splittata[1], Integer.parseInt(splittata[2]),
                        Integer.parseInt(splittata[3]),
                        splittata[4], splittata[5]);

                list.add(u);

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