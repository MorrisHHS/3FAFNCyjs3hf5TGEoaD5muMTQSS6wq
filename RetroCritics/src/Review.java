import java.util.Scanner;

public class Review {
    String titel;
    String toelichting;

    GameAspect storyline;
    GameAspect graphics;
    GameAspect gameplay;

    public Review (String titel, String toelichting) {
        this.titel = titel;
        this.toelichting = toelichting;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
    public String getTitel() {
        return titel;
    }

    public void setToelichting(String toelichting) {
        this.toelichting = toelichting;
    }
    public String getToelichting() {
        return toelichting;
    }

    public double berekenGemiddeldeScore() {
        return (storyline.beoordeling + graphics.beoordeling + gameplay.beoordeling) / 3;
    }
    public void biedEnqueteAan() {
        System.out.println("Wilt u nog een enquete invullen (y/n)");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) { return; }
        String enquete = scanner.nextLine();
        if (enquete.equals("y")) {
            //nigger ding voor doorsturen naar enquete
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
}
