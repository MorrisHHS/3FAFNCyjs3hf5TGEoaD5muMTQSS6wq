import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        SaveManager.writeToFile("UwU OwO QwQ TwT", "C:\\Users\\vooij\\IdeaProjects\\3FAFNCyjs3hf5TGEoaD5muMTQSS6wq\\RetroCritics\\FileTest\\UwU.txt");

        Enquete enquete = new Enquete();
        EnqueteVragen enqueteVragen = new EnqueteVragen();

        // Get questions from EnqueteVragen and add them to Enquete
        ArrayList<String> vragen = enqueteVragen.getVragen();
        for (String vraag : vragen) {
            enquete.voegVraagToe(vraag);
        }

        // Display the questions
        System.out.println(enquete.toonVragen());
    }
}