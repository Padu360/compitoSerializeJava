import java.io.IOException;

public class App {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Azienda azienda = new Azienda("dipendenti.csv", "uffici.csv");
        azienda.SerialzzaSuFile("azienda");
    }
}
