import java.util.ArrayList;
public class Game implements ISaveable{
    public String naam;
    public int prijs;
    public String genre;
    public ArrayList<Review> reviews;

    public Game(String naam, int prijs, String genre) {
        this.naam = naam;
        this.prijs = prijs;
        this.genre = genre;
        reviews = new ArrayList<Review>();
    }

    public Game(){
        naam = "";
        prijs = 0;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    public String getNaam() {
        return this.naam;
    }
    public void prijsBewerken(int nieuwePrijs) {
        this.prijs = nieuwePrijs;
    }

    public int getPrijs() {
        return this.prijs;
    }

    public double berekenGemiddeldeScore() {
        int score = 0;
        for(int i = 0; i < reviews.size(); i++) {
            score += reviews.get(i).berekenGemiddeldeScore();
        }
        double gemiddeldeScore = score / reviews.size();
        return gemiddeldeScore;
    }


    @Override
    public SaveData save() {
        SaveData saveData = new SaveData();

        saveData.addAttribute("naam", String.valueOf(naam));
        saveData.addAttribute("prijs", String.valueOf(prijs));
        saveData.addAttribute("genre", String.valueOf(genre));
        return saveData;
    }

    @Override
    public void load(SaveData saveData) {
        naam = saveData.readAttribute("naam");
        prijs = Integer.parseInt(saveData.readAttribute("prijs"));
        genre = saveData.readAttribute("genre");
    }
}
