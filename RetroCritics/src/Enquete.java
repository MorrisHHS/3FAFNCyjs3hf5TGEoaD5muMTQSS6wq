import java.util.ArrayList;

public class Enquete {
    private ArrayList<EnqueteVraag> vragen;

    public Enquete() {
        this.vragen = new ArrayList<>();
    }

    public void voegVraagToe(EnqueteVraag vraag) {
        vragen.add(vraag);
    }

    public String toonVragen() {
        StringBuilder resultaat = new StringBuilder();
        for (EnqueteVraag vraag : vragen) {
            resultaat.append(vraag.display()).append("\n");
        }
        return resultaat.toString();
    }
}

public abstract class EnqueteVraag {
    private int nummer;
    private String beschrijving;

    public EnqueteVraag(int nummer, String beschrijving) {
        this.nummer = nummer;
        this.beschrijving = beschrijving;
    }

    public abstract void beantwoord();

    public String display() {
        return "Vraag " + nummer + ": " + beschrijving;
    }
}

public static void main(String[] args) {
    // Instantiate Enquete and add questions
    // Call methods to interact with the Enquete object
}