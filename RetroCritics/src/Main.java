public class Main {
    public static void main(String[] args) {

        SaveData game = new SaveData();
        game.addAttribute("Naam", "Factorio");
        game.addAttribute("Prijs", "3000000");
        SaveManager.saveGame(game, "Famctorio");

        SaveData review = new SaveData();
        review.addAttribute("Titel", "Mijn Eerste Review");
        review.addAttribute("Beschrijving", "FAMCTORIO IS THE GOAT");
        SaveManager.saveReview(review, "Famctorio", "Mijn_Eerste_Review");

        SaveData enqt = new SaveData();
        enqt.addAttribute("Zou ik de app nog eens gebruiken?", "pluh");
        enqt.addAttribute("Wat geef ik de app als rating?", "9/11");
        SaveManager.saveEnquete(enqt);

    }
}