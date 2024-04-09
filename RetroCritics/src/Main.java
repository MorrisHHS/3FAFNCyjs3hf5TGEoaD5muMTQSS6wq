import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        //EnqueteAbhi
        Enquete enquete = new Enquete();
        EnqueteVragen enqueteVragen = new EnqueteVragen();

        // Get questions from EnqueteVragen and add them to Enquete
        ArrayList<String> vragen = EnqueteVragen.getVragen();
        for (String vraag : vragen) {
            enquete.voegVraagToe(vraag);
        }

        // Display the questions
        System.out.println(enquete.toonVragen());
    }
}