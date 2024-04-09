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

    public String toonVragen()
    {
        StringBuilder result = new StringBuilder();
        for (Vraag vraag : vragen)
        {
            result.append(vraag.toString()).append("\n");
        }
        return result.toString();
    }
}