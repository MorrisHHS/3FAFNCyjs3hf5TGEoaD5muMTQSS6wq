import java.util.ArrayList;

public class Enquete
{
    private ArrayList<String> vragen;

    public Enquete()
    {
        this.vragen = new ArrayList<>();
    }

    public void voegVraagToe(String vraag)
    {
        this.vragen.add(vraag);
    }

    public String toonVragen() {
        String result = "";
        for (int i = 0; i < vragen.size(); i++) {
            result += vragen.get(i) + "\n";
        }
        return result;
    }
}
