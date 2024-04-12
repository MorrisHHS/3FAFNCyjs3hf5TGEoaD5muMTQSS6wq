import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Menukeuze> menukeuzes = new ArrayList<>();
    public ArrayList<Menukeuze> tijdelijkeKeuzes = new ArrayList<>();

    public void toonMenu() {

        ArrayList<Menukeuze> keuzes = new ArrayList<>();
        for (Menukeuze mk : tijdelijkeKeuzes){
            keuzes.add(mk);
        }
        for (Menukeuze mk : menukeuzes){
            keuzes.add(mk);
        }

        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        for (Menukeuze mk : tijdelijkeKeuzes) {
            System.out.println("[" + counter + "] " + mk.naam);
            counter++;
        }

        System.out.println();

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


            if (keuze > keuzes.size() - 1 ||
                    keuze < 0){
                System.out.print("Voer een geldig getal in: ");
            }
            else {
                keuzeGemaakt = true;
            }
            firstLoop = false;
        }
        keuzes.get(keuze).toonMenukeuze();
    }


    public void voegKeuzeToe(Menukeuze menu){
        menukeuzes.add(menu);
    }
}


