import java.util.ArrayList;
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

        ArrayList<Menukeuze> gameMenus = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Collections.sort(Game.list, Comparator.comparingDouble(Game::berekenGemiddeldeScore).reversed());
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
                }
                else {
                    System.out.println("Voer een geldige keuze in");
                }
            }



            for (Game game : Game.list) {

                switch (keuze) {
                    case 1:
                        if (game.genre.equals("RPG")) {
                            GameMenu gameMenu = new GameMenu(game.naam);
                            gameMenu.game = game;
                            gameMenu.menu.voegKeuzeToe(this);



                            // Voeg hier andere dingen toe voor de game menu

                            gameMenus.add(gameMenu);
                        }
                        break;
                    case 2:
                        if (game.genre.equals("Puzzel")) {
                            GameMenu gameMenu = new GameMenu(game.naam);
                            gameMenu.game = game;
                            gameMenu.menu.voegKeuzeToe(this);

                            gameMenus.add(gameMenu);
                        }
                        break;
                    case 3:
                        if (game.genre.equals("Strategie")) {
                            GameMenu gameMenu = new GameMenu(game.naam);
                            gameMenu.game = game;
                            gameMenu.menu.voegKeuzeToe(this);

                            gameMenus.add(gameMenu);
                        }
                        break;
                    case 4:
                        if (game.genre.equals("FPS")) {
                            GameMenu gameMenu = new GameMenu(game.naam);
                            gameMenu.game = game;
                            gameMenu.menu.voegKeuzeToe(this);

                            gameMenus.add(gameMenu);

                        }
                    default:
                        break;
                }


            }
        }
        else {

            for (Game game : Game.list) {
                System.out.println("Game naam: " + game.naam);
                System.out.println("Prijs: " + game.prijs);
                System.out.println();
            }

        }
        menu.tijdelijkeKeuzes = gameMenus;
        menu.toonMenu();

    }
}