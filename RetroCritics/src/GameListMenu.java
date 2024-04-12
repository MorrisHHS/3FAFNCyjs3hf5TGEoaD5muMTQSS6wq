import java.util.Scanner;

public class GameListMenu extends Menukeuze {

    public GameListMenu(String naam) {
        super(naam);
    }

    @Override
    public void toonMenukeuze() {
        System.out.println(" ");
        System.out.println(naam + ":");
        //menu.toonMenu();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wilt u een genre kiezen?(y/n)");
        String antwoord = scanner.nextLine();
        if (antwoord.equals("y")) {
            boolean isGenre = true;
            int keuze = 0;
            while (isGenre) {
                System.out.println("Kies een genre: \n 1. RPG \n 2. Puzzel \n 3. Strategie \n 4. FPS");
                keuze = scanner.nextInt();
                if (keuze > 0 && keuze <= 4) {
                    isGenre = false;
                }
                else {
                    System.out.println("Voer een geldige keuze in");
                }
            }
            for (Game game : Game.list) {


                switch (keuze) {
                    case 1:
                        if (game.genre.equals("RPG")) {
                            System.out.println("Game naam: " + game.naam);
                            System.out.println("Prijs: €" + game.prijs);
                            System.out.println();
                        }
                        break;
                    case 2:
                        if (game.genre.equals("Puzzel")) {
                            System.out.println("Game naam: " + game.naam);
                            System.out.println("Prijs: €" + game.prijs);
                            System.out.println();
                        }
                        break;
                    case 3:
                        if (game.genre.equals("Strategie")) {
                            System.out.println("Game naam: " + game.naam);
                            System.out.println("Prijs: €" + game.prijs);
                            System.out.println();
                        }
                        break;
                    case 4:
                        if (game.genre.equals("FPS")) {
                            System.out.println("Game naam: " + game.naam);
                            System.out.println("Prijs: €" + game.prijs);
                            System.out.println();
                        }
                    default:
                        break;
                }
            }
        }
        else {
            for (Game game : Game.list) {
                System.out.println("Game naam: " + game.naam);
                System.out.println("Prijs: €" + game.prijs);
                System.out.println();
            }

        }

    }
}