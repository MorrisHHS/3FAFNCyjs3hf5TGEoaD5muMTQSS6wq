import java.util.ArrayList;
public class Game {
    public String naam;
    public int prijs;
    public ArrayList<Review> reviews;

    public Game(String naam, int prijs) {
        this.naam = naam;
        this.prijs = prijs;
        reviews = new ArrayList<Review>();
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
        return (double)score / (double) reviews.size();
    }



}
