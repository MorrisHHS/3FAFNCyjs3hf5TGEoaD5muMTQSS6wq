import java.util.Scanner;

public class GameListMenu extends Menukeuze {

    public GameListMenu(String naam) {
        super(naam);
    }

    @Override
    public void toonMenukeuze() {
        Scanner scanner = new Scanner(System.in);
        String antwoord = scanner.nextLine();
        System.out.println("Wilt u een genre kiezen?(y/n)");

        if (antwoord.equals("y")) {
            for (Game game : Game.list) {
                System.out.println("Game naam: " + game.naam);
                System.out.println("Prijs: €" + game.prijs);
                System.out.println();
            }
        }
        else {
            System.out.println("Kies een genre: \n 1. RPG \n 2. Puzzel \n 3. Strategie");
            for (Game game : Game.list) {
                int keuze = scanner.nextInt();
                switch (keuze){
                    case 1:
                        if(game.genre.equals("RPG")) {
                            System.out.println(game.genre);
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }

            }
        }

        System.out.println(" ");
        System.out.println(naam + ":");
        menu.toonMenu();
    }
}