import java.util.Scanner;

public class SaleMenu extends Menukeuze {
    public SaleMenu(String naam) {
        super(naam);
    }

    @Override
    public void toonMenukeuze() {
        System.out.println();

        // Kortingspercentage instellen
        int kortingBedrag = 20; // 20% korting (in centen)

        System.out.println("Games met korting:");
        for (Game game : Game.list) {
            // Korting berekenen en toepassen
            double korting = (double)game.prijs / 10000 * kortingBedrag;
            double oudePrijs = (double)game.prijs / 100;
            double nieuwePrijs = oudePrijs - korting;

            // Afdrukken van game met korting
            System.out.println("Game naam: " + game.getNaam());
            System.out.printf("Oude prijs: %.2f\n", oudePrijs);
            System.out.printf("Korting: %.2f\n", korting);
            System.out.printf("Nieuwe prijs na korting: %.2f\n", nieuwePrijs);
            System.out.println();
        }

        // Input van de gebruiker verwerken
        Scanner scanner = new Scanner(System.in);
        System.out.println("Druk op Enter om verder te gaan...");
        scanner.nextLine();

        System.out.println(" ");
        System.out.println(naam + ":");
        menu.toonMenu();

    }
}
