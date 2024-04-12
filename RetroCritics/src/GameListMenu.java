import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class GameListMenu extends Menukeuze {

    public GameListMenu(String naam) {
        super(naam);
    }

    @Override
    public void toonMenukeuze() {
        System.out.println(" ");
        System.out.println(naam + ":");


        Scanner scanner = new Scanner(System.in);
        //Game.list.sort(Comparator.comparingDouble(Game::berekenGemiddeldeScore).reversed());
        System.out.println("Wilt u een genre kiezen?(y/n)");
        String antwoord = scanner.nextLine();
        if (antwoord.equals("y")) {
            boolean isGenre = true;
            int keuze = 0;
            while (isGenre) {
                System.out.println("Kies een genre: \nRPG(1) \nPuzzel(2) \nStrategie(3) \nFPS(4)");
                keuze = scanner.nextInt();
                if (keuze > 0 && keuze <= 4) {
                    isGenre = false;
                } else {
                    System.out.println("Voer een geldige keuze in");
                }
            }
            int counter = 0;
            for (Game game : Game.list) {

                switch (keuze) {
                    case 1:
                        if (game.genre.equals("RPG")) {

                            counter++;
                            System.out.println("[" + counter + "] Game naam: " + game.naam);
                            System.out.println("Prijs: " + game.prijs);
                            System.out.println();
                        }
                        break;
                    case 2:
                        if (game.genre.equals("Puzzel")) {

                            counter++;
                            System.out.println("[" + counter + "] Game naam: " + game.naam);
                            System.out.println("Prijs: " + game.prijs);
                            System.out.println();
                        }
                        break;
                    case 3:
                        if (game.genre.equals("Strategie")) {

                            counter++;
                            System.out.println("[" + counter + "] Game naam: " + game.naam);
                            System.out.println("Prijs: " + game.prijs);
                            System.out.println();
                        }
                        break;
                    case 4:
                        if (game.genre.equals("FPS")) {

                            counter++;
                            System.out.println("[" + counter + "] Game naam: " + game.naam);
                            System.out.println("Prijs: " + game.prijs);
                            System.out.println();
                        }
                    default:
                        counter++;
                        break;
                }
            }
            counter++;
            System.out.println("[ " + counter + "] Main Menu");
            int getal = scanner.nextInt();
            scanner.nextLine();

            if (getal > 0 && 30 >= getal) {
                getal--;
                Game.list.get(getal);
            }
        }

        else {
            int counter = 0;
            for (Game game : Game.list) {

                counter++;
                System.out.println("[" + counter + "] Game naam: " + game.naam);
                System.out.println("Prijs: " + game.prijs);
                System.out.println();
            }
            counter++;
            System.out.println("[ " + counter + "] Main Menu");
            int getal = scanner.nextInt();
            scanner.nextLine();
            if (getal >0 && 30 >=getal) {
                getal--;
                Game.list.get(getal).reviews.add(new Review(scanner));

            }
            menu.toonMenu();
        }


    }
}