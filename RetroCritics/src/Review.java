import java.util.Scanner;

public class Review {
    String titel;
    String toelichting;
    GameAspect storyline;
    GameAspect graphics;
    GameAspect gameplay;

    public Review (Scanner scanner, String naam) {
        setTitel(scanner, naam);
        setToelichting(scanner);
        storyline = new GameAspect("Storyline");
        graphics = new GameAspect("Graphics");
        gameplay = new GameAspect("Gameplay");


    }

    public void setTitel(Scanner scanner, String naam) {
        System.out.println("Typ hier de titel van uw review over " + naam + ":");
        if (scanner.hasNextLine()) {
            this.titel = scanner.nextLine();
        }
    }
    public String getTitel() {
        return titel;
    }

    public void setToelichting(Scanner scanner) {
        System.out.println("Typ hier de beschrijving bij uw review:");
        if (scanner.hasNextLine()) {
            this.toelichting = scanner.nextLine();
        }
    }
    public String getToelichting() {
        return toelichting;
    }

    public double berekenGemiddeldeScore() {
        return (storyline.beoordeling + graphics.beoordeling + gameplay.beoordeling) / 3;
    }
    public void geefRating(Scanner scanner, GameAspect gameAspect) {
        System.out.println("Geef een beoordeling voor " + gameAspect.naam + ".");
        boolean geldigeInvoer = false;
        while (!geldigeInvoer) {
            if (scanner.hasNextDouble()) {
                double rating = scanner.nextDouble();
                geldigeInvoer = true;
                if (rating < 1 && rating > 10) {
                    System.out.println("Ongeldige invoer. Voer een geldige beoordeling in.");

                    geldigeInvoer = false;
                } else {
                    gameAspect.beoordeling = rating;
                }
            } else {
                System.out.println("Ongeldige invoer. Voer een geldige beoordeling in.");
                scanner.next(); // Overslaan van ongeldige invoer
            }
        }
        if (storyline.beoordeling != 0.0 && graphics.beoordeling != 0.0 && gameplay.beoordeling != 0.0) {
            System.out.printf("De gemiddelde score van uw review is %.2f \n", berekenGemiddeldeScore());
            System.out.println("Dank u wel voor de review!");
            biedEnqueteAan(scanner);
        }

    }
    public void biedEnqueteAan(Scanner scanner) {
        System.out.println("Wilt u nog een enquete invullen? (y/n)");
        scanner.nextLine();
        String enquete = scanner.nextLine();
        if (enquete.equals("y")) {
            System.out.println("Oké, bij deze de enquête!");
            Enquete enquete1 = new Enquete();
            enquete1.toonVragen();
        }
    }
}
