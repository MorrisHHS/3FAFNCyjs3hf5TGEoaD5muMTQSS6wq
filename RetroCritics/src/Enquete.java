import java.util.ArrayList;
import java.util.Scanner;

public class Enquete extends EnqueteVragen {
    private ArrayList<Vraag> vragen;

    public Enquete() {
        this.vragen = new ArrayList<>();
    }

    public void voegVraagToe(Vraag vraag) {
        this.vragen.add(vraag);
    }

    public void toonVragen() {
        Scanner scanner = new Scanner(System.in);
        for (Vraag vraag : vragen) {
            vraag.display();
            vraag.beantwoord();
        }
    }
}
