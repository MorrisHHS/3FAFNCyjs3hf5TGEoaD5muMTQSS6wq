import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SaveManager.initialize(); // DO NOT REMOVE DIS LINE BITCH

        //Scanner s = new Scanner(System.in);
        //Review rev = new Review(s);

        Menukeuze mainMenu = new MainMenu("Main Menu");
        Menukeuze gameListMenu = new GameListMenu("Game List Menu");
        Menukeuze gameMenu = new GameMenu("Game Menu");
        Menukeuze saleMenu = new SaleMenu("Sale Menu");

        mainMenu.menu.voegKeuzeToe(gameListMenu);
        mainMenu.menu.voegKeuzeToe(saleMenu);
        gameListMenu.menu.voegKeuzeToe(mainMenu);
        gameListMenu.menu.voegKeuzeToe(saleMenu);
        gameMenu.menu.voegKeuzeToe(mainMenu);
        gameMenu.menu.voegKeuzeToe(gameListMenu);

        saleMenu.menu.voegKeuzeToe(mainMenu);

        mainMenu.toonMenukeuze();


    }
}