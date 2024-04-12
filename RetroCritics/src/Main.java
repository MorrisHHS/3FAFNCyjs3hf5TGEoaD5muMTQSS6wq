import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SaveManager.initialize(); // DO NOT REMOVE DIS LINE BITCH

        Menukeuze mainMenu = new MainMenu("Main Menu");
        Menukeuze gameListMenu = new GameListMenu("Game List Menu");
        Menukeuze gameMenu = new GameMenu("Game Menu");
        Menukeuze saleMenu = new SaleMenu("Sale Menu");

        mainMenu.menu.voegKeuzeToe(gameListMenu);
        mainMenu.menu.voegKeuzeToe(saleMenu);
        gameListMenu.menu.voegKeuzeToe(gameMenu);
        gameListMenu.menu.voegKeuzeToe(mainMenu);
        gameListMenu.menu.voegKeuzeToe(saleMenu);
        gameMenu.menu.voegKeuzeToe(mainMenu);
        gameMenu.menu.voegKeuzeToe(gameListMenu);

        mainMenu.toonMenukeuze();

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