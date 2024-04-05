import java.util.ArrayList;

public class Enquete {
    private ArrayList<EnqueteVraag> vragen;

    public Enquete() {
        vragen = new ArrayList<>();
    }

    public void voegVraagToe(EnqueteVraag vraag) {
        vragen.add(vraag);
    }

    public String toonVragen() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < vragen.size(); i++) {
            result.append("Vraag ").append(i + 1).append(": ").append(vragen.get(i).getTekst()).append("\n");
        }
        return result.toString();
    }
}

class EnqueteVraag extends Vraag { // EnqueteVraag breidt Vraag uit
    private String tekst;

    public EnqueteVraag(int nummer, String tekst) {
        this.nummer = nummer; // Nummer van de vraag instellen
        this.tekst = tekst;
    }

    public String getTekst() {
        return tekst;
    }
}