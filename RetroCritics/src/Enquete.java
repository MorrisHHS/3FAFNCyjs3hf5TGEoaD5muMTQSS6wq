import java.util.ArrayList;

public class Enquete
{
    ArrayList<Vraag> vragen;

    public Enquete() {
        vragen = new ArrayList<>();
        voegVraagToe(new OpenVraag(1, "Hoe vaak gebruik je de reviewapp?"));
        voegMeerkeuzeVraagToe(new MultipleChoiceVraag(2, "Welke functies van de reviewapp gebruik je het meest?\n[1] Games bekijken\n[2] Review achterlaten\n[3] Ranglijst bekijken\n[4] Uitverkoopscherm", (byte)3), "Wat vindt u fijn aan het uitverkoopscherm");
        voegVraagToe(new OpenVraag(3, "Op welke apparaten gebruik je de reviewapp (bijvoorbeeld: smartphone, tablet, desktop)?"));
        voegMeerkeuzeVraagToe(new MultipleChoiceVraag(4, "Hoe gemakkelijk vind je het om nieuwe recensies toe te voegen?\n[1] Heel moeilijk\n[2] Iets te moeilijk\n[3] Het gaat wel\n[4] Super makkelijk", (byte)0), "Waarom vindt u dat het moeilijk gaat?");
        voegMeerkeuzeVraagToe(new MultipleChoiceVraag(5, "Hoe zou je de gebruikersinterface van de reviewapp beoordelen op een schaal van 1 tot 4?", (byte)0), "Waarom heeft u deze rating gegeven?");

    }

    public void toonVragen() {
        for(Vraag vraag : vragen) {
            vraag.display();
            vraag.beantwoord();
        }
    }

    public void voegVraagToe(Vraag vraag) {
        vragen.add(vraag);
    }

    public void voegMeerkeuzeVraagToe(Vraag vraag, String beschrijving) {
        vragen.add(vraag);
        MultipleChoiceVraag vraagje = (MultipleChoiceVraag) vraag;
        vraagje.voegConditioneleVraagToe(beschrijving);
        }
    }
