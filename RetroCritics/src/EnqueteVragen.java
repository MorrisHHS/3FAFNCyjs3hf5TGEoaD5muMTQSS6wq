import java.util.ArrayList;

public class EnqueteVragen {
    private ArrayList<Vraag> vragen;

    public EnqueteVragen() {
        this.vragen = new ArrayList<>();
        voegVragenToe();
    }

    private void voegVragenToe() {
        // Open Vragen
        voegVraagToe(new OpenVraag(1, "Wat was je favoriete item dat je in onze retro winkel hebt gevonden en waarom?"));
        voegVraagToe(new OpenVraag(2, "Beschrijf je ervaring tijdens het winkelen bij ons in één woord en leg uit waarom je dit woord hebt gekozen."));
        voegVraagToe(new OpenVraag(3, "Hoe kunnen we volgens jou onze retro winkel nog verbeteren of uitbreiden?"));

        // Multiple Choice Vragen
        voegVraagToe(new MultipleChoiceVraag(4, "Hoe vaak bezoek je onze retro winkel?", (byte)-1)); // Hier wordt -1 doorgegeven omdat deze vraag geen conditionele vraag is
        voegVraagToe(new MultipleChoiceVraag(5, "Wat is de belangrijkste reden waarom je onze retro winkel bezoekt?", (byte)-1)); // Hier wordt -1 doorgegeven omdat deze vraag geen conditionele vraag is
        voegVraagToe(new MultipleChoiceVraag(6, "Hoe tevreden ben je over de prijs-kwaliteitverhouding van onze producten?", (byte)-1)); // Hier wordt -1 doorgegeven omdat deze vraag geen conditionele vraag is
        voegVraagToe(new MultipleChoiceVraag(7, "Welk aspect van onze retro winkel spreekt je het meest aan?", (byte)-1)); // Hier wordt -1 doorgegeven omdat deze vraag geen conditionele vraag is
        voegVraagToe(new MultipleChoiceVraag(8, "Hoe waarschijnlijk is het dat je onze retro winkel zou aanbevelen aan een vriend of familielid?", (byte)-1)); // Hier wordt -1 doorgegeven omdat deze vraag geen conditionele vraag is

        voegVraagToe(new ConditioneleVraag("Als je in onze retro winkel een specifiek item niet kon vinden dat je zocht, hoe waarschijnlijk is het dat je ons zou contacteren voor hulp?"));
        voegVraagToe(new ConditioneleVraag("Indien we workshops of evenementen zouden organiseren in onze retro winkel, hoe groot is de kans dat je zou deelnemen?"));
    }

    public void voegVraagToe(Vraag vraag) {
        this.vragen.add(vraag);
    }

    public ArrayList<Vraag> getVragen() {
        return this.vragen;
    }
}
