import java.util.ArrayList;

public class EnqueteVragen {

    Enquete enquete = new Enquete();
    public static ArrayList<String> getVragen() {
        ArrayList<String> questions = new ArrayList<>();
        questions.add("");
        questions.add("");
        questions.add("");
        questions.add("");
        questions.add("");
        questions.add("Heb je ooit problemen ondervonden bij het gebruik van de reviewapp? Zo ja, welke?");
        questions.add("Hoe nauwkeurig vind je de beoordelingen en recensies op de app?");
        questions.add("Welke functies zou je graag toegevoegd zien aan de reviewapp?");
        questions.add("Zou je de reviewapp aanbevelen aan anderen? Waarom wel of niet?");
        questions.add("Op welke manieren denk je dat de reviewapp verbeterd kan worden?");
        questions.add("Hoe tevreden ben je over de snelheid waarmee nieuwe recensies worden toegevoegd?");
        questions.add("Gebruik je de mogelijkheid om recensies te filteren op bepaalde criteria, zoals locatie of datum?");
        questions.add("Hoe belangrijk vind je het dat de reviewapp socialemediakoppelingen heeft?");
        questions.add("Heb je ooit gebruik gemaakt van de mogelijkheid om afbeeldingen toe te voegen aan je recensies?");
        questions.add("Op welke manieren denk je dat de reviewapp zich kan onderscheiden van vergelijkbare apps?");
        questions.add("Hoe zou je de algemene gebruikservaring van de reviewapp beschrijven in drie woorden?");
        questions.add("Zou je bereid zijn om te betalen voor extra functies of een premiumversie van de reviewapp? Zo ja, welke functies zouden dat voor jou moeten zijn?");
        return questions;
    }
}