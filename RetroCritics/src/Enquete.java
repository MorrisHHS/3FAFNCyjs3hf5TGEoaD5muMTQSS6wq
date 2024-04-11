import java.util.ArrayList;

public class Enquete
{
    private ArrayList<Vraag> vragen;

    public Enquete()
    {
        this.vragen = new ArrayList<>();
    }

    public void voegVraagToe(Vraag vraag)
    {
        this.vragen.add(vraag);
    }

    public void toonVragen()
    {
        for (Vraag vraag : vragen)
        {
            vraag.display();
        }
    }

    public static void main(String[] args)
    {
        Enquete enquete = new Enquete();

        enquete.voegVraagToe(new OpenVraag(1, "Wat is je naam?"));
        enquete.voegVraagToe(new MultipleChoiceVraag(2, "Zou je de app nog een keer gebruiken? (Ja/Nee)", (byte)1));
        //enquete.voegVraagToe(new ConditioneleVraag((byte)1, "Waarom zou je de app nog een keer willen gebruiken?"));

        enquete.toonVragen();
    }
}