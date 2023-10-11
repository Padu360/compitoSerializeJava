import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Dipendenti
 */
public class Dipendenti {

    public int id;
    public String dataNascita;
    public String dataAssunzione;
    public String codiceUfficio;
    public String cognome;
    public String nome;
    public String indirizzo;

    public Dipendenti(int id, String dataNascita, String dataAssunzione, String codiceUfficio, String cognome,
            String nome, String indirizzo) {
        this.id = id;
        this.dataNascita = dataNascita;
        this.dataAssunzione = dataAssunzione;
        this.codiceUfficio = codiceUfficio;
        this.cognome = cognome;
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    public void CaricaCSV(String nomeFile) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(nomeFile));

        String leggi;
        while ((leggi = br.readLine()) != null) {
            String[] splittata = leggi.split(",");

            // controllo di avere letto un dato giusto
            if (splittata.length == 7) {
                this.id = Integer.parseInt(splittata[0]);
                this.dataNascita = splittata[1];
                this.dataAssunzione = splittata[2];
                this.codiceUfficio = splittata[3];
                this.cognome = splittata[4];
                this.nome = splittata[5];
                this.indirizzo = splittata[6];

            } else {
                System.out.println("ERRORE");
            }
        }
    }

    public String Serializza() {
        String ris = "";

        ris += "i:" + id + ";";
        ris += "s:" + dataNascita.length() + ":\"" + dataNascita + "\";";
        ris += "s:" + dataAssunzione.length() + ":\"" + dataAssunzione + "\";";
        ris += "s:" + codiceUfficio.length() + ":\"" + codiceUfficio + "\";";
        ris += "s:" + cognome.length() + ":\"" + cognome + "\";";
        ris += "s:" + nome.length() + ":\"" + nome + "\";";
        ris += "s:" + indirizzo.length() + ":\"" + indirizzo + "\";";

        return ris;
    }
}
