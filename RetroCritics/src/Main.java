import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SaveManager.initialize(); // DO NOT REMOVE DIS LINE BITCH

        for (Game g : Game.list){
            System.out.println("Naam : " + g.naam);
            System.out.println("Genre: " + g.genre);
            System.out.println("Prijs: " + g.prijs);
            System.out.println();
            System.out.println("Reviews: ");

            for (Review r : g.reviews){

                System.out.println(r.titel);
                System.out.println(r.toelichting);
                System.out.println();
            }
        }
    }
}