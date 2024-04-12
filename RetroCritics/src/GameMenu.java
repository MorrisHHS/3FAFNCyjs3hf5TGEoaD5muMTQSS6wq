import java.util.Scanner;

public class GameMenu extends Menukeuze{

    public Game game;

    public GameMenu(String naam) {
        super(naam);
    }

    @Override
    public void toonMenukeuze() {

        System.out.println(" ");
        System.out.println(game.naam + ":");
        System.out.println("Prijs: " + ((double)game.prijs / 100));

        Review rev = new Review(new Scanner(System.in));

        menu.toonMenu();
    }
}
