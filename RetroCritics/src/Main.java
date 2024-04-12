import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SaveData game = new SaveData();
        game.addAttribute("Naam", "Factorio");
        game.addAttribute("Prijs", "30000");
        SaveManager.saveGame(game, "Famctorio");

        SaveData game2 = new SaveData();
        game2.addAttribute("Naam", "Skyrim");
        game2.addAttribute("Prijs", "30");
        SaveManager.saveGame(game2, "Skyrim");

        SaveData game3 = new SaveData();
        game3.addAttribute("Naam", "Call_Of_Duty");
        game3.addAttribute("Prijs", "70");
        SaveManager.saveGame(game3, "Call_Of_Duty");

        SaveData review = new SaveData();
        review.addAttribute("Titel", "Mijn Eerste Review");
        review.addAttribute("Beschrijving", "FAMCTORIO IS THE GOAT");
        SaveManager.saveReview(review, "Famctorio", "Mijn_Eerste_Review");

        SaveData enqt = new SaveData();
        enqt.addAttribute("Zou ik de app nog eens gebruiken?", "pluh");
        enqt.addAttribute("Wat geef ik de app als rating?", "9/11");
        SaveManager.saveEnquete(enqt);

        ArrayList<SaveData> games = SaveManager.loadAllGames();
        for (SaveData gam : games){
            System.out.println(gam.readAttribute("Naam"));
            System.out.println(gam.readAttribute("Prijs"));
            System.out.println();
        }
    }
}