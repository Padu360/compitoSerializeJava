import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Azienda
 */
public class Azienda {

    public GestioneDipendenti gDipendenti;
    public GestioneUffici gUffici;

    public Azienda(String nomeFileDipendenti, String nomeFileUffici) throws NumberFormatException, IOException {
        gDipendenti = new GestioneDipendenti();
        gUffici = new GestioneUffici();
        gDipendenti.CaricaCSV(nomeFileDipendenti);
        gUffici.CaricaCSV(nomeFileUffici);
    }

    public void SerialzzaSuFile(String nomeFile) throws IOException {
        String str = gDipendenti.Serializza();
        str += gUffici.Serializza();

        BufferedWriter bw = new BufferedWriter(new FileWriter(nomeFile));
        bw.write(str);
        bw.close();
    }
}