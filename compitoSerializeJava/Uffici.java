/**
 * Uffici
 */
public class Uffici {

    public int id;
    public String codiceUfficio;
    public int numeroPosti;
    public int idResponsabile;
    public String nomeUfficio;
    public String piano;

    public Uffici(int id, String codiceUfficio, int numeroPosti, int idResponsabile, String nomeUfficio, String piano) {
        this.id = id;
        this.codiceUfficio = codiceUfficio;
        this.numeroPosti = numeroPosti;
        this.idResponsabile = idResponsabile;
        this.nomeUfficio = nomeUfficio;
        this.piano = piano;
    }

    public String Serializza() {
        String ris = "";

        ris += "i:" + id + ";";
        ris += "s:" + codiceUfficio.length() + ":\"" + codiceUfficio + "\";";
        ris += "i:" + numeroPosti + ";";
        ris += "i:" + idResponsabile + ";";
        ris += "s:" + nomeUfficio.length() + ":\"" + nomeUfficio + "\";";
        ris += "s:" + piano.length() + ":\"" + piano + "\";";

        return ris;
    }

}