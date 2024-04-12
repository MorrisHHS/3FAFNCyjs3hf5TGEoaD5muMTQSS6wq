import java.util.ArrayList;
public class Game {
    public static ArrayList<Game> list = new ArrayList<>();

    public String naam = "";
    public int prijs = 0;
    public ArrayList<Review> reviews = new ArrayList<>();

    public Game(String naam, int prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    public Game(){

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



}
