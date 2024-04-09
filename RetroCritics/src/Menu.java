import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Menukeuze> menukeuzes = new ArrayList<>();

    public void toonMenu() {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        for (Menukeuze mk : menukeuzes) {
            System.out.println("[" + counter + "] " + mk.naam);
            counter++;
        }

        int keuze = 0;
        boolean keuzeGemaakt = false;
        while (!keuzeGemaakt){
            System.out.print("Maak een keuze: ");
            keuze = scanner.nextInt();

            if (keuze > menukeuzes.size() - 1 ||
            keuze < 0){
                System.out.println("Voer een geldig getal in");
            }
            else {
                keuzeGemaakt = true;
            }
        }
        menukeuzes.get(keuze).toonMenukeuze();
    }

    public void voegKeuzeToe(Menukeuze menu){
        menukeuzes.add(menu);
    }
}


