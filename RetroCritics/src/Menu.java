import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Menukeuze> menukeuzes = new ArrayList<>();

    public void toonMenu() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (Menukeuze mk : menukeuzes) {
            System.out.println("[" + counter + "] " + mk.naam);
            counter++;
        }

        int keuze = -1;
        boolean keuzeGemaakt = false;
        boolean firstLoop = true;

        while (!keuzeGemaakt){
            if (firstLoop){
                System.out.print("Maak een keuze: ");
            }

            try{
                keuze = new Scanner(System.in).nextInt();
            }
            catch (Exception e){

            }


            if (keuze > menukeuzes.size() - 1 ||
                    keuze < 0){
                System.out.print("Voer een geldig getal in: ");
            }
            else {
                keuzeGemaakt = true;
            }
            firstLoop = false;
        }
        menukeuzes.get(keuze).toonMenukeuze();
    }

    public void voegKeuzeToe(Menukeuze menu){
        menukeuzes.add(menu);
    }
}


