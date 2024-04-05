import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public ArrayList<Menukeuze> menukeuzes = new ArrayList<>();
    public void toonMenu() {
        Scanner scanner = new Scanner(System.in);
        int keuze = 0;

        while (!(keuze ==menukeuzes.size() - 1)){
            System.out.println("Menu:");

            for (Menukeuze mk : menukeuzes) {


            }
        }
    }
    public void voegKeuzeToe(Menukeuze menu){

    }
}

