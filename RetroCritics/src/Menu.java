import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public ArrayList<Menukeuze> menukeuzes;
    public void toonMenu(){
Scanner scanner = new Scanner (System.in);
int keuze = 0;

while(keuze !4) {
    System.out.println("Menu:");
    System.out.println("Maak een keuze");
    System.out.println("1. Games bekijken");
    System.out.println("2. Game reviewen");
    System.out.println("3. Uitverkoop");
    System.out.println("4. Afsluiten");

    if(scanner.hasNextInt()) {
        keuze = scanner.nextInt();
        scanner.nextLine();
    }
        }
    }
    public void voegKeuzeToe(Menukeuze menu){

    }
}

