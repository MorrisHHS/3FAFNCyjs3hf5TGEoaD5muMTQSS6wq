import java.util.Scanner;

public class Review implements ISaveable{
    String titel;
    String toelichting;
    GameAspect storyline;
    GameAspect graphics;
    GameAspect gameplay;

    public Review(Scanner scanner) {
        setReview(scanner);
    }

    public Review(){
    }

    public void setReview(Scanner scanner) {
        setTitel(scanner);
        setToelichting(scanner);
        storyline = new GameAspect("Storyline");
        graphics = new GameAspect("Graphics");
        gameplay = new GameAspect("Gameplay");
        geefRating(scanner, storyline);
        geefRating(scanner, graphics);
        geefRating(scanner, gameplay);
    }

    public void setTitel(Scanner scanner) {
        System.out.println("Typ hier de titel van uw review over het spel:");
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
                if (rating < 1 || rating > 10) {
                    System.out.println("Ongeldige invoer. Voer een geldige beoordeling in.");
                } else {
                    gameAspect.beoordeling = rating;
                    geldigeInvoer = true;
                }
            } else {
                System.out.println("Ongeldige invoer. Voer een geldige beoordeling in.");
                scanner.next(); // Overslaan van ongeldige invoer
            }
        }

        if (storyline.beoordeling != 0.0 && graphics.beoordeling != 0.0 && gameplay.beoordeling != 0.0) {
            System.out.println("Dank u wel voor de review!");
            System.out.printf("De gemiddelde score van uw review is %.2f \n", berekenGemiddeldeScore());
            biedEnqueteAan(scanner);
        }
    }

    public void toonReview() {
        System.out.println(titel);
        System.out.println("Beoordelingen:");
        System.out.println("Storyline: " + storyline.beoordeling);
        System.out.println("Graphics: " + graphics.beoordeling);
        System.out.println("Gameplay" + gameplay.beoordeling);
        System.out.println("Gemiddelde score: " + berekenGemiddeldeScore());
        System.out.println("Beschrijving: " + toelichting);
    }

    public void biedEnqueteAan(Scanner scanner) {
        System.out.println("Wilt u nog een enquete invullen? (y/n)");
        scanner.nextLine(); // Lees de nieuwe regel na de vorige invoer
        String enquete = scanner.nextLine();
        if (enquete.equals("y")) {
            System.out.println("Oké, bij deze de enquête!");
            Enquete enquete1 = new Enquete();
            enquete1.toonVragen();
            System.out.println("Bedankt voor uw tijd en het invullen van de enquete!");

        } else {
            System.out.println("Jammer, doei");
        }
    }

    @Override
    public SaveData save() {
        SaveData saveData = new SaveData();

        saveData.addAttribute("titel", String.valueOf(titel));
        saveData.addAttribute("toelichting", String.valueOf(toelichting));
        saveData.addAttribute("storyline", String.valueOf(storyline.naam));
        saveData.addAttribute("storyline-rating", String.valueOf(storyline.beoordeling));
        saveData.addAttribute("graphics", String.valueOf(graphics.naam));
        saveData.addAttribute("graphics-rating", String.valueOf(graphics.beoordeling));
        saveData.addAttribute("gameplay", String.valueOf(gameplay.naam));
        saveData.addAttribute("gameplay-rating", String.valueOf(gameplay.beoordeling));
        return saveData;
    }

    @Override
    public void load(SaveData saveData) {
        titel = saveData.readAttribute("titel");
        toelichting = saveData.readAttribute("toelichting");
        storyline = new GameAspect(saveData.readAttribute("storyline"));
        storyline.beoordeling = Double.parseDouble(saveData.readAttribute("storyline-rating"));
        graphics = new GameAspect(saveData.readAttribute("graphics"));
        graphics.beoordeling = Double.parseDouble(saveData.readAttribute("graphics-rating"));
        gameplay = new GameAspect(saveData.readAttribute("gameplay"));
        gameplay.beoordeling = Double.parseDouble(saveData.readAttribute("gameplay-rating"));
    }
}